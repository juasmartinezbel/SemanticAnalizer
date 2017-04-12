grammar MyLanguage;
qb64		: instr* EOF;
instr		: decl|print;

decl		: dim | 'const' sufdecl | sufdecl;
dim			: 'dim' shared ID par 'as' TYPE;
shared		: 'shared'| ;
sufdecl		: idn EQUAL expr;
idn			: ID suf;
suf 		: (SUF | ) (par);
par 		: (PIZQ pos (COMMA pos)* PDER)|;
pos			: expr;

print		: 'print' toprintfst ;
toprintfst	: PYC expr toprint | expr toprint ;
toprint 	: PYC expr toprint |;

expr:	PIZQ expr PDER
	|	NEG expr
	|	POT expr
	|	expr MULT expr
    |	expr ADD expr
    |	expr REL expr
    |	expr equdi expr
    |	expr AND expr
    | 	expr OR expr
    |	value
    ;
equdi 	: (EQUAL|DIF);
value	: (INTEGER|LONG|DOUBLE|SINGLE|INTEGER|STRING|idn);

COMMENT 	:'\'' ~[\r\n]* -> skip;
WS			: [ \t\r\n]+ -> skip ;
PIZQ		: '(';
PDER		: ')';
NEG			: 'not';
POT			: '^' ;
MULT		: ('*'|'/'|'mod');
ADD			: ('+'|'-');
REL			: ( '<' | '<=' | '>' | '>=');
EQUAL		: '=';
DIF			: '<>';
AND			: ('and');
OR			: ('or'|'xor');
PYC			: ';';
COMMA		: ',';
SUF 		: ('&'|'!'|'%'|'#'|'$');
TYPE		: ('string'|'double'|'single'|'long'|'integer') ;
INTEGER		: ([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|[0-3][0-2][0-7][0-6][0-7]);
LONG		: [0-9]+;
SINGLE		: [0-9]+[.] ([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|[0-9][0-9][0-9][0-9][0-9]);
DOUBLE		: [0-9]+[.]([0-9]+);
STRING		: '"' ~[\r\n]* '"';
ID			: [a-zA-Z][a-zA-Z0-9_]*;
