// $ANTLR 3.4 net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g 2012-03-29 09:08:03
 package net.opentsdb.expression; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetricArithmeticExpressionTreeWalker extends TreeParser {
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
    public String getGrammarFileName() { return "net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g"; }



    // $ANTLR start "parse"
    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:15:1: parse returns [ArithmeticNode node] : e= expr ;
    public final ArithmeticNode parse() throws RecognitionException {
        ArithmeticNode node = null;


        ArithmeticNode e =null;


        try {
            // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:15:35: (e= expr )
            // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:15:37: e= expr
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
    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:17:1: expr returns [ArithmeticNode node] : ( ^( ADD a= expr b= expr ) | ^( SUBTRACT a= expr b= expr ) | ^( MULTIPLY a= expr b= expr ) | ^( DIVIDE a= expr b= expr ) |metric= METRIC );
    public final ArithmeticNode expr() throws RecognitionException {
        ArithmeticNode node = null;


        CommonTree metric=null;
        ArithmeticNode a =null;

        ArithmeticNode b =null;


        try {
            // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:18:9: ( ^( ADD a= expr b= expr ) | ^( SUBTRACT a= expr b= expr ) | ^( MULTIPLY a= expr b= expr ) | ^( DIVIDE a= expr b= expr ) |metric= METRIC )
            int alt1=5;
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
            case METRIC:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:18:11: ^( ADD a= expr b= expr )
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
                    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:19:11: ^( SUBTRACT a= expr b= expr )
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
                    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:20:11: ^( MULTIPLY a= expr b= expr )
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
                    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:21:11: ^( DIVIDE a= expr b= expr )
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
                    // net/opentsdb/expression/MetricArithmeticExpressionTreeWalker.g:22:11: metric= METRIC
                    {
                    metric=(CommonTree)match(input,METRIC,FOLLOW_METRIC_in_expr175); 

                     node = new MetricNode((metric!=null?metric.getText():null)); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_parse50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_expr72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr76 = new BitSet(new long[]{0x0000000000001630L});
    public static final BitSet FOLLOW_expr_in_expr80 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTRACT_in_expr97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr101 = new BitSet(new long[]{0x0000000000001630L});
    public static final BitSet FOLLOW_expr_in_expr105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTIPLY_in_expr122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr126 = new BitSet(new long[]{0x0000000000001630L});
    public static final BitSet FOLLOW_expr_in_expr130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expr147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr151 = new BitSet(new long[]{0x0000000000001630L});
    public static final BitSet FOLLOW_expr_in_expr155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METRIC_in_expr175 = new BitSet(new long[]{0x0000000000000002L});

}