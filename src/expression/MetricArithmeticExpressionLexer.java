// $ANTLR 3.4 net/opentsdb/expression/MetricArithmeticExpression.g 2012-03-29 09:08:03
 package net.opentsdb.expression; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetricArithmeticExpressionLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MetricArithmeticExpressionLexer() {} 
    public MetricArithmeticExpressionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MetricArithmeticExpressionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "net/opentsdb/expression/MetricArithmeticExpression.g"; }

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:4:5: ( '+' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:4:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:5:8: ( '/' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:5:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "LEFT_PARENTHESIS"
    public final void mLEFT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = LEFT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:6:18: ( '(' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:6:20: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_PARENTHESIS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:7:10: ( '*' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:7:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "RIGHT_PARENTHESIS"
    public final void mRIGHT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RIGHT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:8:19: ( ')' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:8:21: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_PARENTHESIS"

    // $ANTLR start "SUBTRACT"
    public final void mSUBTRACT() throws RecognitionException {
        try {
            int _type = SUBTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:9:10: ( '-' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:9:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBTRACT"

    // $ANTLR start "METRIC"
    public final void mMETRIC() throws RecognitionException {
        try {
            int _type = METRIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:41:9: ( Letter ( Letter | Digit | Separator )* )
            // net/opentsdb/expression/MetricArithmeticExpression.g:41:11: Letter ( Letter | Digit | Separator )*
            {
            mLetter(); 


            // net/opentsdb/expression/MetricArithmeticExpression.g:41:18: ( Letter | Digit | Separator )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ',' && LA1_0 <= '.')||(LA1_0 >= '0' && LA1_0 <= ':')||LA1_0=='='||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= '{')||LA1_0=='}') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // net/opentsdb/expression/MetricArithmeticExpression.g:
            	    {
            	    if ( (input.LA(1) >= ',' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||input.LA(1)=='='||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= '{')||input.LA(1)=='}' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METRIC"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // net/opentsdb/expression/MetricArithmeticExpression.g:43:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // net/opentsdb/expression/MetricArithmeticExpression.g:43:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // net/opentsdb/expression/MetricArithmeticExpression.g:43:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // net/opentsdb/expression/MetricArithmeticExpression.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:45:16: ( 'A' .. 'Z' | 'a' .. 'z' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:46:15: ( '0' .. '9' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Separator"
    public final void mSeparator() throws RecognitionException {
        try {
            // net/opentsdb/expression/MetricArithmeticExpression.g:47:19: ( '.' | '-' | ':' | '{' | '}' | '=' | ',' )
            // net/opentsdb/expression/MetricArithmeticExpression.g:
            {
            if ( (input.LA(1) >= ',' && input.LA(1) <= '.')||input.LA(1)==':'||input.LA(1)=='='||input.LA(1)=='{'||input.LA(1)=='}' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Separator"

    public void mTokens() throws RecognitionException {
        // net/opentsdb/expression/MetricArithmeticExpression.g:1:8: ( ADD | DIVIDE | LEFT_PARENTHESIS | MULTIPLY | RIGHT_PARENTHESIS | SUBTRACT | METRIC | WHITESPACE )
        int alt3=8;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt3=1;
            }
            break;
        case '/':
            {
            alt3=2;
            }
            break;
        case '(':
            {
            alt3=3;
            }
            break;
        case '*':
            {
            alt3=4;
            }
            break;
        case ')':
            {
            alt3=5;
            }
            break;
        case '-':
            {
            alt3=6;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=7;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt3=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:10: ADD
                {
                mADD(); 


                }
                break;
            case 2 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:14: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 3 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:21: LEFT_PARENTHESIS
                {
                mLEFT_PARENTHESIS(); 


                }
                break;
            case 4 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:38: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;
            case 5 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:47: RIGHT_PARENTHESIS
                {
                mRIGHT_PARENTHESIS(); 


                }
                break;
            case 6 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:65: SUBTRACT
                {
                mSUBTRACT(); 


                }
                break;
            case 7 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:74: METRIC
                {
                mMETRIC(); 


                }
                break;
            case 8 :
                // net/opentsdb/expression/MetricArithmeticExpression.g:1:81: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}