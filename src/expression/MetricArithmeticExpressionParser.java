// $ANTLR 3.4 MetricArithmeticExpression.g 2013-05-02 06:56:27
 package net.opentsdb.expression; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetricArithmeticExpressionParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "DIVIDE", "Digit", "FUNCTION_NAME", "IDENTIFIER", "LEFT_PARENTHESIS", "LITERAL", "Letter", "METRIC", "MULTIPLY", "PARAM_SEPARATOR", "RIGHT_PARENTHESIS", "SUBTRACT", "Separator", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int DIVIDE=5;
    public static final int Digit=6;
    public static final int FUNCTION_NAME=7;
    public static final int IDENTIFIER=8;
    public static final int LEFT_PARENTHESIS=9;
    public static final int LITERAL=10;
    public static final int Letter=11;
    public static final int METRIC=12;
    public static final int MULTIPLY=13;
    public static final int PARAM_SEPARATOR=14;
    public static final int RIGHT_PARENTHESIS=15;
    public static final int SUBTRACT=16;
    public static final int Separator=17;
    public static final int WHITESPACE=18;

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
    public String getGrammarFileName() { return "MetricArithmeticExpression.g"; }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parse"
    // MetricArithmeticExpression.g:24:1: parse : expr ;
    public final MetricArithmeticExpressionParser.parse_return parse() throws RecognitionException {
        MetricArithmeticExpressionParser.parse_return retval = new MetricArithmeticExpressionParser.parse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetricArithmeticExpressionParser.expr_return expr1 =null;



        try {
            // MetricArithmeticExpression.g:24:6: ( expr )
            // MetricArithmeticExpression.g:24:8: expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_parse117);
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
    // MetricArithmeticExpression.g:26:1: expr : term ( ( ADD ^| SUBTRACT ^) term )* ;
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
            // MetricArithmeticExpression.g:26:5: ( term ( ( ADD ^| SUBTRACT ^) term )* )
            // MetricArithmeticExpression.g:26:7: term ( ( ADD ^| SUBTRACT ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_expr124);
            term2=term();

            state._fsp--;

            adaptor.addChild(root_0, term2.getTree());

            // MetricArithmeticExpression.g:26:12: ( ( ADD ^| SUBTRACT ^) term )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ADD||LA2_0==SUBTRACT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MetricArithmeticExpression.g:26:13: ( ADD ^| SUBTRACT ^) term
            	    {
            	    // MetricArithmeticExpression.g:26:13: ( ADD ^| SUBTRACT ^)
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
            	            // MetricArithmeticExpression.g:26:14: ADD ^
            	            {
            	            ADD3=(Token)match(input,ADD,FOLLOW_ADD_in_expr128); 
            	            ADD3_tree = 
            	            (Object)adaptor.create(ADD3)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(ADD3_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // MetricArithmeticExpression.g:26:21: SUBTRACT ^
            	            {
            	            SUBTRACT4=(Token)match(input,SUBTRACT,FOLLOW_SUBTRACT_in_expr133); 
            	            SUBTRACT4_tree = 
            	            (Object)adaptor.create(SUBTRACT4)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUBTRACT4_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_expr137);
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
    // MetricArithmeticExpression.g:28:1: term : factor ( ( MULTIPLY ^| DIVIDE ^) factor )* ;
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
            // MetricArithmeticExpression.g:28:5: ( factor ( ( MULTIPLY ^| DIVIDE ^) factor )* )
            // MetricArithmeticExpression.g:28:7: factor ( ( MULTIPLY ^| DIVIDE ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term146);
            factor6=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor6.getTree());

            // MetricArithmeticExpression.g:28:14: ( ( MULTIPLY ^| DIVIDE ^) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DIVIDE||LA4_0==MULTIPLY) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // MetricArithmeticExpression.g:28:15: ( MULTIPLY ^| DIVIDE ^) factor
            	    {
            	    // MetricArithmeticExpression.g:28:15: ( MULTIPLY ^| DIVIDE ^)
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
            	            // MetricArithmeticExpression.g:28:16: MULTIPLY ^
            	            {
            	            MULTIPLY7=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term150); 
            	            MULTIPLY7_tree = 
            	            (Object)adaptor.create(MULTIPLY7)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MULTIPLY7_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // MetricArithmeticExpression.g:28:28: DIVIDE ^
            	            {
            	            DIVIDE8=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_term155); 
            	            DIVIDE8_tree = 
            	            (Object)adaptor.create(DIVIDE8)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIVIDE8_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term159);
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
    // MetricArithmeticExpression.g:30:1: factor : ( LITERAL | METRIC | function | ( LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !) );
    public final MetricArithmeticExpressionParser.factor_return factor() throws RecognitionException {
        MetricArithmeticExpressionParser.factor_return retval = new MetricArithmeticExpressionParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LITERAL10=null;
        Token METRIC11=null;
        Token LEFT_PARENTHESIS13=null;
        Token RIGHT_PARENTHESIS15=null;
        MetricArithmeticExpressionParser.function_return function12 =null;

        MetricArithmeticExpressionParser.expr_return expr14 =null;


        Object LITERAL10_tree=null;
        Object METRIC11_tree=null;
        Object LEFT_PARENTHESIS13_tree=null;
        Object RIGHT_PARENTHESIS15_tree=null;

        try {
            // MetricArithmeticExpression.g:30:7: ( LITERAL | METRIC | function | ( LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case LITERAL:
                {
                alt5=1;
                }
                break;
            case METRIC:
                {
                alt5=2;
                }
                break;
            case FUNCTION_NAME:
                {
                alt5=3;
                }
                break;
            case LEFT_PARENTHESIS:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // MetricArithmeticExpression.g:30:9: LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    LITERAL10=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_factor168); 
                    LITERAL10_tree = 
                    (Object)adaptor.create(LITERAL10)
                    ;
                    adaptor.addChild(root_0, LITERAL10_tree);


                    }
                    break;
                case 2 :
                    // MetricArithmeticExpression.g:30:19: METRIC
                    {
                    root_0 = (Object)adaptor.nil();


                    METRIC11=(Token)match(input,METRIC,FOLLOW_METRIC_in_factor172); 
                    METRIC11_tree = 
                    (Object)adaptor.create(METRIC11)
                    ;
                    adaptor.addChild(root_0, METRIC11_tree);


                    }
                    break;
                case 3 :
                    // MetricArithmeticExpression.g:30:28: function
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_function_in_factor176);
                    function12=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function12.getTree());

                    }
                    break;
                case 4 :
                    // MetricArithmeticExpression.g:30:39: ( LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !)
                    {
                    root_0 = (Object)adaptor.nil();


                    // MetricArithmeticExpression.g:30:39: ( LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !)
                    // MetricArithmeticExpression.g:30:40: LEFT_PARENTHESIS ! expr RIGHT_PARENTHESIS !
                    {
                    LEFT_PARENTHESIS13=(Token)match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_factor181); 

                    pushFollow(FOLLOW_expr_in_factor184);
                    expr14=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr14.getTree());

                    RIGHT_PARENTHESIS15=(Token)match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_factor186); 

                    }


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


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // MetricArithmeticExpression.g:32:1: function : FUNCTION_NAME ^ LEFT_PARENTHESIS ! expr ( PARAM_SEPARATOR ! expr )* RIGHT_PARENTHESIS !;
    public final MetricArithmeticExpressionParser.function_return function() throws RecognitionException {
        MetricArithmeticExpressionParser.function_return retval = new MetricArithmeticExpressionParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FUNCTION_NAME16=null;
        Token LEFT_PARENTHESIS17=null;
        Token PARAM_SEPARATOR19=null;
        Token RIGHT_PARENTHESIS21=null;
        MetricArithmeticExpressionParser.expr_return expr18 =null;

        MetricArithmeticExpressionParser.expr_return expr20 =null;


        Object FUNCTION_NAME16_tree=null;
        Object LEFT_PARENTHESIS17_tree=null;
        Object PARAM_SEPARATOR19_tree=null;
        Object RIGHT_PARENTHESIS21_tree=null;

        try {
            // MetricArithmeticExpression.g:32:9: ( FUNCTION_NAME ^ LEFT_PARENTHESIS ! expr ( PARAM_SEPARATOR ! expr )* RIGHT_PARENTHESIS !)
            // MetricArithmeticExpression.g:32:11: FUNCTION_NAME ^ LEFT_PARENTHESIS ! expr ( PARAM_SEPARATOR ! expr )* RIGHT_PARENTHESIS !
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION_NAME16=(Token)match(input,FUNCTION_NAME,FOLLOW_FUNCTION_NAME_in_function196); 
            FUNCTION_NAME16_tree = 
            (Object)adaptor.create(FUNCTION_NAME16)
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION_NAME16_tree, root_0);


            LEFT_PARENTHESIS17=(Token)match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_function199); 

            pushFollow(FOLLOW_expr_in_function202);
            expr18=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr18.getTree());

            // MetricArithmeticExpression.g:32:49: ( PARAM_SEPARATOR ! expr )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==PARAM_SEPARATOR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MetricArithmeticExpression.g:32:50: PARAM_SEPARATOR ! expr
            	    {
            	    PARAM_SEPARATOR19=(Token)match(input,PARAM_SEPARATOR,FOLLOW_PARAM_SEPARATOR_in_function205); 

            	    pushFollow(FOLLOW_expr_in_function208);
            	    expr20=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr20.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            RIGHT_PARENTHESIS21=(Token)match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_function212); 

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
    // $ANTLR end "function"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_parse117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr124 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_ADD_in_expr128 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_SUBTRACT_in_expr133 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_term_in_expr137 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_factor_in_term146 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_MULTIPLY_in_term150 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_DIVIDE_in_term155 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_factor_in_term159 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_LITERAL_in_factor168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METRIC_in_factor172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_factor176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_factor181 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_expr_in_factor184 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_factor186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_NAME_in_function196 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_function199 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_expr_in_function202 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_PARAM_SEPARATOR_in_function205 = new BitSet(new long[]{0x0000000000001680L});
    public static final BitSet FOLLOW_expr_in_function208 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_function212 = new BitSet(new long[]{0x0000000000000002L});

}