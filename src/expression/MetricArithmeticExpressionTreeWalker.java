// $ANTLR 3.4 MetricArithmeticExpressionTreeWalker.g 2013-05-02 06:56:27
 package net.opentsdb.expression; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetricArithmeticExpressionTreeWalker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public MetricArithmeticExpressionTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public MetricArithmeticExpressionTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return MetricArithmeticExpressionTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "MetricArithmeticExpressionTreeWalker.g"; }



    // $ANTLR start "parse"
    // MetricArithmeticExpressionTreeWalker.g:15:1: parse returns [ArithmeticNode node] : e= expr ;
    public final ArithmeticNode parse() throws RecognitionException {
        ArithmeticNode node = null;


        ArithmeticNode e =null;


        try {
            // MetricArithmeticExpressionTreeWalker.g:15:35: (e= expr )
            // MetricArithmeticExpressionTreeWalker.g:15:37: e= expr
            {
            pushFollow(FOLLOW_expr_in_parse50);
            e=expr();

            state._fsp--;


             node = e; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "parse"



    // $ANTLR start "expr"
    // MetricArithmeticExpressionTreeWalker.g:17:1: expr returns [ArithmeticNode node] : ( ^( ADD a= expr b= expr ) | ^( SUBTRACT a= expr b= expr ) | ^( MULTIPLY a= expr b= expr ) | ^( DIVIDE a= expr b= expr ) | ^( FUNCTION_NAME p= params ) |metric= METRIC |literal= LITERAL | ( PARAM_SEPARATOR ) );
    public final ArithmeticNode expr() throws RecognitionException {
        ArithmeticNode node = null;


        CommonTree metric=null;
        CommonTree literal=null;
        CommonTree FUNCTION_NAME1=null;
        ArithmeticNode a =null;

        ArithmeticNode b =null;

        List p =null;


        try {
            // MetricArithmeticExpressionTreeWalker.g:18:9: ( ^( ADD a= expr b= expr ) | ^( SUBTRACT a= expr b= expr ) | ^( MULTIPLY a= expr b= expr ) | ^( DIVIDE a= expr b= expr ) | ^( FUNCTION_NAME p= params ) |metric= METRIC |literal= LITERAL | ( PARAM_SEPARATOR ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case ADD:
                {
                alt1=1;
                }
                break;
            case SUBTRACT:
                {
                alt1=2;
                }
                break;
            case MULTIPLY:
                {
                alt1=3;
                }
                break;
            case DIVIDE:
                {
                alt1=4;
                }
                break;
            case FUNCTION_NAME:
                {
                alt1=5;
                }
                break;
            case METRIC:
                {
                alt1=6;
                }
                break;
            case LITERAL:
                {
                alt1=7;
                }
                break;
            case PARAM_SEPARATOR:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // MetricArithmeticExpressionTreeWalker.g:18:11: ^( ADD a= expr b= expr )
                    {
                    match(input,ADD,FOLLOW_ADD_in_expr72); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr76);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr80);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     node = new OperatorNode(a, Operator.ADD, b); 

                    }
                    break;
                case 2 :
                    // MetricArithmeticExpressionTreeWalker.g:19:11: ^( SUBTRACT a= expr b= expr )
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_expr97); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr101);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr105);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     node = new OperatorNode(a, Operator.SUBTRACT, b); 

                    }
                    break;
                case 3 :
                    // MetricArithmeticExpressionTreeWalker.g:20:11: ^( MULTIPLY a= expr b= expr )
                    {
                    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_expr122); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr126);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr130);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     node = new OperatorNode(a, Operator.MULTIPLY, b); 

                    }
                    break;
                case 4 :
                    // MetricArithmeticExpressionTreeWalker.g:21:11: ^( DIVIDE a= expr b= expr )
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_expr147); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr151);
                    a=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr155);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     node = new OperatorNode(a, Operator.DIVIDE, b); 

                    }
                    break;
                case 5 :
                    // MetricArithmeticExpressionTreeWalker.g:22:11: ^( FUNCTION_NAME p= params )
                    {
                    FUNCTION_NAME1=(CommonTree)match(input,FUNCTION_NAME,FOLLOW_FUNCTION_NAME_in_expr172); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_params_in_expr176);
                    p=params();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     node = new FunctionNode((FUNCTION_NAME1!=null?FUNCTION_NAME1.getText():null), p); 

                    }
                    break;
                case 6 :
                    // MetricArithmeticExpressionTreeWalker.g:23:11: metric= METRIC
                    {
                    metric=(CommonTree)match(input,METRIC,FOLLOW_METRIC_in_expr196); 

                     node = new MetricNode((metric!=null?metric.getText():null)); 

                    }
                    break;
                case 7 :
                    // MetricArithmeticExpressionTreeWalker.g:24:11: literal= LITERAL
                    {
                    literal=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_expr214); 

                     node = new LiteralNode((literal!=null?literal.getText():null)); 

                    }
                    break;
                case 8 :
                    // MetricArithmeticExpressionTreeWalker.g:25:11: ( PARAM_SEPARATOR )
                    {
                    // MetricArithmeticExpressionTreeWalker.g:25:11: ( PARAM_SEPARATOR )
                    // MetricArithmeticExpressionTreeWalker.g:25:12: PARAM_SEPARATOR
                    {
                    match(input,PARAM_SEPARATOR,FOLLOW_PARAM_SEPARATOR_in_expr229); 

                    }


                     

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "expr"



    // $ANTLR start "params"
    // MetricArithmeticExpressionTreeWalker.g:28:1: params returns [List result] : (e= expr )+ ;
    public final List params() throws RecognitionException {
        List result = null;


        ArithmeticNode e =null;


         result = new ArrayList(); 
        try {
            // MetricArithmeticExpressionTreeWalker.g:30:9: ( (e= expr )+ )
            // MetricArithmeticExpressionTreeWalker.g:30:11: (e= expr )+
            {
            // MetricArithmeticExpressionTreeWalker.g:30:11: (e= expr )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= ADD && LA2_0 <= DIVIDE)||LA2_0==FUNCTION_NAME||LA2_0==LITERAL||(LA2_0 >= METRIC && LA2_0 <= PARAM_SEPARATOR)||LA2_0==SUBTRACT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MetricArithmeticExpressionTreeWalker.g:30:12: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_params284);
            	    e=expr();

            	    state._fsp--;


            	     result.add(e); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "params"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_parse50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_expr72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr76 = new BitSet(new long[]{0x00000000000174B0L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTRACT_in_expr97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr101 = new BitSet(new long[]{0x00000000000174B0L});
    public static final BitSet FOLLOW_expr_in_expr105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTIPLY_in_expr122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr126 = new BitSet(new long[]{0x00000000000174B0L});
    public static final BitSet FOLLOW_expr_in_expr130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expr147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr151 = new BitSet(new long[]{0x00000000000174B0L});
    public static final BitSet FOLLOW_expr_in_expr155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_NAME_in_expr172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_params_in_expr176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METRIC_in_expr196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_expr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_SEPARATOR_in_expr229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params284 = new BitSet(new long[]{0x00000000000174B2L});

}