parser grammar TypeScriptParser;

options {
    tokenVocab = TypeScriptLexer;
}

program
    : (statement | classDeclaration)+ EOF
    ;


statement
    : importStatement (',' importStatement)* eos?
    | componentDeclaration
    | htmlNode
    ;

importStatement
    : Import importFromBlock
    ;

importFromBlock
    : OpenBrace (importModule ((',' importModule)* | importAlias)) CloseBrace importFrom
    | StringLiteral
    ;

importAlias
    : (importModule | '*') (As Identifier)?
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
    : AT_Component OpenParen componentMetadata CloseParen
    ;

componentMetadata
    : OpenBrace componentProperty (',' componentProperty)* CloseBrace
    ;

componentProperty
    : selectorProperty
    | standaloneProperty
    | importsProperty
    | templateProperty
    | stylesProperty
    ;

selectorProperty
    : 'selector' ':' StringLiteral
    ;

standaloneProperty
    : 'standalone' ':' BooleanLiteral
    ;

importsProperty
    : 'imports' ':' OpenBracket importModule ((',' importModule)*)? CloseBracket
    ;

templateProperty
    : 'template' ':' '`' htmlNode '`'
    ;

stylesProperty
    : 'styles' ':' OpenBracket (StringLiteral (',' StringLiteral)*)? CloseBracket
    ;

// html
htmlNode
    : htmlElements
    ;

htmlElements
    : htmlElement+
    ;

htmlElement
    : '<' htmlTagName htmlAttribute* '>' htmlContent* '<''/' htmlTagName '>'
    | '<' htmlTagName htmlAttribute* '/>'
    | '<' htmlTagName htmlAttribute* '>'
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
    : Identifier ('-' Identifier)* ('=' htmlAttributeValue)?
    ;

boundAttribute
    : '[' attributeName ']' '=' htmlAttributeValue
    ;

attributeName
    : Identifier ((Dot | '-') Identifier)*
    ;

eventAttribute
    : '(' Identifier ')' '=' htmlAttributeValue
    ;

directiveAttribute
    : '*' Identifier '=' htmlAttributeValue
    ;

htmlAttributeValue
    : StringLiteral
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
    : ANY
    | STRING
    | NUMBER
    | BOOLEAN
    | VOID
    | UNKNOWN
    | NEVER
    | OBJECT
    | Identifier
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
    :  expression binaryOperator expression        # binaryExpr
    | unaryOperator expression                                  # unaryExpr
    | primary (memberAccess)*                     # memberExpr
//    | Identifier (memberAccess)*                                # idExpression
//    | literal                                                   # literalExpr
//    | arrayLiteral                                              # arrayExpr
//    | objectLiteral                                             # objectExpr
//    | OpenParen expression CloseParen                           # parenExpr
    ;


primary
    : THIS                                        # thisExpr
    | Identifier                                  # idExpr
    | literal                                     # literalExpr
    | arrayLiteral                                # arrayExpr
    | objectLiteral                               # objectExpr
    | OpenParen expression CloseParen             # parenExpr
    ;

binaryOperator
    : Plus | Minus | Multiply | Divide | MOD
    | MoreThan | LessThan | GTE | LTE
    | LooseEqual | LooseNotEqual
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

