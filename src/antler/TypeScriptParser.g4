parser grammar TypeScriptParser;

options {
    tokenVocab = TypeScriptLexer;
}

program
    : statement  + EOF
    ;


statement
    : importStatement (Comma importStatement)* eos?
    | componentDeclaration
    | htmlNode
    | classDeclaration
    |block
    ;

importStatement
    : Import importFromBlock
    ;

importFromBlock
    : OpenBrace (importModule ((Comma importModule)* | importAlias)) CloseBrace importFrom
    | StringLiteral
    ;

importAlias
    : (importModule | Multiply) (As Identifier)?
    ;

importModule
    : Component
    | CommonModule
    | Identifier
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
    : selectorProperty
    | standaloneProperty
    | importsProperty
    | templateProperty
    | stylesProperty
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

htmlElement
    : LessThan htmlTagName htmlAttribute* MoreThan htmlContent* LessThan Divide htmlTagName MoreThan
    | LessThan htmlTagName htmlAttribute* SelfCloseTag
    ;

htmlTagName
    : Identifier
    ;

htmlContent
    : htmlElement
    | StringLiteral
    | DoubleLeftBrace expressionhtml DoubleRightBrace
    ;

htmlAttribute
    : standardAttribute
    | boundAttribute
    | eventAttribute
    | directiveAttribute
    ;

standardAttribute
    : (Identifier|expression) (Minus Identifier)* (Equal htmlAttributeValue)?
    ;

boundAttribute
    : OpenBracket attributeName CloseBracket Equal htmlAttributeValue
    ;

attributeName
    : (Identifier|expression) ((Dot | Minus) Identifier)*
    ;

eventAttribute
    : OpenParen Identifier CloseParen Equal htmlAttributeValue
    ;

directiveAttribute
    : Multiply Identifier Equal htmlAttributeValue
    ;

htmlAttributeValue
    : StringLiteral
    | expression
    ;

expressionhtml
    : primaryExpressionhtml (Dot primaryExpressionhtml)*
    ;

primaryExpressionhtml
    : Identifier
    ;


//  TypeScript logic/////////////////////////////////////////////////////////////////////////////////////
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
    : OpenBrace statements* CloseBrace
    ;

statements
    : assignment
    | expressionStatement
    | ifStatement
    | forStatement
    | whileStatement
    | returnStatement
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

expression
    : expression binaryOperator expression        # binaryExpr
    | unaryOperator expression                     # unaryExpr
    | primary (memberAccess)*                      # memberExpr
    | CLASS                                        #classexp
//    | Identifier (memberAccess)*                                # idExpression
//    | literal                                                   # literalExpr
//    | arrayLiteral                                              # arrayExpr
//    | objectLiteral                                             # objectExpr
//    | OpenParen expression CloseParen                           # parenExpr
    ;


primary
    : THIS                                        # thisExpr
    | Identifier                                  # idExpr
    | objectLiteral                               # objectExpr
    | arrayLiteral                                # arrayExpr
    | literal                                     # literalExpr
    | OpenParen expression CloseParen             # parenExpr
    ;

binaryOperator
    : Plus | Minus | Multiply | Divide | MOD
    | MoreThan | LessThan | GTE | LTE
    | LooseEqual | LooseNotEqual |Equal
    | And | Or
    ;

unaryOperator
    : Not | Plus | Minus
    ;
memberAccess
    : (Dot Identifier | OpenBracket expression CloseBracket)+
    ;

literal
    : NumberLiteral
    | StringLiteral
    | objectLiteral
    | arrayLiteral
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

