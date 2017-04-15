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

decl		: dim | ('const'|'CONST') sufdecl | sufdecl;
dim			: ('dim'|'DIM') shared idim (COMMA idim)* ('as'|'AS') TYPE;
shared		: 'shared'|'SHARED'| ;
idim 		:  ID par;

sufdecl		: idn EQUAL expr;
idn			: ID sufix (par);
sufix 		: (SUFN | SUFS |);
par 		: (PIZQ pos (COMMA pos)* PDER)|;
pos			: expr;

print		: ('print'|'PRINT') toprintfst ;
toprintfst	: expr toprint* | toprint* ;
toprint 	: PYC expr;

input		: ('input'|'INPUT') inpara;
inpara		: (idn (COMMA idn)*|STRING COMMA idn (COMMA idn)* );

ifc 		: ('if'|'IF') expr ('then'|'THEN') instr* ifter;
ifter		: ('elseif'|'ELSEIF') expr ('then'|'THEN') instr* ifter 
			| ('ELSE'|'else') instr* ('end'|'END') ('if'|'IF')
			| ('end'|'END') ('if'|'IF');

forc		: ('for'|'FOR')	forexpr tofor step instr* ('next'|'NEXT');
forexpr		: ID forsuf EQUAL tothis;
forsuf		: (SUFN|);
tothis		: expr;
tofor 		: ('to'|'TO') tothis;
step		: (('step'|'STEP') tothis|);

selectc		: ('select'|'SELECT') ('case'|'CASE') idn cases* caselse ('end'|'END') ('select'|'SELECT');
cases		: ('case'|'CASE') valuev instr*;
caselse		: (('case'|'CASE') ('else'|'ELSE') instr*| );

whilec		: 'while' expr instr* 'wend';

doc			: 'do' instr* 'loop' tdoc;
tdoc		: ('while'|'until'|'WHILE'|'UNTIL')expr;

fun			: ('function'|'FUNCTION') funidn instr* ('end'|'END') ('function'|'FUNCTION');
funidn		: ID sufix parfu;

sub			:('sub'|'SUB') subidn instr* ('end'|'END') ('sub'|'SUB');
subidn 		: ID parfu;

parfu		: (PIZQ arg (COMMA arg)* PDER|);
arg 		: (ID sufix| ID argpa);
argpa 		: PIZQ PDER (('as' (TYPE|))|);
argn		: COMMA;

call 		: ID (expr (COMMA expr)*|);

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
idnp	: idn|ids;
ids		: ID PIZQ PDER;

COMMENT 	:'\'' ~[\r\n]* -> skip;
WS			: [ \t\r\n]+ -> skip ;
PIZQ		: '(';
PDER		: ')';
NEG			: 'not'|'NOT';
MINUS		: '-';
POT			: '^' ;
MULT		: '*'|'/'|'mod'|'MOD';
ADD			: '+';
REL			: ( '<' | '<=' | '>' | '>=');
EQUAL		: '=';
DIF			: '<>';
AND			: 'and'|'AND';
OR			: ('or'|'xor'|'OR'|'XOR');
PYC			: ';';
COMMA		: ',';
SUFS 		: '$';
SUFN 		: ('&'|'!'|'%'|'#');
TYPE		: ('string'|'double'|'single'|'long'|'integer'|'INTEGER'|'LONG'|'SINGLE'|'DOUBLE'|'STRING') ;
STRING		: '\"' ~[\r\n\"]* '\"';
INTEGER		: ([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|[0-3][0-2][0-7][0-6][0-7]);
LONG		: [0-9]+;
SINGLE		: [0-9]+[.] ([0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|[0-9][0-9][0-9][0-9][0-9]);
DOUBLE		: [0-9]+[.]([0-9]+);
ID			: ([a-z]|[A-Z]|[a-zA-Z][a-zA-Z0-9_]*);
