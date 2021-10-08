// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g 2010-06-02 02:13:49

	package czabtal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class czabtalParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "START", "POLECENIA_FUN", "DEKL", "TYP_LOGICZNY", "IMPORTR", "NEWLINE", "DEF", "IFR", "PRINTR", "PRZYP", "WYR_WARUN", "ELSER", "ARGS", "POlECENIA_FORARGS", "FORARGS", "RETURNR", "IDKI", "NL", "IMPORT", "IDENT", "LOGICAL", "AS", "GATE", "IF", "ENDIF", "ELSEIF", "ELSE", "GATEDEF", "BEGIN", "END", "RETURN", "PRINT", "ON", "NOT", "AND", "OR", "IS", "TRUE", "FALSE", "COMMENT", "WS", "ERROR"
    };
    public static final int DEF=10;
    public static final int POLECENIA_FUN=5;
    public static final int NOT=37;
    public static final int AND=38;
    public static final int EOF=-1;
    public static final int IF=27;
    public static final int AS=25;
    public static final int IMPORT=22;
    public static final int IDKI=20;
    public static final int IS=40;
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


        public czabtalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public czabtalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return czabtalParser.tokenNames; }
    public String getGrammarFileName() { return "/home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g"; }


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


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:1: start : ( NL )* ( polecenie newline )* -> ^( START ( NL )* ( polecenie newline )* ) ;
    public final czabtalParser.start_return start() throws RecognitionException {
        czabtalParser.start_return retval = new czabtalParser.start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL1=null;
        czabtalParser.polecenie_return polecenie2 = null;

        czabtalParser.newline_return newline3 = null;


        CommonTree NL1_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_polecenie=new RewriteRuleSubtreeStream(adaptor,"rule polecenie");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:8: ( ( NL )* ( polecenie newline )* -> ^( START ( NL )* ( polecenie newline )* ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:10: ( NL )* ( polecenie newline )*
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:10: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:11: NL
            	    {
            	    NL1=(Token)match(input,NL,FOLLOW_NL_in_start139);  
            	    stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:16: ( polecenie newline )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=IMPORT && LA2_0<=LOGICAL)||(LA2_0>=GATE && LA2_0<=IF)||LA2_0==GATEDEF||LA2_0==PRINT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:67:17: polecenie newline
            	    {
            	    pushFollow(FOLLOW_polecenie_in_start144);
            	    polecenie2=polecenie();

            	    state._fsp--;

            	    stream_polecenie.add(polecenie2.getTree());
            	    pushFollow(FOLLOW_newline_in_start146);
            	    newline3=newline();

            	    state._fsp--;

            	    stream_newline.add(newline3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: polecenie, newline, NL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:1: -> ^( START ( NL )* ( polecenie newline )* )
            {
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:68:4: ^( START ( NL )* ( polecenie newline )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(START, "START"), root_1);

                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:68:12: ( NL )*
                while ( stream_NL.hasNext() ) {
                    adaptor.addChild(root_1, stream_NL.nextNode());

                }
                stream_NL.reset();
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:68:18: ( polecenie newline )*
                while ( stream_polecenie.hasNext()||stream_newline.hasNext() ) {
                    adaptor.addChild(root_1, stream_polecenie.nextTree());
                    adaptor.addChild(root_1, stream_newline.nextTree());

                }
                stream_polecenie.reset();
                stream_newline.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class polecenie_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "polecenie"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:70:1: polecenie : ( pol_podst -> pol_podst | def -> ^( DEF def ) | importR -> ^( IMPORTR importR ) ) ;
    public final czabtalParser.polecenie_return polecenie() throws RecognitionException {
        czabtalParser.polecenie_return retval = new czabtalParser.polecenie_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        czabtalParser.pol_podst_return pol_podst4 = null;

        czabtalParser.def_return def5 = null;

        czabtalParser.importR_return importR6 = null;


        RewriteRuleSubtreeStream stream_pol_podst=new RewriteRuleSubtreeStream(adaptor,"rule pol_podst");
        RewriteRuleSubtreeStream stream_def=new RewriteRuleSubtreeStream(adaptor,"rule def");
        RewriteRuleSubtreeStream stream_importR=new RewriteRuleSubtreeStream(adaptor,"rule importR");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:71:2: ( ( pol_podst -> pol_podst | def -> ^( DEF def ) | importR -> ^( IMPORTR importR ) ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:71:4: ( pol_podst -> pol_podst | def -> ^( DEF def ) | importR -> ^( IMPORTR importR ) )
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:71:4: ( pol_podst -> pol_podst | def -> ^( DEF def ) | importR -> ^( IMPORTR importR ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case LOGICAL:
            case GATE:
            case IF:
            case PRINT:
                {
                alt3=1;
                }
                break;
            case GATEDEF:
                {
                alt3=2;
                }
                break;
            case IMPORT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:72:2: pol_podst
                    {
                    pushFollow(FOLLOW_pol_podst_in_polecenie180);
                    pol_podst4=pol_podst();

                    state._fsp--;

                    stream_pol_podst.add(pol_podst4.getTree());


                    // AST REWRITE
                    // elements: pol_podst
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:12: -> pol_podst
                    {
                        adaptor.addChild(root_0, stream_pol_podst.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:73:4: def
                    {
                    pushFollow(FOLLOW_def_in_polecenie189);
                    def5=def();

                    state._fsp--;

                    stream_def.add(def5.getTree());


                    // AST REWRITE
                    // elements: def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:10: -> ^( DEF def )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:73:13: ^( DEF def )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                        adaptor.addChild(root_1, stream_def.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:74:4: importR
                    {
                    pushFollow(FOLLOW_importR_in_polecenie204);
                    importR6=importR();

                    state._fsp--;

                    stream_importR.add(importR6.getTree());


                    // AST REWRITE
                    // elements: importR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:12: -> ^( IMPORTR importR )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:74:15: ^( IMPORTR importR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORTR, "IMPORTR"), root_1);

                        adaptor.addChild(root_1, stream_importR.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "polecenie"

    public static class pol_podst_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pol_podst"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:78:1: pol_podst : ( dekl -> ^( DEKL dekl ) | ifR -> ^( IFR ifR ) | printR -> ^( PRINTR printR ) | przyp -> ^( PRZYP przyp ) ) ;
    public final czabtalParser.pol_podst_return pol_podst() throws RecognitionException {
        czabtalParser.pol_podst_return retval = new czabtalParser.pol_podst_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        czabtalParser.dekl_return dekl7 = null;

        czabtalParser.ifR_return ifR8 = null;

        czabtalParser.printR_return printR9 = null;

        czabtalParser.przyp_return przyp10 = null;


        RewriteRuleSubtreeStream stream_dekl=new RewriteRuleSubtreeStream(adaptor,"rule dekl");
        RewriteRuleSubtreeStream stream_przyp=new RewriteRuleSubtreeStream(adaptor,"rule przyp");
        RewriteRuleSubtreeStream stream_ifR=new RewriteRuleSubtreeStream(adaptor,"rule ifR");
        RewriteRuleSubtreeStream stream_printR=new RewriteRuleSubtreeStream(adaptor,"rule printR");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:79:2: ( ( dekl -> ^( DEKL dekl ) | ifR -> ^( IFR ifR ) | printR -> ^( PRINTR printR ) | przyp -> ^( PRZYP przyp ) ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:79:4: ( dekl -> ^( DEKL dekl ) | ifR -> ^( IFR ifR ) | printR -> ^( PRINTR printR ) | przyp -> ^( PRZYP przyp ) )
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:79:4: ( dekl -> ^( DEKL dekl ) | ifR -> ^( IFR ifR ) | printR -> ^( PRINTR printR ) | przyp -> ^( PRZYP przyp ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case LOGICAL:
            case GATE:
                {
                alt4=1;
                }
                break;
            case IF:
                {
                alt4=2;
                }
                break;
            case PRINT:
                {
                alt4=3;
                }
                break;
            case IDENT:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:80:2: dekl
                    {
                    pushFollow(FOLLOW_dekl_in_pol_podst231);
                    dekl7=dekl();

                    state._fsp--;

                    stream_dekl.add(dekl7.getTree());


                    // AST REWRITE
                    // elements: dekl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:10: -> ^( DEKL dekl )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:80:13: ^( DEKL dekl )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEKL, "DEKL"), root_1);

                        adaptor.addChild(root_1, stream_dekl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:81:4: ifR
                    {
                    pushFollow(FOLLOW_ifR_in_pol_podst247);
                    ifR8=ifR();

                    state._fsp--;

                    stream_ifR.add(ifR8.getTree());


                    // AST REWRITE
                    // elements: ifR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 81:10: -> ^( IFR ifR )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:81:13: ^( IFR ifR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFR, "IFR"), root_1);

                        adaptor.addChild(root_1, stream_ifR.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:82:4: printR
                    {
                    pushFollow(FOLLOW_printR_in_pol_podst262);
                    printR9=printR();

                    state._fsp--;

                    stream_printR.add(printR9.getTree());


                    // AST REWRITE
                    // elements: printR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:11: -> ^( PRINTR printR )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:82:14: ^( PRINTR printR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINTR, "PRINTR"), root_1);

                        adaptor.addChild(root_1, stream_printR.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:83:4: przyp
                    {
                    pushFollow(FOLLOW_przyp_in_pol_podst276);
                    przyp10=przyp();

                    state._fsp--;

                    stream_przyp.add(przyp10.getTree());


                    // AST REWRITE
                    // elements: przyp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:11: -> ^( PRZYP przyp )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:83:14: ^( PRZYP przyp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRZYP, "PRZYP"), root_1);

                        adaptor.addChild(root_1, stream_przyp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pol_podst"

    public static class importR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importR"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:87:1: importR : IMPORT IDENT -> IDENT ;
    public final czabtalParser.importR_return importR() throws RecognitionException {
        czabtalParser.importR_return retval = new czabtalParser.importR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IMPORT11=null;
        Token IDENT12=null;

        CommonTree IMPORT11_tree=null;
        CommonTree IDENT12_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:87:9: ( IMPORT IDENT -> IDENT )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:87:11: IMPORT IDENT
            {
            IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importR298);  
            stream_IMPORT.add(IMPORT11);

            IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_importR300);  
            stream_IDENT.add(IDENT12);



            // AST REWRITE
            // elements: IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 87:24: -> IDENT
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "importR"

    public static class dekl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dekl"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:90:1: dekl : ( LOGICAL IDENT ( AS typ_logiczny )? -> LOGICAL IDENT ( ^( TYP_LOGICZNY typ_logiczny ) )? | GATE IDENT AS IDENT -> GATE IDENT IDENT );
    public final czabtalParser.dekl_return dekl() throws RecognitionException {
        czabtalParser.dekl_return retval = new czabtalParser.dekl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOGICAL13=null;
        Token IDENT14=null;
        Token AS15=null;
        Token GATE17=null;
        Token IDENT18=null;
        Token AS19=null;
        Token IDENT20=null;
        czabtalParser.typ_logiczny_return typ_logiczny16 = null;


        CommonTree LOGICAL13_tree=null;
        CommonTree IDENT14_tree=null;
        CommonTree AS15_tree=null;
        CommonTree GATE17_tree=null;
        CommonTree IDENT18_tree=null;
        CommonTree AS19_tree=null;
        CommonTree IDENT20_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_LOGICAL=new RewriteRuleTokenStream(adaptor,"token LOGICAL");
        RewriteRuleTokenStream stream_GATE=new RewriteRuleTokenStream(adaptor,"token GATE");
        RewriteRuleSubtreeStream stream_typ_logiczny=new RewriteRuleSubtreeStream(adaptor,"rule typ_logiczny");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:90:7: ( LOGICAL IDENT ( AS typ_logiczny )? -> LOGICAL IDENT ( ^( TYP_LOGICZNY typ_logiczny ) )? | GATE IDENT AS IDENT -> GATE IDENT IDENT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LOGICAL) ) {
                alt6=1;
            }
            else if ( (LA6_0==GATE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:91:2: LOGICAL IDENT ( AS typ_logiczny )?
                    {
                    LOGICAL13=(Token)match(input,LOGICAL,FOLLOW_LOGICAL_in_dekl318);  
                    stream_LOGICAL.add(LOGICAL13);

                    IDENT14=(Token)match(input,IDENT,FOLLOW_IDENT_in_dekl320);  
                    stream_IDENT.add(IDENT14);

                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:91:16: ( AS typ_logiczny )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:91:17: AS typ_logiczny
                            {
                            AS15=(Token)match(input,AS,FOLLOW_AS_in_dekl323);  
                            stream_AS.add(AS15);

                            pushFollow(FOLLOW_typ_logiczny_in_dekl325);
                            typ_logiczny16=typ_logiczny();

                            state._fsp--;

                            stream_typ_logiczny.add(typ_logiczny16.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: LOGICAL, IDENT, typ_logiczny
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:35: -> LOGICAL IDENT ( ^( TYP_LOGICZNY typ_logiczny ) )?
                    {
                        adaptor.addChild(root_0, stream_LOGICAL.nextNode());
                        adaptor.addChild(root_0, stream_IDENT.nextNode());
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:91:52: ( ^( TYP_LOGICZNY typ_logiczny ) )?
                        if ( stream_typ_logiczny.hasNext() ) {
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:91:53: ^( TYP_LOGICZNY typ_logiczny )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYP_LOGICZNY, "TYP_LOGICZNY"), root_1);

                            adaptor.addChild(root_1, stream_typ_logiczny.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_typ_logiczny.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:92:4: GATE IDENT AS IDENT
                    {
                    GATE17=(Token)match(input,GATE,FOLLOW_GATE_in_dekl347);  
                    stream_GATE.add(GATE17);

                    IDENT18=(Token)match(input,IDENT,FOLLOW_IDENT_in_dekl349);  
                    stream_IDENT.add(IDENT18);

                    AS19=(Token)match(input,AS,FOLLOW_AS_in_dekl351);  
                    stream_AS.add(AS19);

                    IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_dekl353);  
                    stream_IDENT.add(IDENT20);



                    // AST REWRITE
                    // elements: IDENT, IDENT, GATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:24: -> GATE IDENT IDENT
                    {
                        adaptor.addChild(root_0, stream_GATE.nextNode());
                        adaptor.addChild(root_0, stream_IDENT.nextNode());
                        adaptor.addChild(root_0, stream_IDENT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dekl"

    public static class przyp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "przyp"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:95:1: przyp : IDENT AS typ_logiczny -> IDENT ^( TYP_LOGICZNY typ_logiczny ) ;
    public final czabtalParser.przyp_return przyp() throws RecognitionException {
        czabtalParser.przyp_return retval = new czabtalParser.przyp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT21=null;
        Token AS22=null;
        czabtalParser.typ_logiczny_return typ_logiczny23 = null;


        CommonTree IDENT21_tree=null;
        CommonTree AS22_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typ_logiczny=new RewriteRuleSubtreeStream(adaptor,"rule typ_logiczny");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:95:8: ( IDENT AS typ_logiczny -> IDENT ^( TYP_LOGICZNY typ_logiczny ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:95:10: IDENT AS typ_logiczny
            {
            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_przyp373);  
            stream_IDENT.add(IDENT21);

            AS22=(Token)match(input,AS,FOLLOW_AS_in_przyp375);  
            stream_AS.add(AS22);

            pushFollow(FOLLOW_typ_logiczny_in_przyp377);
            typ_logiczny23=typ_logiczny();

            state._fsp--;

            stream_typ_logiczny.add(typ_logiczny23.getTree());


            // AST REWRITE
            // elements: IDENT, typ_logiczny
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:32: -> IDENT ^( TYP_LOGICZNY typ_logiczny )
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:95:41: ^( TYP_LOGICZNY typ_logiczny )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYP_LOGICZNY, "TYP_LOGICZNY"), root_1);

                adaptor.addChild(root_1, stream_typ_logiczny.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "przyp"

    public static class ifR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifR"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:98:1: ifR : IF wyr_warun newline polecenia_fun elseR ENDIF -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )? ;
    public final czabtalParser.ifR_return ifR() throws RecognitionException {
        czabtalParser.ifR_return retval = new czabtalParser.ifR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF24=null;
        Token ENDIF29=null;
        czabtalParser.wyr_warun_return wyr_warun25 = null;

        czabtalParser.newline_return newline26 = null;

        czabtalParser.polecenia_fun_return polecenia_fun27 = null;

        czabtalParser.elseR_return elseR28 = null;


        CommonTree IF24_tree=null;
        CommonTree ENDIF29_tree=null;
        RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_wyr_warun=new RewriteRuleSubtreeStream(adaptor,"rule wyr_warun");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_polecenia_fun=new RewriteRuleSubtreeStream(adaptor,"rule polecenia_fun");
        RewriteRuleSubtreeStream stream_elseR=new RewriteRuleSubtreeStream(adaptor,"rule elseR");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:98:5: ( IF wyr_warun newline polecenia_fun elseR ENDIF -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )? )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:98:7: IF wyr_warun newline polecenia_fun elseR ENDIF
            {
            IF24=(Token)match(input,IF,FOLLOW_IF_in_ifR397);  
            stream_IF.add(IF24);

            pushFollow(FOLLOW_wyr_warun_in_ifR399);
            wyr_warun25=wyr_warun();

            state._fsp--;

            stream_wyr_warun.add(wyr_warun25.getTree());
            pushFollow(FOLLOW_newline_in_ifR401);
            newline26=newline();

            state._fsp--;

            stream_newline.add(newline26.getTree());
            pushFollow(FOLLOW_polecenia_fun_in_ifR403);
            polecenia_fun27=polecenia_fun();

            state._fsp--;

            stream_polecenia_fun.add(polecenia_fun27.getTree());
            pushFollow(FOLLOW_elseR_in_ifR405);
            elseR28=elseR();

            state._fsp--;

            stream_elseR.add(elseR28.getTree());
            ENDIF29=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifR407);  
            stream_ENDIF.add(ENDIF29);



            // AST REWRITE
            // elements: wyr_warun, elseR, polecenia_fun, newline
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:3: -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )?
            {
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:99:6: ^( WYR_WARUN wyr_warun )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WYR_WARUN, "WYR_WARUN"), root_1);

                adaptor.addChild(root_1, stream_wyr_warun.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:99:30: ^( NEWLINE newline )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                adaptor.addChild(root_1, stream_newline.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:99:49: ( ^( POLECENIA_FUN polecenia_fun ) )?
                if ( stream_polecenia_fun.hasNext() ) {
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:99:49: ^( POLECENIA_FUN polecenia_fun )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POLECENIA_FUN, "POLECENIA_FUN"), root_1);

                    adaptor.addChild(root_1, stream_polecenia_fun.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_polecenia_fun.reset();
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:99:81: ( ^( ELSER elseR ) )?
                if ( stream_elseR.hasNext() ) {
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:99:81: ^( ELSER elseR )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSER, "ELSER"), root_1);

                    adaptor.addChild(root_1, stream_elseR.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_elseR.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifR"

    public static class elseR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseR"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:102:1: elseR : ( ELSEIF wyr_warun newline polecenia_fun elseR -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )? | ELSE newline polecenia_fun -> ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? )? ;
    public final czabtalParser.elseR_return elseR() throws RecognitionException {
        czabtalParser.elseR_return retval = new czabtalParser.elseR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSEIF30=null;
        Token ELSE35=null;
        czabtalParser.wyr_warun_return wyr_warun31 = null;

        czabtalParser.newline_return newline32 = null;

        czabtalParser.polecenia_fun_return polecenia_fun33 = null;

        czabtalParser.elseR_return elseR34 = null;

        czabtalParser.newline_return newline36 = null;

        czabtalParser.polecenia_fun_return polecenia_fun37 = null;


        CommonTree ELSEIF30_tree=null;
        CommonTree ELSE35_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_ELSEIF=new RewriteRuleTokenStream(adaptor,"token ELSEIF");
        RewriteRuleSubtreeStream stream_wyr_warun=new RewriteRuleSubtreeStream(adaptor,"rule wyr_warun");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_polecenia_fun=new RewriteRuleSubtreeStream(adaptor,"rule polecenia_fun");
        RewriteRuleSubtreeStream stream_elseR=new RewriteRuleSubtreeStream(adaptor,"rule elseR");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:102:7: ( ( ELSEIF wyr_warun newline polecenia_fun elseR -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )? | ELSE newline polecenia_fun -> ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? )? )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:102:9: ( ELSEIF wyr_warun newline polecenia_fun elseR -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )? | ELSE newline polecenia_fun -> ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? )?
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:102:9: ( ELSEIF wyr_warun newline polecenia_fun elseR -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )? | ELSE newline polecenia_fun -> ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSEIF) ) {
                alt7=1;
            }
            else if ( (LA7_0==ELSE) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:103:3: ELSEIF wyr_warun newline polecenia_fun elseR
                    {
                    ELSEIF30=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseR454);  
                    stream_ELSEIF.add(ELSEIF30);

                    pushFollow(FOLLOW_wyr_warun_in_elseR456);
                    wyr_warun31=wyr_warun();

                    state._fsp--;

                    stream_wyr_warun.add(wyr_warun31.getTree());
                    pushFollow(FOLLOW_newline_in_elseR458);
                    newline32=newline();

                    state._fsp--;

                    stream_newline.add(newline32.getTree());
                    pushFollow(FOLLOW_polecenia_fun_in_elseR460);
                    polecenia_fun33=polecenia_fun();

                    state._fsp--;

                    stream_polecenia_fun.add(polecenia_fun33.getTree());
                    pushFollow(FOLLOW_elseR_in_elseR462);
                    elseR34=elseR();

                    state._fsp--;

                    stream_elseR.add(elseR34.getTree());


                    // AST REWRITE
                    // elements: wyr_warun, elseR, newline, polecenia_fun
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 104:3: -> ^( WYR_WARUN wyr_warun ) ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )? ( ^( ELSER elseR ) )?
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:104:6: ^( WYR_WARUN wyr_warun )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WYR_WARUN, "WYR_WARUN"), root_1);

                        adaptor.addChild(root_1, stream_wyr_warun.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:104:30: ^( NEWLINE newline )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                        adaptor.addChild(root_1, stream_newline.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:104:49: ( ^( POLECENIA_FUN polecenia_fun ) )?
                        if ( stream_polecenia_fun.hasNext() ) {
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:104:49: ^( POLECENIA_FUN polecenia_fun )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POLECENIA_FUN, "POLECENIA_FUN"), root_1);

                            adaptor.addChild(root_1, stream_polecenia_fun.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_polecenia_fun.reset();
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:104:81: ( ^( ELSER elseR ) )?
                        if ( stream_elseR.hasNext() ) {
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:104:81: ^( ELSER elseR )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSER, "ELSER"), root_1);

                            adaptor.addChild(root_1, stream_elseR.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_elseR.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:105:4: ELSE newline polecenia_fun
                    {
                    ELSE35=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseR498);  
                    stream_ELSE.add(ELSE35);

                    pushFollow(FOLLOW_newline_in_elseR500);
                    newline36=newline();

                    state._fsp--;

                    stream_newline.add(newline36.getTree());
                    pushFollow(FOLLOW_polecenia_fun_in_elseR502);
                    polecenia_fun37=polecenia_fun();

                    state._fsp--;

                    stream_polecenia_fun.add(polecenia_fun37.getTree());


                    // AST REWRITE
                    // elements: polecenia_fun, newline
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 106:3: -> ^( NEWLINE newline ) ( ^( POLECENIA_FUN polecenia_fun ) )?
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:106:6: ^( NEWLINE newline )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                        adaptor.addChild(root_1, stream_newline.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:106:25: ( ^( POLECENIA_FUN polecenia_fun ) )?
                        if ( stream_polecenia_fun.hasNext() ) {
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:106:25: ^( POLECENIA_FUN polecenia_fun )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POLECENIA_FUN, "POLECENIA_FUN"), root_1);

                            adaptor.addChild(root_1, stream_polecenia_fun.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_polecenia_fun.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseR"

    public static class def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "def"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:110:1: def : GATEDEF IDENT args newline BEGIN newline polecenia_fun END -> IDENT ^( ARGS args ) ^( NEWLINE newline ) ^( NEWLINE newline ) ^( POLECENIA_FUN polecenia_fun ) END ;
    public final czabtalParser.def_return def() throws RecognitionException {
        czabtalParser.def_return retval = new czabtalParser.def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GATEDEF38=null;
        Token IDENT39=null;
        Token BEGIN42=null;
        Token END45=null;
        czabtalParser.args_return args40 = null;

        czabtalParser.newline_return newline41 = null;

        czabtalParser.newline_return newline43 = null;

        czabtalParser.polecenia_fun_return polecenia_fun44 = null;


        CommonTree GATEDEF38_tree=null;
        CommonTree IDENT39_tree=null;
        CommonTree BEGIN42_tree=null;
        CommonTree END45_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_GATEDEF=new RewriteRuleTokenStream(adaptor,"token GATEDEF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_polecenia_fun=new RewriteRuleSubtreeStream(adaptor,"rule polecenia_fun");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:110:6: ( GATEDEF IDENT args newline BEGIN newline polecenia_fun END -> IDENT ^( ARGS args ) ^( NEWLINE newline ) ^( NEWLINE newline ) ^( POLECENIA_FUN polecenia_fun ) END )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:110:8: GATEDEF IDENT args newline BEGIN newline polecenia_fun END
            {
            GATEDEF38=(Token)match(input,GATEDEF,FOLLOW_GATEDEF_in_def535);  
            stream_GATEDEF.add(GATEDEF38);

            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_def537);  
            stream_IDENT.add(IDENT39);

            pushFollow(FOLLOW_args_in_def539);
            args40=args();

            state._fsp--;

            stream_args.add(args40.getTree());
            pushFollow(FOLLOW_newline_in_def541);
            newline41=newline();

            state._fsp--;

            stream_newline.add(newline41.getTree());
            BEGIN42=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_def543);  
            stream_BEGIN.add(BEGIN42);

            pushFollow(FOLLOW_newline_in_def545);
            newline43=newline();

            state._fsp--;

            stream_newline.add(newline43.getTree());
            pushFollow(FOLLOW_polecenia_fun_in_def547);
            polecenia_fun44=polecenia_fun();

            state._fsp--;

            stream_polecenia_fun.add(polecenia_fun44.getTree());
            END45=(Token)match(input,END,FOLLOW_END_in_def549);  
            stream_END.add(END45);



            // AST REWRITE
            // elements: args, newline, IDENT, newline, polecenia_fun, END
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:4: -> IDENT ^( ARGS args ) ^( NEWLINE newline ) ^( NEWLINE newline ) ^( POLECENIA_FUN polecenia_fun ) END
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:111:13: ^( ARGS args )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGS, "ARGS"), root_1);

                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:111:26: ^( NEWLINE newline )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                adaptor.addChild(root_1, stream_newline.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:111:45: ^( NEWLINE newline )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                adaptor.addChild(root_1, stream_newline.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:111:64: ^( POLECENIA_FUN polecenia_fun )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POLECENIA_FUN, "POLECENIA_FUN"), root_1);

                adaptor.addChild(root_1, stream_polecenia_fun.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_END.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "def"

    public static class args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:1: args : ( ( IDENT )+ ( ARGS )? | ARGS );
    public final czabtalParser.args_return args() throws RecognitionException {
        czabtalParser.args_return retval = new czabtalParser.args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT46=null;
        Token ARGS47=null;
        Token ARGS48=null;

        CommonTree IDENT46_tree=null;
        CommonTree ARGS47_tree=null;
        CommonTree ARGS48_tree=null;

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:6: ( ( IDENT )+ ( ARGS )? | ARGS )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                alt10=1;
            }
            else if ( (LA10_0==ARGS) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:8: ( IDENT )+ ( ARGS )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:8: ( IDENT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==IDENT) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:9: IDENT
                    	    {
                    	    IDENT46=(Token)match(input,IDENT,FOLLOW_IDENT_in_args593); 
                    	    IDENT46_tree = (CommonTree)adaptor.create(IDENT46);
                    	    adaptor.addChild(root_0, IDENT46_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:17: ( ARGS )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ARGS) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:114:18: ARGS
                            {
                            ARGS47=(Token)match(input,ARGS,FOLLOW_ARGS_in_args598); 
                            ARGS47_tree = (CommonTree)adaptor.create(ARGS47);
                            adaptor.addChild(root_0, ARGS47_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:115:6: ARGS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ARGS48=(Token)match(input,ARGS,FOLLOW_ARGS_in_args607); 
                    ARGS48_tree = (CommonTree)adaptor.create(ARGS48);
                    adaptor.addChild(root_0, ARGS48_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class forargs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forargs"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:118:1: forargs : FORARGS IDENT newline BEGIN newline polecenia_forargs END -> IDENT ^( NEWLINE newline ) ^( NEWLINE newline ) ^( POlECENIA_FORARGS polecenia_forargs ) ;
    public final czabtalParser.forargs_return forargs() throws RecognitionException {
        czabtalParser.forargs_return retval = new czabtalParser.forargs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FORARGS49=null;
        Token IDENT50=null;
        Token BEGIN52=null;
        Token END55=null;
        czabtalParser.newline_return newline51 = null;

        czabtalParser.newline_return newline53 = null;

        czabtalParser.polecenia_forargs_return polecenia_forargs54 = null;


        CommonTree FORARGS49_tree=null;
        CommonTree IDENT50_tree=null;
        CommonTree BEGIN52_tree=null;
        CommonTree END55_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_FORARGS=new RewriteRuleTokenStream(adaptor,"token FORARGS");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_polecenia_forargs=new RewriteRuleSubtreeStream(adaptor,"rule polecenia_forargs");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:118:9: ( FORARGS IDENT newline BEGIN newline polecenia_forargs END -> IDENT ^( NEWLINE newline ) ^( NEWLINE newline ) ^( POlECENIA_FORARGS polecenia_forargs ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:118:11: FORARGS IDENT newline BEGIN newline polecenia_forargs END
            {
            FORARGS49=(Token)match(input,FORARGS,FOLLOW_FORARGS_in_forargs618);  
            stream_FORARGS.add(FORARGS49);

            IDENT50=(Token)match(input,IDENT,FOLLOW_IDENT_in_forargs620);  
            stream_IDENT.add(IDENT50);

            pushFollow(FOLLOW_newline_in_forargs622);
            newline51=newline();

            state._fsp--;

            stream_newline.add(newline51.getTree());
            BEGIN52=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_forargs624);  
            stream_BEGIN.add(BEGIN52);

            pushFollow(FOLLOW_newline_in_forargs626);
            newline53=newline();

            state._fsp--;

            stream_newline.add(newline53.getTree());
            pushFollow(FOLLOW_polecenia_forargs_in_forargs628);
            polecenia_forargs54=polecenia_forargs();

            state._fsp--;

            stream_polecenia_forargs.add(polecenia_forargs54.getTree());
            END55=(Token)match(input,END,FOLLOW_END_in_forargs630);  
            stream_END.add(END55);



            // AST REWRITE
            // elements: newline, polecenia_forargs, IDENT, newline
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 119:4: -> IDENT ^( NEWLINE newline ) ^( NEWLINE newline ) ^( POlECENIA_FORARGS polecenia_forargs )
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:119:13: ^( NEWLINE newline )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                adaptor.addChild(root_1, stream_newline.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:119:32: ^( NEWLINE newline )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                adaptor.addChild(root_1, stream_newline.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:119:51: ^( POlECENIA_FORARGS polecenia_forargs )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POlECENIA_FORARGS, "POlECENIA_FORARGS"), root_1);

                adaptor.addChild(root_1, stream_polecenia_forargs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forargs"

    public static class returnR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnR"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:122:1: returnR : RETURN typ_logiczny -> ^( TYP_LOGICZNY typ_logiczny ) ;
    public final czabtalParser.returnR_return returnR() throws RecognitionException {
        czabtalParser.returnR_return retval = new czabtalParser.returnR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN56=null;
        czabtalParser.typ_logiczny_return typ_logiczny57 = null;


        CommonTree RETURN56_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_typ_logiczny=new RewriteRuleSubtreeStream(adaptor,"rule typ_logiczny");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:122:9: ( RETURN typ_logiczny -> ^( TYP_LOGICZNY typ_logiczny ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:122:11: RETURN typ_logiczny
            {
            RETURN56=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnR665);  
            stream_RETURN.add(RETURN56);

            pushFollow(FOLLOW_typ_logiczny_in_returnR667);
            typ_logiczny57=typ_logiczny();

            state._fsp--;

            stream_typ_logiczny.add(typ_logiczny57.getTree());


            // AST REWRITE
            // elements: typ_logiczny
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:31: -> ^( TYP_LOGICZNY typ_logiczny )
            {
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:122:34: ^( TYP_LOGICZNY typ_logiczny )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYP_LOGICZNY, "TYP_LOGICZNY"), root_1);

                adaptor.addChild(root_1, stream_typ_logiczny.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnR"

    public static class printR_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printR"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:125:1: printR : PRINT typ_logiczny -> ^( TYP_LOGICZNY typ_logiczny ) ;
    public final czabtalParser.printR_return printR() throws RecognitionException {
        czabtalParser.printR_return retval = new czabtalParser.printR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRINT58=null;
        czabtalParser.typ_logiczny_return typ_logiczny59 = null;


        CommonTree PRINT58_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_typ_logiczny=new RewriteRuleSubtreeStream(adaptor,"rule typ_logiczny");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:125:8: ( PRINT typ_logiczny -> ^( TYP_LOGICZNY typ_logiczny ) )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:125:10: PRINT typ_logiczny
            {
            PRINT58=(Token)match(input,PRINT,FOLLOW_PRINT_in_printR685);  
            stream_PRINT.add(PRINT58);

            pushFollow(FOLLOW_typ_logiczny_in_printR687);
            typ_logiczny59=typ_logiczny();

            state._fsp--;

            stream_typ_logiczny.add(typ_logiczny59.getTree());


            // AST REWRITE
            // elements: typ_logiczny
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:29: -> ^( TYP_LOGICZNY typ_logiczny )
            {
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:125:32: ^( TYP_LOGICZNY typ_logiczny )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYP_LOGICZNY, "TYP_LOGICZNY"), root_1);

                adaptor.addChild(root_1, stream_typ_logiczny.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printR"

    public static class polecenia_fun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "polecenia_fun"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:128:1: polecenia_fun : ( pol_funkcji newline )* -> ( pol_funkcji ^( NEWLINE newline ) )* ;
    public final czabtalParser.polecenia_fun_return polecenia_fun() throws RecognitionException {
        czabtalParser.polecenia_fun_return retval = new czabtalParser.polecenia_fun_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        czabtalParser.pol_funkcji_return pol_funkcji60 = null;

        czabtalParser.newline_return newline61 = null;


        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_pol_funkcji=new RewriteRuleSubtreeStream(adaptor,"rule pol_funkcji");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:129:2: ( ( pol_funkcji newline )* -> ( pol_funkcji ^( NEWLINE newline ) )* )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:129:4: ( pol_funkcji newline )*
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:129:4: ( pol_funkcji newline )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==FORARGS||(LA11_0>=IDENT && LA11_0<=LOGICAL)||(LA11_0>=GATE && LA11_0<=IF)||(LA11_0>=RETURN && LA11_0<=PRINT)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:129:5: pol_funkcji newline
            	    {
            	    pushFollow(FOLLOW_pol_funkcji_in_polecenia_fun707);
            	    pol_funkcji60=pol_funkcji();

            	    state._fsp--;

            	    stream_pol_funkcji.add(pol_funkcji60.getTree());
            	    pushFollow(FOLLOW_newline_in_polecenia_fun709);
            	    newline61=newline();

            	    state._fsp--;

            	    stream_newline.add(newline61.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: pol_funkcji, newline
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:27: -> ( pol_funkcji ^( NEWLINE newline ) )*
            {
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:129:30: ( pol_funkcji ^( NEWLINE newline ) )*
                while ( stream_pol_funkcji.hasNext()||stream_newline.hasNext() ) {
                    adaptor.addChild(root_0, stream_pol_funkcji.nextTree());
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:129:44: ^( NEWLINE newline )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                    adaptor.addChild(root_1, stream_newline.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_pol_funkcji.reset();
                stream_newline.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "polecenia_fun"

    public static class pol_funkcji_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pol_funkcji"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:132:1: pol_funkcji : ( pol_forargs | forargs -> ^( FORARGS forargs ) );
    public final czabtalParser.pol_funkcji_return pol_funkcji() throws RecognitionException {
        czabtalParser.pol_funkcji_return retval = new czabtalParser.pol_funkcji_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        czabtalParser.pol_forargs_return pol_forargs62 = null;

        czabtalParser.forargs_return forargs63 = null;


        RewriteRuleSubtreeStream stream_forargs=new RewriteRuleSubtreeStream(adaptor,"rule forargs");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:133:2: ( pol_forargs | forargs -> ^( FORARGS forargs ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=IDENT && LA12_0<=LOGICAL)||(LA12_0>=GATE && LA12_0<=IF)||(LA12_0>=RETURN && LA12_0<=PRINT)) ) {
                alt12=1;
            }
            else if ( (LA12_0==FORARGS) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:133:4: pol_forargs
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pol_forargs_in_pol_funkcji737);
                    pol_forargs62=pol_forargs();

                    state._fsp--;

                    adaptor.addChild(root_0, pol_forargs62.getTree());

                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:134:4: forargs
                    {
                    pushFollow(FOLLOW_forargs_in_pol_funkcji742);
                    forargs63=forargs();

                    state._fsp--;

                    stream_forargs.add(forargs63.getTree());


                    // AST REWRITE
                    // elements: forargs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 134:12: -> ^( FORARGS forargs )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:134:15: ^( FORARGS forargs )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORARGS, "FORARGS"), root_1);

                        adaptor.addChild(root_1, stream_forargs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pol_funkcji"

    public static class polecenia_forargs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "polecenia_forargs"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:137:1: polecenia_forargs : ( pol_forargs newline )* -> ( pol_forargs ^( NEWLINE newline ) )* ;
    public final czabtalParser.polecenia_forargs_return polecenia_forargs() throws RecognitionException {
        czabtalParser.polecenia_forargs_return retval = new czabtalParser.polecenia_forargs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        czabtalParser.pol_forargs_return pol_forargs64 = null;

        czabtalParser.newline_return newline65 = null;


        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_pol_forargs=new RewriteRuleSubtreeStream(adaptor,"rule pol_forargs");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:138:2: ( ( pol_forargs newline )* -> ( pol_forargs ^( NEWLINE newline ) )* )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:138:4: ( pol_forargs newline )*
            {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:138:4: ( pol_forargs newline )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=IDENT && LA13_0<=LOGICAL)||(LA13_0>=GATE && LA13_0<=IF)||(LA13_0>=RETURN && LA13_0<=PRINT)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:138:5: pol_forargs newline
            	    {
            	    pushFollow(FOLLOW_pol_forargs_in_polecenia_forargs762);
            	    pol_forargs64=pol_forargs();

            	    state._fsp--;

            	    stream_pol_forargs.add(pol_forargs64.getTree());
            	    pushFollow(FOLLOW_newline_in_polecenia_forargs764);
            	    newline65=newline();

            	    state._fsp--;

            	    stream_newline.add(newline65.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: newline, pol_forargs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:27: -> ( pol_forargs ^( NEWLINE newline ) )*
            {
                // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:138:30: ( pol_forargs ^( NEWLINE newline ) )*
                while ( stream_newline.hasNext()||stream_pol_forargs.hasNext() ) {
                    adaptor.addChild(root_0, stream_pol_forargs.nextTree());
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:138:43: ^( NEWLINE newline )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NEWLINE, "NEWLINE"), root_1);

                    adaptor.addChild(root_1, stream_newline.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_newline.reset();
                stream_pol_forargs.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "polecenia_forargs"

    public static class pol_forargs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pol_forargs"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:141:1: pol_forargs : ( pol_podst | returnR -> ^( RETURNR returnR ) );
    public final czabtalParser.pol_forargs_return pol_forargs() throws RecognitionException {
        czabtalParser.pol_forargs_return retval = new czabtalParser.pol_forargs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        czabtalParser.pol_podst_return pol_podst66 = null;

        czabtalParser.returnR_return returnR67 = null;


        RewriteRuleSubtreeStream stream_returnR=new RewriteRuleSubtreeStream(adaptor,"rule returnR");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:142:2: ( pol_podst | returnR -> ^( RETURNR returnR ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=IDENT && LA14_0<=LOGICAL)||(LA14_0>=GATE && LA14_0<=IF)||LA14_0==PRINT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RETURN) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:142:4: pol_podst
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pol_podst_in_pol_forargs790);
                    pol_podst66=pol_podst();

                    state._fsp--;

                    adaptor.addChild(root_0, pol_podst66.getTree());

                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:143:4: returnR
                    {
                    pushFollow(FOLLOW_returnR_in_pol_forargs795);
                    returnR67=returnR();

                    state._fsp--;

                    stream_returnR.add(returnR67.getTree());


                    // AST REWRITE
                    // elements: returnR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:13: -> ^( RETURNR returnR )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:143:16: ^( RETURNR returnR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURNR, "RETURNR"), root_1);

                        adaptor.addChild(root_1, stream_returnR.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pol_forargs"

    public static class typ_logiczny_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typ_logiczny"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:146:1: typ_logiczny : ( IDENT ON idki -> IDENT ^( IDKI idki ) | wyr_warun -> ^( WYR_WARUN wyr_warun ) );
    public final czabtalParser.typ_logiczny_return typ_logiczny() throws RecognitionException {
        czabtalParser.typ_logiczny_return retval = new czabtalParser.typ_logiczny_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT68=null;
        Token ON69=null;
        czabtalParser.idki_return idki70 = null;

        czabtalParser.wyr_warun_return wyr_warun71 = null;


        CommonTree IDENT68_tree=null;
        CommonTree ON69_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_wyr_warun=new RewriteRuleSubtreeStream(adaptor,"rule wyr_warun");
        RewriteRuleSubtreeStream stream_idki=new RewriteRuleSubtreeStream(adaptor,"rule idki");
        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:147:2: ( IDENT ON idki -> IDENT ^( IDKI idki ) | wyr_warun -> ^( WYR_WARUN wyr_warun ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==ON) ) {
                    alt15=1;
                }
                else if ( (LA15_1==NL||(LA15_1>=AND && LA15_1<=IS)) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==NOT||(LA15_0>=TRUE && LA15_0<=FALSE)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:147:4: IDENT ON idki
                    {
                    IDENT68=(Token)match(input,IDENT,FOLLOW_IDENT_in_typ_logiczny815);  
                    stream_IDENT.add(IDENT68);

                    ON69=(Token)match(input,ON,FOLLOW_ON_in_typ_logiczny817);  
                    stream_ON.add(ON69);

                    pushFollow(FOLLOW_idki_in_typ_logiczny819);
                    idki70=idki();

                    state._fsp--;

                    stream_idki.add(idki70.getTree());


                    // AST REWRITE
                    // elements: idki, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 147:19: -> IDENT ^( IDKI idki )
                    {
                        adaptor.addChild(root_0, stream_IDENT.nextNode());
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:147:28: ^( IDKI idki )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDKI, "IDKI"), root_1);

                        adaptor.addChild(root_1, stream_idki.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:149:4: wyr_warun
                    {
                    pushFollow(FOLLOW_wyr_warun_in_typ_logiczny837);
                    wyr_warun71=wyr_warun();

                    state._fsp--;

                    stream_wyr_warun.add(wyr_warun71.getTree());


                    // AST REWRITE
                    // elements: wyr_warun
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 149:17: -> ^( WYR_WARUN wyr_warun )
                    {
                        // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:149:20: ^( WYR_WARUN wyr_warun )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WYR_WARUN, "WYR_WARUN"), root_1);

                        adaptor.addChild(root_1, stream_wyr_warun.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typ_logiczny"

    public static class idki_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idki"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:152:1: idki : ( IDENT )+ ;
    public final czabtalParser.idki_return idki() throws RecognitionException {
        czabtalParser.idki_return retval = new czabtalParser.idki_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT72=null;

        CommonTree IDENT72_tree=null;

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:152:6: ( ( IDENT )+ )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:152:8: ( IDENT )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:152:8: ( IDENT )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:152:9: IDENT
            	    {
            	    IDENT72=(Token)match(input,IDENT,FOLLOW_IDENT_in_idki859); 
            	    IDENT72_tree = (CommonTree)adaptor.create(IDENT72);
            	    adaptor.addChild(root_0, IDENT72_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idki"

    public static class wyr_warun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wyr_warun"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:156:1: wyr_warun : ( logiczne wyr_warun_right | NOT logiczne wyr_warun_right );
    public final czabtalParser.wyr_warun_return wyr_warun() throws RecognitionException {
        czabtalParser.wyr_warun_return retval = new czabtalParser.wyr_warun_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT75=null;
        czabtalParser.logiczne_return logiczne73 = null;

        czabtalParser.wyr_warun_right_return wyr_warun_right74 = null;

        czabtalParser.logiczne_return logiczne76 = null;

        czabtalParser.wyr_warun_right_return wyr_warun_right77 = null;


        CommonTree NOT75_tree=null;

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:157:2: ( logiczne wyr_warun_right | NOT logiczne wyr_warun_right )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT||(LA17_0>=TRUE && LA17_0<=FALSE)) ) {
                alt17=1;
            }
            else if ( (LA17_0==NOT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:157:4: logiczne wyr_warun_right
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_logiczne_in_wyr_warun875);
                    logiczne73=logiczne();

                    state._fsp--;

                    adaptor.addChild(root_0, logiczne73.getTree());
                    pushFollow(FOLLOW_wyr_warun_right_in_wyr_warun877);
                    wyr_warun_right74=wyr_warun_right();

                    state._fsp--;

                    adaptor.addChild(root_0, wyr_warun_right74.getTree());

                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:158:4: NOT logiczne wyr_warun_right
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT75=(Token)match(input,NOT,FOLLOW_NOT_in_wyr_warun882); 
                    NOT75_tree = (CommonTree)adaptor.create(NOT75);
                    adaptor.addChild(root_0, NOT75_tree);

                    pushFollow(FOLLOW_logiczne_in_wyr_warun884);
                    logiczne76=logiczne();

                    state._fsp--;

                    adaptor.addChild(root_0, logiczne76.getTree());
                    pushFollow(FOLLOW_wyr_warun_right_in_wyr_warun886);
                    wyr_warun_right77=wyr_warun_right();

                    state._fsp--;

                    adaptor.addChild(root_0, wyr_warun_right77.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "wyr_warun"

    public static class wyr_warun_right_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "wyr_warun_right"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:161:1: wyr_warun_right : ( AND wyr_warun | OR wyr_warun | IS wyr_warun )? ;
    public final czabtalParser.wyr_warun_right_return wyr_warun_right() throws RecognitionException {
        czabtalParser.wyr_warun_right_return retval = new czabtalParser.wyr_warun_right_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND78=null;
        Token OR80=null;
        Token IS82=null;
        czabtalParser.wyr_warun_return wyr_warun79 = null;

        czabtalParser.wyr_warun_return wyr_warun81 = null;

        czabtalParser.wyr_warun_return wyr_warun83 = null;


        CommonTree AND78_tree=null;
        CommonTree OR80_tree=null;
        CommonTree IS82_tree=null;

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:162:2: ( ( AND wyr_warun | OR wyr_warun | IS wyr_warun )? )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:162:4: ( AND wyr_warun | OR wyr_warun | IS wyr_warun )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:162:4: ( AND wyr_warun | OR wyr_warun | IS wyr_warun )?
            int alt18=4;
            switch ( input.LA(1) ) {
                case AND:
                    {
                    alt18=1;
                    }
                    break;
                case OR:
                    {
                    alt18=2;
                    }
                    break;
                case IS:
                    {
                    alt18=3;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:163:4: AND wyr_warun
                    {
                    AND78=(Token)match(input,AND,FOLLOW_AND_in_wyr_warun_right902); 
                    AND78_tree = (CommonTree)adaptor.create(AND78);
                    adaptor.addChild(root_0, AND78_tree);

                    pushFollow(FOLLOW_wyr_warun_in_wyr_warun_right904);
                    wyr_warun79=wyr_warun();

                    state._fsp--;

                    adaptor.addChild(root_0, wyr_warun79.getTree());

                    }
                    break;
                case 2 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:164:4: OR wyr_warun
                    {
                    OR80=(Token)match(input,OR,FOLLOW_OR_in_wyr_warun_right909); 
                    OR80_tree = (CommonTree)adaptor.create(OR80);
                    adaptor.addChild(root_0, OR80_tree);

                    pushFollow(FOLLOW_wyr_warun_in_wyr_warun_right911);
                    wyr_warun81=wyr_warun();

                    state._fsp--;

                    adaptor.addChild(root_0, wyr_warun81.getTree());

                    }
                    break;
                case 3 :
                    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:165:4: IS wyr_warun
                    {
                    IS82=(Token)match(input,IS,FOLLOW_IS_in_wyr_warun_right916); 
                    IS82_tree = (CommonTree)adaptor.create(IS82);
                    adaptor.addChild(root_0, IS82_tree);

                    pushFollow(FOLLOW_wyr_warun_in_wyr_warun_right918);
                    wyr_warun83=wyr_warun();

                    state._fsp--;

                    adaptor.addChild(root_0, wyr_warun83.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "wyr_warun_right"

    public static class logiczne_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logiczne"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:169:1: logiczne : ( TRUE | FALSE | IDENT );
    public final czabtalParser.logiczne_return logiczne() throws RecognitionException {
        czabtalParser.logiczne_return retval = new czabtalParser.logiczne_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set84=null;

        CommonTree set84_tree=null;

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:169:9: ( TRUE | FALSE | IDENT )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set84=(Token)input.LT(1);
            if ( input.LA(1)==IDENT||(input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set84));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logiczne"

    public static class newline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newline"
    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:172:1: newline : ( NL )+ ;
    public final czabtalParser.newline_return newline() throws RecognitionException {
        czabtalParser.newline_return retval = new czabtalParser.newline_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL85=null;

        CommonTree NL85_tree=null;

        try {
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:172:9: ( ( NL )+ )
            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:172:11: ( NL )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:172:11: ( NL )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==NL) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/czaber/Pobrane/Czabtal/src/czabtal/czabtal.g:172:12: NL
            	    {
            	    NL85=(Token)match(input,NL,FOLLOW_NL_in_newline952); 
            	    NL85_tree = (CommonTree)adaptor.create(NL85);
            	    adaptor.addChild(root_0, NL85_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newline"

    // Delegated rules


 

    public static final BitSet FOLLOW_NL_in_start139 = new BitSet(new long[]{0x000000088DE00002L});
    public static final BitSet FOLLOW_polecenie_in_start144 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_start146 = new BitSet(new long[]{0x000000088DC00002L});
    public static final BitSet FOLLOW_pol_podst_in_polecenie180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_def_in_polecenie189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importR_in_polecenie204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dekl_in_pol_podst231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifR_in_pol_podst247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printR_in_pol_podst262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_przyp_in_pol_podst276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importR298 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_importR300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_in_dekl318 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_dekl320 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AS_in_dekl323 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_typ_logiczny_in_dekl325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GATE_in_dekl347 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_dekl349 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AS_in_dekl351 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_dekl353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_przyp373 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_AS_in_przyp375 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_typ_logiczny_in_przyp377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifR397 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_wyr_warun_in_ifR399 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_ifR401 = new BitSet(new long[]{0x0000000C7D840000L});
    public static final BitSet FOLLOW_polecenia_fun_in_ifR403 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_elseR_in_ifR405 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ENDIF_in_ifR407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseR454 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_wyr_warun_in_elseR456 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_elseR458 = new BitSet(new long[]{0x0000000C6D840000L});
    public static final BitSet FOLLOW_polecenia_fun_in_elseR460 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_elseR_in_elseR462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseR498 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_elseR500 = new BitSet(new long[]{0x0000000C0D840000L});
    public static final BitSet FOLLOW_polecenia_fun_in_elseR502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GATEDEF_in_def535 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_def537 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_args_in_def539 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_def541 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BEGIN_in_def543 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_def545 = new BitSet(new long[]{0x0000000E0D840000L});
    public static final BitSet FOLLOW_polecenia_fun_in_def547 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_END_in_def549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_args593 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_ARGS_in_args598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGS_in_args607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORARGS_in_forargs618 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IDENT_in_forargs620 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_forargs622 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BEGIN_in_forargs624 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_forargs626 = new BitSet(new long[]{0x0000000E0D800000L});
    public static final BitSet FOLLOW_polecenia_forargs_in_forargs628 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_END_in_forargs630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnR665 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_typ_logiczny_in_returnR667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printR685 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_typ_logiczny_in_printR687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pol_funkcji_in_polecenia_fun707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_polecenia_fun709 = new BitSet(new long[]{0x0000000C0D840002L});
    public static final BitSet FOLLOW_pol_forargs_in_pol_funkcji737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forargs_in_pol_funkcji742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pol_forargs_in_polecenia_forargs762 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_newline_in_polecenia_forargs764 = new BitSet(new long[]{0x0000000C0D800002L});
    public static final BitSet FOLLOW_pol_podst_in_pol_forargs790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnR_in_pol_forargs795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typ_logiczny815 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ON_in_typ_logiczny817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_idki_in_typ_logiczny819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wyr_warun_in_typ_logiczny837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idki859 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_logiczne_in_wyr_warun875 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_wyr_warun_right_in_wyr_warun877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_wyr_warun882 = new BitSet(new long[]{0x0000060000800000L});
    public static final BitSet FOLLOW_logiczne_in_wyr_warun884 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_wyr_warun_right_in_wyr_warun886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_wyr_warun_right902 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_wyr_warun_in_wyr_warun_right904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_wyr_warun_right909 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_wyr_warun_in_wyr_warun_right911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_wyr_warun_right916 = new BitSet(new long[]{0x0000062000800000L});
    public static final BitSet FOLLOW_wyr_warun_in_wyr_warun_right918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_logiczne0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_newline952 = new BitSet(new long[]{0x0000000000200002L});

}