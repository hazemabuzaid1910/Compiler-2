lexer grammar TypeScriptLexer;

Import        : 'import' ;
From          : 'from' ;
Component     : 'Component' ;
CommonModule  : 'CommonModule';
SELECTOR      : 'selector';
STANDALONE    : 'standalone';
IMPORTS       : 'imports';
TEMPLATE      : 'template';
STYLES        : 'styles';
TRUE          : 'true';
FALSE         : 'false';
SemiColon     : ';' ;
Comma         : ',';
OpenBrace     : '{' ;
CloseBrace    : '}' ;
As            : 'as';
Star          : '*';
AT_Component  : '@Component';
AT            : '@';
OpenParen     : '(';
CloseParen    : ')';
OpenBracket   : '[';
CloseBracket  : ']';
Colon         : ':';
BackTick      : '`' ;
Minus         : '-';
LessThan      : '<';
MoreThan      : '>';
Divide        : '/';

Identifier: IdentifierStart IdentifierPart*;
StringLiteral: '\'' (~['\r\n])* '\'' | '"' (~["\r\n])* '"';

fragment IdentifierStart: [\p{L}] | [$_] ;
fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}] | '\u200C' | '\u200D';

TAG_OPEN: '<' TAG_NAME;
TAG_END: '</' TAG_NAME '>';
TAG_SELF_CLOSE: '/>';

TAG_NAME: [a-zA-Z][a-zA-Z0-9-]*;

ATTRIBUTE_NAME: [a-zA-Z_][a-zA-Z0-9_-]*;

EQUALS_SIGN: '=';

ATTRIBUTE_VALUE: '"' .*? '"' | '\'' .*? '\'';

ANGULAR_BINDING: '{{' .*? '}}';
ANGULAR_DIRECTIVE: ('*' | '[' | '(') [a-zA-Z0-9_-]+ ('=' | ']');


WS: [ \t\r\n]+ -> skip;
