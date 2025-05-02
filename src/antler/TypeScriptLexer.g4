lexer grammar TypeScriptLexer;

// Symbols and operators
DoubleLeftBrace      : '{{' ;
DoubleRightBrace     : '}}' ;
SemiColon            : ';' ;
Comma                : ',' ;
OpenBrace            : '{' ;
CloseBrace           : '}' ;
OpenParen            : '(' ;
CloseParen           : ')' ;
OpenBracket          : '[' ;
CloseBracket         : ']' ;
Colon                : ':' ;
BackTick             : '`' ;
Minus                : '-' ;
LessThan             : '<' ;
MoreThan             : '>' ;
Divide               : '/' ;
SelfCloseTag         : '/>' ;
Dot                  : '.' ;
Question             : '?' ;
DoubleQuestion       : '??' ;
Not                  : '!' ;
Equal                : '=' ;
StrictEqual          : '===' ;
LooseEqual           : '==' ;
StrictNotEqual       : '!==' ;
LooseNotEqual        : '!=' ;
And                  : '&&' ;
Or                   : '||' ;
Plus                 : '+' ;
Multiply             : '*' ;

// Keywords
Import               : 'import' ;
From                 : 'from' ;
As                   : 'as' ;
Component            : 'Component' ;
CommonModule         : 'CommonModule' ;
AT_Component         : '@Component' ;
AT                   : '@' ;

// Properties
SELECTOR             : 'selector' ;
STANDALONE           : 'standalone' ;
IMPORTS              : 'imports' ;
TEMPLATE             : 'template' ;
STYLES               : 'styles' ;

// Literals
BooleanLiteral       : 'true' | 'false' ;
NumberLiteral        : [0-9]+ ('.' [0-9]+)? ;

StringLiteral
    : '\'' (~['\r\n])* '\''
    | '"' (~["\r\n])* '"'
    ;

// Identifiers
Identifier
    : IdentifierStart IdentifierPart*
    ;

fragment IdentifierStart
    : [\p{L}] | [$_]
    ;

fragment IdentifierPart
    : IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}] | '\u200C' | '\u200D'
    ;

// Whitespace
WS : [ \t\r\n]+ -> skip ;
