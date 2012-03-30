// $ANTLR 3.4 net/opentsdb/expression/MetricArithmeticExpression.g 2012-03-29 09:08:03
 package net.opentsdb.expression; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetricArithmeticExpressionParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "DIVIDE", "Digit", "LEFT_PARENTHESIS", "Letter", "METRIC", "MULTIPLY", "RIGHT_PARENTHESIS", "SUBTRACT", "Separator", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int DIVIDE=5;
    public static final int Digit=6;
    public static final int LEFT_PARENTHESIS=7;
    public static final int Letter=8;
    public static final int METRIC=9;
    public static final int MULTIPLY=10;
    public static final int RIGHT_PARENTHESIS=11;
    public static final int SUBTRACT=12;
    public static final int Separator=13;
    public static final int WHITESPACE=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MetricArithmeticExpressionParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MetricArithmeticExpressionParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MetricArithmeticExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "net/opentsdb/expression/MetricArithmeticExpression.g"; }




    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parse"
    // net/opentsdb/expression/MetricArithmeticExpression.g:27:1: parse : expr ;
    public final MetricArithmeticExpressionParser.parse_return parse() throws RecognitionException {
        MetricArithmeticExpressionParser.parse_return retval = new MetricArithmeticExpressionParser.parse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetricArithmeticExpressionParser.expr_return expr1 =null;



        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:27:6: ( expr )
            // net/opentsdb/expression/MetricArithmeticExpression.g:27:8: expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_parse123);
            expr1=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr1.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parse"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // net/opentsdb/expression/MetricArithmeticExpression.g:29:1: expr : term ( ( ADD ^| SUBTRACT ^) term )* ;
    public final MetricArithmeticExpressionParser.expr_return expr() throws RecognitionException {
        MetricArithmeticExpressionParser.expr_return retval = new MetricArithmeticExpressionParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD3=null;
        Token SUBTRACT4=null;
        MetricArithmeticExpressionParser.term_return term2 =null;

        MetricArithmeticExpressionParser.term_return term5 =null;


        Object ADD3_tree=null;
        Object SUBTRACT4_tree=null;

        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:29:5: ( term ( ( ADD ^| SUBTRACT ^) term )* )
            // net/opentsdb/expression/MetricArithmeticExpression.g:29:7: term ( ( ADD ^| SUBTRACT ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_expr130);
            term2=term();

            state._fsp--;

            adaptor.addChild(root_0, term2.getTree());

            // net/opentsdb/expression/MetricArithmeticExpression.g:29:12: ( ( ADD ^| SUBTRACT ^) term )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ADD||LA2_0==SUBTRACT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // net/opentsdb/expression/MetricArithmeticExpression.g:29:13: ( ADD ^| SUBTRACT ^) term
            	    {
            	    // net/opentsdb/expression/MetricArithmeticExpression.g:29:13: ( ADD ^| SUBTRACT ^)
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==ADD) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==SUBTRACT) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // net/opentsdb/expression/MetricArithmeticExpression.g:29:14: ADD ^
            	            {
            	            ADD3=(Token)match(input,ADD,FOLLOW_ADD_in_expr134); 
            	            ADD3_tree = 
            	            (Object)adaptor.create(ADD3)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(ADD3_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // net/opentsdb/expression/MetricArithmeticExpression.g:29:21: SUBTRACT ^
            	            {
            	            SUBTRACT4=(Token)match(input,SUBTRACT,FOLLOW_SUBTRACT_in_expr139); 
            	            SUBTRACT4_tree = 
            	            (Object)adaptor.create(SUBTRACT4)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUBTRACT4_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_expr143);
            	    term5=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // net/opentsdb/expression/MetricArithmeticExpression.g:31:1: term : factor ( ( MULTIPLY ^| DIVIDE ^) factor )* ;
    public final MetricArithmeticExpressionParser.term_return term() throws RecognitionException {
        MetricArithmeticExpressionParser.term_return retval = new MetricArithmeticExpressionParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULTIPLY7=null;
        Token DIVIDE8=null;
        MetricArithmeticExpressionParser.factor_return factor6 =null;

        MetricArithmeticExpressionParser.factor_return factor9 =null;


        Object MULTIPLY7_tree=null;
        Object DIVIDE8_tree=null;

        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:31:5: ( factor ( ( MULTIPLY ^| DIVIDE ^) factor )* )
            // net/opentsdb/expression/MetricArithmeticExpression.g:31:7: factor ( ( MULTIPLY ^| DIVIDE ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term153);
            factor6=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor6.getTree());

            // net/opentsdb/expression/MetricArithmeticExpression.g:31:14: ( ( MULTIPLY ^| DIVIDE ^) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DIVIDE||LA4_0==MULTIPLY) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // net/opentsdb/expression/MetricArithmeticExpression.g:31:15: ( MULTIPLY ^| DIVIDE ^) factor
            	    {
            	    // net/opentsdb/expression/MetricArithmeticExpression.g:31:15: ( MULTIPLY ^| DIVIDE ^)
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==MULTIPLY) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==DIVIDE) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // net/opentsdb/expression/MetricArithmeticExpression.g:31:16: MULTIPLY ^
            	            {
            	            MULTIPLY7=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term157); 
            	            MULTIPLY7_tree = 
            	            (Object)adaptor.create(MULTIPLY7)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MULTIPLY7_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // net/opentsdb/expression/MetricArithmeticExpression.g:31:28: DIVIDE ^
            	            {
            	            DIVIDE8=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_term162); 
            	            DIVIDE8_tree = 
            	            (Object)adaptor.create(DIVIDE8)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIVIDE8_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term166);
            	    factor9=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // net/opentsdb/expression/MetricArithmeticExpression.g:33:1: factor : ( METRIC | LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !);
    public final MetricArithmeticExpressionParser.factor_return factor() throws RecognitionException {
        MetricArithmeticExpressionParser.factor_return retval = new MetricArithmeticExpressionParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token METRIC10=null;
        Token LEFT_PARENTHESIS11=null;
        Token RIGHT_PARENTHESIS13=null;
        MetricArithmeticExpressionParser.expr_return expr12 =null;


        Object METRIC10_tree=null;
        Object LEFT_PARENTHESIS11_tree=null;
        Object RIGHT_PARENTHESIS13_tree=null;

        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:33:7: ( METRIC | LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !)
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==METRIC) ) {
                alt5=1;
            }
            else if ( (LA5_0==LEFT_PARENTHESIS) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // net/opentsdb/expression/MetricArithmeticExpression.g:33:9: METRIC
                    {
                    root_0 = (Object)adaptor.nil();


                    METRIC10=(Token)match(input,METRIC,FOLLOW_METRIC_in_factor175); 
                    METRIC10_tree = 
                    (Object)adaptor.create(METRIC10)
                    ;
                    adaptor.addChild(root_0, METRIC10_tree);


                    }
                    break;
                case 2 :
                    // net/opentsdb/expression/MetricArithmeticExpression.g:33:18: LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !
                    {
                    root_0 = (Object)adaptor.nil();


                    LEFT_PARENTHESIS11=(Token)match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_factor179); 

                    pushFollow(FOLLOW_expr_in_factor182);
                    expr12=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr12.getTree());

                    RIGHT_PARENTHESIS13=(Token)match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_factor184); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_parse123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr130 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ADD_in_expr134 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_SUBTRACT_in_expr139 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_term_in_expr143 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_factor_in_term153 = new BitSet(new long[]{0x0000000000000422L});
    public static final BitSet FOLLOW_MULTIPLY_in_term157 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_DIVIDE_in_term162 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_factor_in_term166 = new BitSet(new long[]{0x0000000000000422L});
    public static final BitSet FOLLOW_METRIC_in_factor175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_factor179 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_expr_in_factor182 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_factor184 = new BitSet(new long[]{0x0000000000000002L});

}