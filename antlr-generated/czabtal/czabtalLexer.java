// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g 2010-06-02 02:13:49

	package czabtal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class czabtalLexer extends Lexer {
    public static final int DEF=10;
    public static final int POLECENIA_FUN=5;
    public static final int NOT=37;
    public static final int AND=38;
    public static final int EOF=-1;
    public static final int IF=27;
    public static final int AS=25;
    public static final int IMPORT=22;
    public static final int IS=40;
    public static final int IDKI=20;
    public static final int BEGIN=32;
    public static final int RETURN=34;
    public static final int ENDIF=28;
    public static final int ARGS=16;
    public static final int IDENT=23;
    public static final int FORARGS=18;
    public static final int NL=21;
    public static final int COMMENT=43;
    public static final int RETURNR=19;
    public static final int GATE=26;
    public static final int TYP_LOGICZNY=7;
    public static final int ELSE=30;
    public static final int ON=36;
    public static final int GATEDEF=31;
    public static final int ERROR=45;
    public static final int TRUE=41;
    public static final int PRINT=35;
    public static final int IFR=11;
    public static final int ELSEIF=29;
    public static final int WS=44;
    public static final int PRINTR=12;
    public static final int NEWLINE=9;
    public static final int WYR_WARUN=14;
    public static final int PRZYP=13;
    public static final int ELSER=15;
    public static final int OR=39;
    public static final int DEKL=6;
    public static final int START=4;
    public static final int LOGICAL=24;
    public static final int IMPORTR=8;
    public static final int END=33;
    public static final int FALSE=42;
    public static final int POlECENIA_FORARGS=17;

    // delegates
    // delegators

    public czabtalLexer() {;} 
    public czabtalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public czabtalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g"; }

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:175:9: ( 'import' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:175:12: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "LOGICAL"
    public final void mLOGICAL() throws RecognitionException {
        try {
            int _type = LOGICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:176:9: ( 'logical' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:176:11: 'logical'
            {
            match("logical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL"

    // $ANTLR start "GATE"
    public final void mGATE() throws RecognitionException {
        try {
            int _type = GATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:177:6: ( 'gate' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:177:8: 'gate'
            {
            match("gate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GATE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:178:4: ( 'as' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:178:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:179:4: ( 'on' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:179:6: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:180:4: ( 'if' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:180:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:181:7: ( 'endif' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:181:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:182:6: ( 'else' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:182:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:183:8: ( 'elseif' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:183:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "GATEDEF"
    public final void mGATEDEF() throws RecognitionException {
        try {
            int _type = GATEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:184:9: ( 'gateDef' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:184:11: 'gateDef'
            {
            match("gateDef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GATEDEF"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:185:7: ( 'begin' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:185:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:186:5: ( 'end' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:186:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ARGS"
    public final void mARGS() throws RecognitionException {
        try {
            int _type = ARGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:187:6: ( 'args' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:187:8: 'args'
            {
            match("args"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARGS"

    // $ANTLR start "FORARGS"
    public final void mFORARGS() throws RecognitionException {
        try {
            int _type = FORARGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:188:9: ( 'forargs' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:188:11: 'forargs'
            {
            match("forargs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORARGS"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:189:8: ( 'return' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:189:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:190:7: ( 'print' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:190:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:191:5: ( 'not' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:191:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:192:5: ( 'and' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:192:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:193:4: ( 'or' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:193:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:194:4: ( 'is' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:194:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:195:6: ( 'true' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:195:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:196:7: ( 'false' )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:196:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:199:7: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:199:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:199:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:203:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='/') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='*') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:203:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:203:14: (~ ( '\\n' | '\\r' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:203:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:203:28: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:203:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:204:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:204:14: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='*') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='/') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:204:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:207:4: ( ( '\\n' | '\\r' | '\\r\\n' ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:207:6: ( '\\n' | '\\r' | '\\r\\n' )
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:207:6: ( '\\n' | '\\r' | '\\r\\n' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\r') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='\n') ) {
                    alt6=3;
                }
                else {
                    alt6=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:207:7: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:207:14: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:207:21: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:210:5: ( ( ' ' | '\\t' ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:210:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ERROR"
    public final void mERROR() throws RecognitionException {
        try {
            int _type = ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:215:8: ( . )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:215:10: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ERROR"

    public void mTokens() throws RecognitionException {
        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:8: ( IMPORT | LOGICAL | GATE | AS | ON | IF | ENDIF | ELSE | ELSEIF | GATEDEF | BEGIN | END | ARGS | FORARGS | RETURN | PRINT | NOT | AND | OR | IS | TRUE | FALSE | IDENT | COMMENT | NL | WS | ERROR )
        int alt7=27;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:10: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 2 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:17: LOGICAL
                {
                mLOGICAL(); 

                }
                break;
            case 3 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:25: GATE
                {
                mGATE(); 

                }
                break;
            case 4 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:30: AS
                {
                mAS(); 

                }
                break;
            case 5 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:33: ON
                {
                mON(); 

                }
                break;
            case 6 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:36: IF
                {
                mIF(); 

                }
                break;
            case 7 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:39: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 8 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:45: ELSE
                {
                mELSE(); 

                }
                break;
            case 9 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:50: ELSEIF
                {
                mELSEIF(); 

                }
                break;
            case 10 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:57: GATEDEF
                {
                mGATEDEF(); 

                }
                break;
            case 11 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:65: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 12 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:71: END
                {
                mEND(); 

                }
                break;
            case 13 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:75: ARGS
                {
                mARGS(); 

                }
                break;
            case 14 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:80: FORARGS
                {
                mFORARGS(); 

                }
                break;
            case 15 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:88: RETURN
                {
                mRETURN(); 

                }
                break;
            case 16 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:95: PRINT
                {
                mPRINT(); 

                }
                break;
            case 17 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:101: NOT
                {
                mNOT(); 

                }
                break;
            case 18 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:105: AND
                {
                mAND(); 

                }
                break;
            case 19 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:109: OR
                {
                mOR(); 

                }
                break;
            case 20 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:112: IS
                {
                mIS(); 

                }
                break;
            case 21 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:115: TRUE
                {
                mTRUE(); 

                }
                break;
            case 22 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:120: FALSE
                {
                mFALSE(); 

                }
                break;
            case 23 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:126: IDENT
                {
                mIDENT(); 

                }
                break;
            case 24 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:132: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 25 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:140: NL
                {
                mNL(); 

                }
                break;
            case 26 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:143: WS
                {
                mWS(); 

                }
                break;
            case 27 :
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:1:146: ERROR
                {
                mERROR(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\14\26\1\uffff\1\22\4\uffff\1\26\1\53\1\54\1\uffff\2\26"+
        "\1\57\2\26\1\62\1\63\11\26\3\uffff\1\26\2\uffff\2\26\1\uffff\1\26"+
        "\1\101\2\uffff\1\103\6\26\1\112\3\26\1\117\1\120\1\uffff\1\26\1"+
        "\uffff\1\123\5\26\1\uffff\1\131\3\26\2\uffff\1\135\1\26\1\uffff"+
        "\1\137\1\26\1\141\1\26\1\143\1\uffff\1\144\2\26\1\uffff\1\147\1"+
        "\uffff\1\26\1\uffff\1\151\2\uffff\1\152\1\153\1\uffff\1\154\4\uffff";
    static final String DFA7_eofS =
        "\155\uffff";
    static final String DFA7_minS =
        "\1\0\1\146\1\157\1\141\2\156\1\154\1\145\1\141\1\145\1\162\1\157"+
        "\1\162\1\uffff\1\52\4\uffff\1\160\2\101\1\uffff\1\147\1\164\1\101"+
        "\1\147\1\144\2\101\1\144\1\163\1\147\1\162\1\154\1\164\1\151\1\164"+
        "\1\165\3\uffff\1\157\2\uffff\1\151\1\145\1\uffff\1\163\1\101\2\uffff"+
        "\1\101\1\145\1\151\1\141\1\163\1\165\1\156\1\101\1\145\1\162\1\143"+
        "\2\101\1\uffff\1\146\1\uffff\1\101\1\156\1\162\1\145\1\162\1\164"+
        "\1\uffff\1\101\1\164\1\141\1\145\2\uffff\1\101\1\146\1\uffff\1\101"+
        "\1\147\1\101\1\156\1\101\1\uffff\1\101\1\154\1\146\1\uffff\1\101"+
        "\1\uffff\1\163\1\uffff\1\101\2\uffff\2\101\1\uffff\1\101\4\uffff";
    static final String DFA7_maxS =
        "\1\uffff\1\163\1\157\1\141\1\163\1\162\1\156\1\145\1\157\1\145\1"+
        "\162\1\157\1\162\1\uffff\1\57\4\uffff\1\160\2\172\1\uffff\1\147"+
        "\1\164\1\172\1\147\1\144\2\172\1\144\1\163\1\147\1\162\1\154\1\164"+
        "\1\151\1\164\1\165\3\uffff\1\157\2\uffff\1\151\1\145\1\uffff\1\163"+
        "\1\172\2\uffff\1\172\1\145\1\151\1\141\1\163\1\165\1\156\1\172\1"+
        "\145\1\162\1\143\2\172\1\uffff\1\146\1\uffff\1\172\1\156\1\162\1"+
        "\145\1\162\1\164\1\uffff\1\172\1\164\1\141\1\145\2\uffff\1\172\1"+
        "\146\1\uffff\1\172\1\147\1\172\1\156\1\172\1\uffff\1\172\1\154\1"+
        "\146\1\uffff\1\172\1\uffff\1\163\1\uffff\1\172\2\uffff\2\172\1\uffff"+
        "\1\172\4\uffff";
    static final String DFA7_acceptS =
        "\15\uffff\1\27\1\uffff\2\31\1\32\1\33\3\uffff\1\27\20\uffff\1\30"+
        "\1\31\1\32\1\uffff\1\6\1\24\2\uffff\1\4\2\uffff\1\5\1\23\15\uffff"+
        "\1\22\1\uffff\1\14\6\uffff\1\21\4\uffff\1\3\1\15\2\uffff\1\10\5"+
        "\uffff\1\25\3\uffff\1\7\1\uffff\1\13\1\uffff\1\26\1\uffff\1\20\1"+
        "\1\2\uffff\1\11\1\uffff\1\17\1\2\1\12\1\16";
    static final String DFA7_specialS =
        "\1\0\154\uffff}>";
    static final String[] DFA7_transitionS = {
            "\11\22\1\21\1\17\2\22\1\20\22\22\1\21\16\22\1\16\21\22\32\15"+
            "\6\22\1\4\1\7\2\15\1\6\1\10\1\3\1\15\1\1\2\15\1\2\1\15\1\13"+
            "\1\5\1\12\1\15\1\11\1\15\1\14\6\15\uff85\22",
            "\1\24\6\uffff\1\23\5\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\33\3\uffff\1\32\1\31",
            "\1\34\3\uffff\1\35",
            "\1\37\1\uffff\1\36",
            "\1\40",
            "\1\42\15\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\47\4\uffff\1\47",
            "",
            "",
            "",
            "",
            "\1\52",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            "\1\55",
            "\1\56",
            "\32\26\6\uffff\32\26",
            "\1\60",
            "\1\61",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\32\26\6\uffff\32\26",
            "",
            "",
            "\32\26\6\uffff\10\26\1\102\21\26",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\32\26\6\uffff\32\26",
            "\1\113",
            "\1\114",
            "\1\115",
            "\3\26\1\116\26\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            "\1\121",
            "",
            "\32\26\6\uffff\10\26\1\122\21\26",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\32\26\6\uffff\32\26",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "\32\26\6\uffff\32\26",
            "\1\136",
            "",
            "\32\26\6\uffff\32\26",
            "\1\140",
            "\32\26\6\uffff\32\26",
            "\1\142",
            "\32\26\6\uffff\32\26",
            "",
            "\32\26\6\uffff\32\26",
            "\1\145",
            "\1\146",
            "",
            "\32\26\6\uffff\32\26",
            "",
            "\1\150",
            "",
            "\32\26\6\uffff\32\26",
            "",
            "",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            "\32\26\6\uffff\32\26",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( IMPORT | LOGICAL | GATE | AS | ON | IF | ENDIF | ELSE | ELSEIF | GATEDEF | BEGIN | END | ARGS | FORARGS | RETURN | PRINT | NOT | AND | OR | IS | TRUE | FALSE | IDENT | COMMENT | NL | WS | ERROR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='i') ) {s = 1;}

                        else if ( (LA7_0=='l') ) {s = 2;}

                        else if ( (LA7_0=='g') ) {s = 3;}

                        else if ( (LA7_0=='a') ) {s = 4;}

                        else if ( (LA7_0=='o') ) {s = 5;}

                        else if ( (LA7_0=='e') ) {s = 6;}

                        else if ( (LA7_0=='b') ) {s = 7;}

                        else if ( (LA7_0=='f') ) {s = 8;}

                        else if ( (LA7_0=='r') ) {s = 9;}

                        else if ( (LA7_0=='p') ) {s = 10;}

                        else if ( (LA7_0=='n') ) {s = 11;}

                        else if ( (LA7_0=='t') ) {s = 12;}

                        else if ( ((LA7_0>='A' && LA7_0<='Z')||(LA7_0>='c' && LA7_0<='d')||LA7_0=='h'||(LA7_0>='j' && LA7_0<='k')||LA7_0=='m'||LA7_0=='q'||LA7_0=='s'||(LA7_0>='u' && LA7_0<='z')) ) {s = 13;}

                        else if ( (LA7_0=='/') ) {s = 14;}

                        else if ( (LA7_0=='\n') ) {s = 15;}

                        else if ( (LA7_0=='\r') ) {s = 16;}

                        else if ( (LA7_0=='\t'||LA7_0==' ') ) {s = 17;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='\b')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\u001F')||(LA7_0>='!' && LA7_0<='.')||(LA7_0>='0' && LA7_0<='@')||(LA7_0>='[' && LA7_0<='`')||(LA7_0>='{' && LA7_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}