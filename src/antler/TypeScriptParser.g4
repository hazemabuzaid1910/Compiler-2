parser grammar TypeScriptParser;

options {
    tokenVocab = TypeScriptLexer;
}

program
    : statement  + EOF
    ;


statement
    : importStatement (Comma importStatement)* eos?    #ImportState
    | componentDeclaration                             #ComponentState
    | htmlNode                                         #HtmlNodeState
    | classDeclaration                                 #ClassState
    | block                                            #BlockState
    ;

importStatement
    : Import importFromBlock
    ;

importFromBlock
    : OpenBrace ((importModule (Comma importModule)*) | importAlias) CloseBrace importFrom  #ImportFromBlock1
    | StringLiteral                                                                         #ImportFromBlock2
    ;

importAlias
    : Multiply As Identifier        #ImportAlias1
    | importModule As Identifier    #ImportAlias2
    ;

importModule
    : Component     #ComponentMod
    | CommonModule  #CommonModuleMod
    | Identifier    #IdentifierMod
    ;

importFrom
    : From StringLiteral
    ;

componentDeclaration
    : AT_Component OpenParen componentMetadata CloseParen eos?
    ;

componentMetadata
    : OpenBrace componentProperty (Comma componentProperty)* CloseBrace
    ;

componentProperty
    : selectorProperty      #SelectProperty
    | standaloneProperty    #StandalonProperty
    | importsProperty       #ImportProperty
    | templateProperty      #TemplatProperty
    | stylesProperty        #StyleProperty
    ;

selectorProperty
    : SELECTOR Colon StringLiteral
    ;

standaloneProperty
    : STANDALONE Colon BooleanLiteral
    ;

importsProperty
    : IMPORTS Colon OpenBracket importModule ((Comma importModule)*)? CloseBracket
    ;

templateProperty
    : TEMPLATE Colon BackTick htmlNode BackTick
    ;

stylesProperty
    : STYLES Colon OpenBracket (StringLiteral (Comma StringLiteral)*)? CloseBracket
    ;

// html
htmlNode
    : htmlElements
    ;

htmlElements
    : htmlElement+
    ;

htmlElement: htmlPairTag  #HtmlPair
           | htmlSingleTag #HtmlSingle
           ;

 htmlPairTag:
           LessThan htmlTagName htmlAttribute* MoreThan htmlContent* LessThan Divide htmlTagName MoreThan
               ;
htmlSingleTag:
             LessThan htmlTagName htmlAttribute* SelfCloseTag
             ;



htmlTagName
    : Identifier
    ;

htmlContent
    : htmlElement                                        #WrapHtml
    | DoubleLeftBrace expressionhtml DoubleRightBrace    #MostacheExp
    | Identifier                                               #Text

    ;

htmlAttribute
    : standardAttribute        #StandardAttr
    | boundAttribute           #BoundAttr
    | eventAttribute           #EventAttr
    | directiveAttribute       #DirectAttr
    | twoWayBindingAttribute   #TwoWayAttr
    ;

standardAttribute
    : (Identifier|CLASS) (Minus Identifier)* (Equal htmlAttributeValue)?
    ;

boundAttribute
    : OpenBracket attributeName CloseBracket Equal htmlAttributeValue
    ;

attributeName
    : (Identifier|CLASS) ((Dot | Minus) Identifier)*
    ;

eventAttribute
    : OpenParen Identifier CloseParen Equal htmlAttributeValue
    ;

directiveAttribute
    : Multiply Identifier Equal htmlAttributeValue
    ;

twoWayBindingAttribute
    : OpenBracket OpenParen NGMODEL CloseParen CloseBracket Equal htmlAttributeValue
    ;

htmlAttributeValue
    : StringLiteral   #HtmlAttributeValueString
    | expression      #HtmlAttributeValueExp
    ;

expressionhtml
    : primaryExpressionhtml (Dot primaryExpressionhtml)*
    ;

