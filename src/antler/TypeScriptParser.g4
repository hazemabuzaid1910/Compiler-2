parser grammar TypeScriptParser;

options {
    tokenVocab = TypeScriptLexer;
}

program
    : statement+ EOF
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
    | DoubleLeftBrace expression DoubleRightBrace
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

expression
    : primaryExpression (Dot primaryExpression)*
    ;

primaryExpression
    : Identifier
    ;

eos
    : SemiColon
    ;
