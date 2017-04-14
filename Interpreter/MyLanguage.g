grammar MyLanguage;
qb64		: instr* functionsub* EOF;
instr		: decl
			|print
			|input
			|ifc
			|forc
			|selectc
			|whilec
			|doc
			|call;

functionsub : fun
			| sub;

decl		: dim | 'const' sufdecl | sufdecl;
dim			: 'dim' shared idim (COMMA idim)* 'as' TYPE;
shared		: 'shared'| ;
idim 		:  ID par;

sufdecl		: idn EQUAL expr;
idn			: ID suf;
suf 		: sufix (par);
sufix 		: (SUFN | SUFS |);
par 		: (PIZQ pos postn* PDER)|;
postn		: COMMA pos ;
pos			: expr;

print		: 'print' toprintfst ;
toprintfst	: toprint* | expr toprint* ;
toprint 	: PYC expr;

input		: 'input' inpara;
inpara		: (STRING COMMA idn (inpn)* | idn (inpn)*);
inpn		: COMMA idn;

ifc 		: 'if' expr 'then' instr* ifter;
ifter		: 'elseif' expr 'then' instr* ifter 
			| 'else' instr* 'end' 'if'
			| 'end' 'if';

forc		: 'for'	forexpr tofor step instr* 'next';
forexpr		: ID forsuf EQUAL tothis;
forsuf		: (SUFN|);
tothis		: expr;
tofor 		: 'to' tothis;
step		: ('step' tothis|);

selectc		: 'select' 'case' idn cases* caselse 'end' 'select';
cases		: 'case' valuev instr*;
caselse		: ('case' 'else' instr*| );

whilec		: 'while' expr instr* 'wend';

doc			: 'do' instr* 'loop' tdoc;
tdoc		: ('while'|'until')expr;

fun			: 'function' funidn instr* 'end' 'function';
funidn		: ID sufix parfu;

sub			:'sub' subidn instr* 'end' 'sub';
subidn 		: ID parfu;

parfu		: (PIZQ arg PDER|);
arg 		: (ID sufix| ID argpa) (COMMA arg)*;
argpa 		: PIZQ PDER (('as' (TYPE|))|);
argn		: COMMA;

call 		: ID callarg;
callarg 	: expr calln*|;
calln		: COMMA expr;

expr:	PIZQ expr PDER
	|	neg expr
	|	expr POT expr
	|	expr MULT expr
    |	expr addi expr
    |	expr REL expr
    |	expr equdi expr
    |	expr AND expr
    | 	expr OR expr
    |	value
    ;
    
equdi 	: (EQUAL|DIF);
neg 	: (NEG|MINUS);
addi	: (ADD|MINUS);
valuev	: (INTEGER|LONG|SINGLE|DOUBLE|STRING);
value	: (valuev|idnp);
idnp	: ID sufix (par|PIZQ PDER|);

COMMENT 	:'\'' ~[\r\n]* -> skip;
WS			: [ \t\r\n]+ -> skip ;
PIZQ		: '(';
PDER		: ')';
NEG			: 'not';
MINUS		: '-';
POT			: '^' ;
MULT		: '*'|'/'|'mod';
ADD			: '+';
REL			: ( '<' | '<=' | '>' | '>=');
EQUAL		: '=';
DIF			: '<>';
AND			: 'and';
OR			: ('or'|'xor');
PYC			: ';';
COMMA		: ',';
SUFS 		: '$';
SUFN 		: ('&'|'!'|'%'|'#');
TYPE		: ('string'|'double'|'single'|'long'|'integer') ;
STRING		: '\"' ~[\r\n\"]* '\"';
INTEGER		: ([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|[0-3][0-2][0-7][0-6][0-7]);
LONG		: [0-9]+;
SINGLE		: [0-9]+[.] ([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|[0-9][0-9][0-9][0-9][0-9]);
DOUBLE		: [0-9]+[.]([0-9]+);
ID			: ([a-z]|[A-Z]|[a-zA-Z][a-zA-Z0-9_]*);