primaryExpressionhtml
    : Identifier
    ;

//tupe script
classDeclaration
    : EXPORT? CLASS Identifier OpenBrace classBody CloseBrace
    ;

classBody
    : classMember*
    ;

classMember
    : propertyDeclaration
    | methodDeclaration
    ;

propertyDeclaration
    : Identifier Equal expression SemiColon?
    ;

methodDeclaration
    : Identifier OpenParen parameterList? CloseParen typeAnnotation? block
    ;

parameterList
    : parameter (Comma parameter)*
    ;

parameter
    : Identifier typeAnnotation?
    ;

typeAnnotation
    : Colon typeName
    ;

typeName
    : unionType
    ;

unionType
    : primaryType (Or primaryType)*
    ;

primaryType
    : ANY| STRING| NUMBER
    | BOOLEAN| VOID
    | UNKNOWN| NEVER
    | OBJECT| Identifier
    ;

block
    : OpenBrace statements+ CloseBrace
    ;

statements
    : assignment            #Assign
    | expressionStatement   #ExpressionState
    | ifStatement           #IfState
    | forStatement          #ForState
    | whileStatement        #WhileState
    | returnStatement       #ReturnState
    | setlocalstorage       #SetLocal
    | pusharray             #Push
    ;

assignment
    : expression Equal expression SemiColon
    ;

expressionStatement
    : expression SemiColon
    ;

ifStatement
    : IF OpenParen expression CloseParen block (ELSE block)?
    ;

forStatement
    : FOR OpenParen (variableDeclaration | expressionStatement |) SemiColon expression? SemiColon expression? CloseParen block
    ;

variableDeclaration
    : LET Identifier Equal expression
    ;


whileStatement
    : WHILE OpenParen expression CloseParen block
    ;

returnStatement
    : RETURN expression? SemiColon
    ;
getlocalstorage:LOCALSTORAGE'.'GETITEM'(' StringLiteral ')'
               ;
setlocalstorage:LOCALSTORAGE'.'SETITEM'(' StringLiteral ',' JSON'.'STRINGIFY'('Identifier')' ')'
               ;
parselocalstorage: JSON '.' PARSE '(' expression ')'
                 ;
expression
    : expression binaryOperator expression         #BinaryExpr
    | unaryOperator expression                     #UnaryExpr
    | primary (memberAccess)*                      #MemberExpr
    | CLASS                                        #Classexp
    | parselocalstorage                            #ParseLocal
    | getlocalstorage                              #GetLocal
    ;


primary
    : THIS                                        # ThisExpr
    | keywords ? Identifier                       # IdExpr
    | objectLiteral                               # ObjectExpr
    | arrayLiteral                                # ArrayExpr
    | literal                                     # LiteralExpr
    | OpenParen expression CloseParen             # ParenExpr
    ;
 keywords: CONST | LET |VAR
         ;
pusharray: Identifier'.'PUSH'(''{'REST expression'}'')'';'
         ;
binaryOperator
    : Plus | Minus | Multiply | Divide | MOD
    | MoreThan | LessThan | GTE | LTE
    | LooseEqual | LooseNotEqual |Equal
    | And | Or |Dot
    ;

unaryOperator
    : Not | Plus | Minus
    ;
memberAccess
    : (Dot Identifier | OpenBracket expression CloseBracket)+
    ;

literal
    : NumberLiteral   #NumberLiteral
    | StringLiteral   #StringLiteral
    | objectLiteral   #ObjectLitera
    | arrayLiteral    #ArrayLitera
    ;

objectLiteral
    : OpenBrace (propertyAssignment (Comma propertyAssignment)* Comma?)? CloseBrace
    ;

propertyAssignment
    : Identifier Colon expression
    ;

arrayLiteral
    : OpenBracket (expression (Comma expression)* Comma?)? CloseBracket
    ;
eos
    : SemiColon
    | EOF
    ;


