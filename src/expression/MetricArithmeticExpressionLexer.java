// $ANTLR 3.4 MetricArithmeticExpression.g 2013-05-02 06:56:27
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
    public String getGrammarFileName() { return "MetricArithmeticExpression.g"; }

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:4:5: ( '+' )
            // MetricArithmeticExpression.g:4:7: '+'
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
            // MetricArithmeticExpression.g:5:8: ( '/' )
            // MetricArithmeticExpression.g:5:10: '/'
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
            // MetricArithmeticExpression.g:6:18: ( '(' )
            // MetricArithmeticExpression.g:6:20: '('
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
            // MetricArithmeticExpression.g:7:10: ( '*' )
            // MetricArithmeticExpression.g:7:12: '*'
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
            // MetricArithmeticExpression.g:8:19: ( ')' )
            // MetricArithmeticExpression.g:8:21: ')'
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
            // MetricArithmeticExpression.g:9:10: ( '-' )
            // MetricArithmeticExpression.g:9:12: '-'
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

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:39:12: ( Letter ( Letter | Digit | Separator )* )
            // MetricArithmeticExpression.g:39:14: Letter ( Letter | Digit | Separator )*
            {
            mLetter(); 


            // MetricArithmeticExpression.g:39:21: ( Letter | Digit | Separator )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*'||(LA1_0 >= '-' && LA1_0 <= '.')||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MetricArithmeticExpression.g:
            	    {
            	    if ( input.LA(1)=='*'||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "LITERAL"
    public final void mLITERAL() throws RecognitionException {
        try {
            int _type = LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:41:9: ( ( Digit )+ ( '.' ( Digit )+ )? )
            // MetricArithmeticExpression.g:41:11: ( Digit )+ ( '.' ( Digit )+ )?
            {
            // MetricArithmeticExpression.g:41:11: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MetricArithmeticExpression.g:
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
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // MetricArithmeticExpression.g:41:18: ( '.' ( Digit )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // MetricArithmeticExpression.g:41:19: '.' ( Digit )+
                    {
                    match('.'); 

                    // MetricArithmeticExpression.g:41:23: ( Digit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MetricArithmeticExpression.g:
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
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LITERAL"

    // $ANTLR start "METRIC"
    public final void mMETRIC() throws RecognitionException {
        try {
            int _type = METRIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:43:8: ( IDENTIFIER ( ':' IDENTIFIER )* ( '{' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) ( ',' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) )* '}' )? )
            // MetricArithmeticExpression.g:43:10: IDENTIFIER ( ':' IDENTIFIER )* ( '{' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) ( ',' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) )* '}' )?
            {
            mIDENTIFIER(); 


            // MetricArithmeticExpression.g:43:21: ( ':' IDENTIFIER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==':') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MetricArithmeticExpression.g:43:22: ':' IDENTIFIER
            	    {
            	    match(':'); 

            	    mIDENTIFIER(); 


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // MetricArithmeticExpression.g:43:39: ( '{' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) ( ',' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='{') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // MetricArithmeticExpression.g:43:40: '{' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) ( ',' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) )* '}'
                    {
                    match('{'); 

                    mIDENTIFIER(); 


                    match('='); 

                    // MetricArithmeticExpression.g:43:59: ( IDENTIFIER | '\\*' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0=='*') ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }
                    switch (alt6) {
                        case 1 :
                            // MetricArithmeticExpression.g:43:60: IDENTIFIER
                            {
                            mIDENTIFIER(); 


                            }
                            break;
                        case 2 :
                            // MetricArithmeticExpression.g:43:73: '\\*'
                            {
                            match('*'); 

                            }
                            break;

                    }


                    // MetricArithmeticExpression.g:43:79: ( ',' IDENTIFIER '=' ( IDENTIFIER | '\\*' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==',') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // MetricArithmeticExpression.g:43:80: ',' IDENTIFIER '=' ( IDENTIFIER | '\\*' )
                    	    {
                    	    match(','); 

                    	    mIDENTIFIER(); 


                    	    match('='); 

                    	    // MetricArithmeticExpression.g:43:99: ( IDENTIFIER | '\\*' )
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0=='*') ) {
                    	        alt7=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 7, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // MetricArithmeticExpression.g:43:100: IDENTIFIER
                    	            {
                    	            mIDENTIFIER(); 


                    	            }
                    	            break;
                    	        case 2 :
                    	            // MetricArithmeticExpression.g:43:113: '\\*'
                    	            {
                    	            match('*'); 

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match('}'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "METRIC"

    // $ANTLR start "FUNCTION_NAME"
    public final void mFUNCTION_NAME() throws RecognitionException {
        try {
            int _type = FUNCTION_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:45:15: ( '_' IDENTIFIER )
            // MetricArithmeticExpression.g:45:17: '_' IDENTIFIER
            {
            match('_'); 

            mIDENTIFIER(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION_NAME"

    // $ANTLR start "PARAM_SEPARATOR"
    public final void mPARAM_SEPARATOR() throws RecognitionException {
        try {
            int _type = PARAM_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:47:17: ( ',' )
            // MetricArithmeticExpression.g:47:19: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAM_SEPARATOR"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MetricArithmeticExpression.g:49:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // MetricArithmeticExpression.g:49:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // MetricArithmeticExpression.g:49:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||(LA10_0 >= '\f' && LA10_0 <= '\r')||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // MetricArithmeticExpression.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // MetricArithmeticExpression.g:51:16: ( 'A' .. 'Z' | 'a' .. 'z' )
            // MetricArithmeticExpression.g:
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
            // MetricArithmeticExpression.g:52:15: ( '0' .. '9' )
            // MetricArithmeticExpression.g:
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
            // MetricArithmeticExpression.g:53:19: ( '.' | '-' | '\\*' )
            // MetricArithmeticExpression.g:
            {
            if ( input.LA(1)=='*'||(input.LA(1) >= '-' && input.LA(1) <= '.') ) {
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
        // MetricArithmeticExpression.g:1:8: ( ADD | DIVIDE | LEFT_PARENTHESIS | MULTIPLY | RIGHT_PARENTHESIS | SUBTRACT | IDENTIFIER | LITERAL | METRIC | FUNCTION_NAME | PARAM_SEPARATOR | WHITESPACE )
        int alt11=12;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // MetricArithmeticExpression.g:1:10: ADD
                {
                mADD(); 


                }
                break;
            case 2 :
                // MetricArithmeticExpression.g:1:14: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 3 :
                // MetricArithmeticExpression.g:1:21: LEFT_PARENTHESIS
                {
                mLEFT_PARENTHESIS(); 


                }
                break;
            case 4 :
                // MetricArithmeticExpression.g:1:38: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;
            case 5 :
                // MetricArithmeticExpression.g:1:47: RIGHT_PARENTHESIS
                {
                mRIGHT_PARENTHESIS(); 


                }
                break;
            case 6 :
                // MetricArithmeticExpression.g:1:65: SUBTRACT
                {
                mSUBTRACT(); 


                }
                break;
            case 7 :
                // MetricArithmeticExpression.g:1:74: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 8 :
                // MetricArithmeticExpression.g:1:85: LITERAL
                {
                mLITERAL(); 


                }
                break;
            case 9 :
                // MetricArithmeticExpression.g:1:93: METRIC
                {
                mMETRIC(); 


                }
                break;
            case 10 :
                // MetricArithmeticExpression.g:1:100: FUNCTION_NAME
                {
                mFUNCTION_NAME(); 


                }
                break;
            case 11 :
                // MetricArithmeticExpression.g:1:114: PARAM_SEPARATOR
                {
                mPARAM_SEPARATOR(); 


                }
                break;
            case 12 :
                // MetricArithmeticExpression.g:1:130: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\7\uffff\1\14\5\uffff\1\14\1\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\11\6\uffff\1\52\5\uffff\1\52\1\uffff";
    static final String DFA11_maxS =
        "\1\172\6\uffff\1\173\5\uffff\1\173\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\12\1\13\1\14\1\7"+
        "\1\uffff\1\11";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\13\1\uffff\2\13\22\uffff\1\13\7\uffff\1\3\1\5\1\4\1\1\1\12"+
            "\1\6\1\uffff\1\2\12\10\7\uffff\32\7\4\uffff\1\11\1\uffff\32"+
            "\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\2\uffff\2\15\1\uffff\12\15\1\16\6\uffff\32\15\6\uffff"+
            "\32\15\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\15\2\uffff\2\15\1\uffff\12\15\1\16\6\uffff\32\15\6\uffff"+
            "\32\15\1\16",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ADD | DIVIDE | LEFT_PARENTHESIS | MULTIPLY | RIGHT_PARENTHESIS | SUBTRACT | IDENTIFIER | LITERAL | METRIC | FUNCTION_NAME | PARAM_SEPARATOR | WHITESPACE );";
        }
    }
 

}