grammar czabtal;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}
tokens {
	START;
	POLECENIA_FUN;
	DEKL;
	TYP_LOGICZNY;
	IMPORTR;
	NEWLINE;
	DEF;
	IFR;
	PRINTR;
	PRZYP;
	WYR_WARUN;
	ELSER;
	ARGS;
	POlECENIA_FORARGS;
	FORARGS;
	RETURNR;
	IDKI;
}
@members {
    @Override
    public String getErrorHeader(RecognitionException e) {
        return Precompiler.getPositionForLine(e.line);
    }

    @Override
    public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    	String msg = null;
        if(e instanceof NoViableAltException ||
           e instanceof EarlyExitException) {
            String tokenName = e.token.getText();
            if(e.token.getType() == NL)
                tokenName = "\\n";
            msg = "Found unexpected symbol: '" + tokenName + "'.";
        } else if(e instanceof MismatchedTokenException) {
            MismatchedTokenException mte = (MismatchedTokenException)e;
            msg = "Expecting " + tokenNames[mte.expecting];
    	} else if(e instanceof MismatchedTreeNodeException) {
            MismatchedTreeNodeException mte = (MismatchedTreeNodeException)e;
            msg = "Expecting " + tokenNames[mte.expecting];
    	} else {
            msg = super.getErrorMessage(e, tokenNames) + e.getClass();
    	}
    	return msg;
    }
}

@header {
	package czabtal;
}

@lexer::header {
	package czabtal;
}

/* opcje -> usunac to co nam kompletnie nie jest potrzebne do wykonania
	 chodzi tu o slowa kluczowe jak np as (oznaczone z DEL)
*/

start 	: (NL)* (polecenie newline)* 
-> ^(START (NL)* (polecenie newline)*);

polecenie 
	:	(
	pol_podst -> pol_podst
	| def 		-> ^(DEF def)
	| importR -> ^(IMPORTR importR)
	)
	;
	
pol_podst 
	:	(
	dekl 			-> ^(DEKL dekl)
	| ifR 		-> ^(IFR ifR)
	| printR	-> ^(PRINTR printR) 
	| przyp		-> ^(PRZYP przyp)
	)
	;

importR :	IMPORT IDENT -> IDENT
	;
	
dekl 	:	
	LOGICAL IDENT (AS typ_logiczny)? -> LOGICAL IDENT (^(TYP_LOGICZNY typ_logiczny))?
	|	GATE IDENT AS IDENT -> GATE IDENT IDENT
	;
/* dotyczy tylko logicali */
przyp 	:	IDENT AS typ_logiczny -> IDENT ^(TYP_LOGICZNY typ_logiczny)
	;

ifR	:	IF wyr_warun newline polecenia_fun elseR ENDIF 
		-> ^(WYR_WARUN  wyr_warun) ^(NEWLINE newline) ^(POLECENIA_FUN polecenia_fun)? ^(ELSER elseR)? 
	;

elseR	:	(
		ELSEIF wyr_warun newline polecenia_fun elseR
		-> ^(WYR_WARUN  wyr_warun) ^(NEWLINE newline) ^(POLECENIA_FUN polecenia_fun)? ^(ELSER elseR)?
	|	ELSE newline polecenia_fun
		-> ^(NEWLINE newline) ^(POLECENIA_FUN polecenia_fun)?
		)?
	;

def 	:	GATEDEF IDENT args newline BEGIN newline polecenia_fun END
			-> IDENT ^(ARGS args) ^(NEWLINE newline) ^(NEWLINE newline) ^(POLECENIA_FUN polecenia_fun) END
	;

args	:	(IDENT)+ (ARGS)?
			|	ARGS 
	;

forargs	:	FORARGS IDENT newline BEGIN newline polecenia_forargs END
			-> IDENT ^(NEWLINE newline) ^(NEWLINE newline) ^(POlECENIA_FORARGS polecenia_forargs)
	;

returnR	:	RETURN typ_logiczny -> ^(TYP_LOGICZNY typ_logiczny)
	;

printR	:	PRINT typ_logiczny -> ^(TYP_LOGICZNY typ_logiczny)
	;

polecenia_fun
	:	(pol_funkcji newline)*	-> ( pol_funkcji ^(NEWLINE newline) )*
	;

pol_funkcji
	:	pol_forargs
	|	forargs	-> ^(FORARGS forargs)
	;

polecenia_forargs
	:	(pol_forargs newline)* -> (pol_forargs ^(NEWLINE newline))*
	;

pol_forargs
	:	pol_podst
	|	returnR		-> ^(RETURNR returnR)
	;

typ_logiczny
	:	IDENT ON idki		-> IDENT ^(IDKI idki)
	// DEL ON
	|	wyr_warun				-> ^(WYR_WARUN wyr_warun)
	;

idki	:	(IDENT)+
	;

/* wyr_warun mozna zrobic na "glupa" */
wyr_warun 
	:	logiczne wyr_warun_right
	|	NOT logiczne wyr_warun_right
	;

wyr_warun_right
	: (
	  AND wyr_warun
	| OR wyr_warun
	| IS wyr_warun
	)?	
	;

logiczne: TRUE | FALSE | IDENT	
	;

newline	:	(NL)+
	;

IMPORT 	: 	'import';
LOGICAL :	'logical';
GATE	:	'gate';
AS	:	'as';
ON	:	'on';
IF	:	'if';
ENDIF	:	'endif';
ELSE	:	'else';
ELSEIF	:	'elseif';
GATEDEF	:	'gateDef';
BEGIN	:	'begin';
END	:	'end';
ARGS	:	'args';
FORARGS	:	'forargs';
RETURN	:	'return';
PRINT	:	'print';
NOT	:	'not';
AND	:	'and';
OR	:	'or';
IS	:	'is';
TRUE	:	'true';
FALSE	:	'false';


IDENT	: ('a'..'z'|'A'..'Z')+
	;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

NL	: ('\n' | '\r' | '\r\n')
	;
	
WS  :   ( ' '
        | '\t'
        ) {$channel=HIDDEN;}
    ;

ERROR 	:	. ;
