parser grammar TypeScriptParser;

options {
    tokenVocab = TypeScriptLexer;
}

program
    : statement+
    ;

statement
    : importStatement ( ',' importStatement)*
    | componentDeclaration
    ;

importStatement
    : Import importFromBlock eos?
    ;

importFromBlock
    : OpenBrace (importModule (','importModule)* | importAlias) CloseBrace importFrom
    | StringLiteral eos?
    ;

importAlias
    : (importModule|'*') (As Identifier)?
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
    : 'standalone' ':' ('true'|'false')
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
htmlNode : htmlElements
         ;
htmlElements : htmlElement+
             ;

htmlElement
    : '<' htmlTagName htmlAttribute* '>' htmlContent '<' '/' htmlTagName '>'
    | '<' htmlTagName htmlAttribute* htmlContent '/' '>'
    | '<' htmlTagName htmlAttribute* '/' '>'
    | '<' htmlTagName htmlAttribute* '>'
    ;
htmlTagName : Identifier;
htmlContent:singleExpression
           ;

singleExpression:htmlElement
                |Identifier
                ;
htmlAttribute
    : htmlAttributeName ('=' htmlAttributeValue)?
    ;

htmlAttributeName
        : TagName
        | Identifier ('-' Identifier)* // 2020/10/28 bugfix: '-' is recognized as MINUS and TagName is splited by '-'.
        ;
htmlAttributeValue
    : AttributeValue
    | StringLiteral
    ;

eos
    : SemiColon
    | EOF
    ;
