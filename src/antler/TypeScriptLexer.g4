lexer grammar TypeScriptLexer;

// Keywords
Import               : 'import' ;
From                 : 'from' ;
As                   : 'as' ;
Component            : 'Component' ;
CommonModule         : 'CommonModule' ;
AT_Component         : '@Component' ;
AT                   : '@' ;
CLASS                :'class';
// Properties
SELECTOR             : 'selector' ;
STANDALONE           : 'standalone' ;
IMPORTS              : 'imports' ;
TEMPLATE             : 'template' ;
STYLES               : 'styles' ;

//key words for type script
EXPORT        : 'export';
THIS          : 'this';
ANY           : 'any';
BOOLEAN       : 'boolean';
VOID          : 'void';
UNKNOWN       : 'unknown';
NEVER         : 'never';
OBJECT        : 'object';
STRING        : 'string';
NUMBER        : 'number';
IF            :'if';
ELSE          :'else';
FOR           :'for';
WHILE         :'while';
RETURN        :'return';
LET           : 'let';

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
LessThan             : '<' ;
MoreThan             : '>' ;
LTE                  : '<=' ;
GTE                  : '>=' ;
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
Minus                : '-' ;
Divide               : '/' ;
MOD                  : '%' ;
HashTag              : '#';


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
 //مشان الكومنتات
 LINE_COMMENT: '//' ~[\r\n]* -> skip;
 BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace
WS : [ \t\r\n]+ -> skip ;
