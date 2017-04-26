// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g 2017-04-21 10:50:14

package while_language.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileLanguageLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ID=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public WhileLanguageLexer() {} 
	public WhileLanguageLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileLanguageLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:12:6: ( '!' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:12:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:13:6: ( '&&' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:13:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:14:6: ( '*' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:14:8: '*'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:15:7: ( '+' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:15:9: '+'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:16:7: ( '-' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:16:9: '-'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:17:7: ( ':=' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:17:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:18:7: ( ';' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:19:7: ( '=' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:19:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:20:7: ( 'else' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:20:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:21:7: ( 'false' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:21:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:22:7: ( 'if' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:22:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:23:7: ( 'then' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:23:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:24:7: ( 'true' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:24:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:25:7: ( '{' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:25:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:26:7: ( '}' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:26:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:67:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:67:7: ( '0' .. '9' )+
			{
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:67:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:68:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:68:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:68:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:70:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:70:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:70:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | NUM | ID | WS )
		int alt4=18;
		switch ( input.LA(1) ) {
		case '!':
			{
			alt4=1;
			}
			break;
		case '&':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case ':':
			{
			alt4=6;
			}
			break;
		case ';':
			{
			alt4=7;
			}
			break;
		case '=':
			{
			alt4=8;
			}
			break;
		case 'e':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='l') ) {
				int LA4_18 = input.LA(3);
				if ( (LA4_18=='s') ) {
					int LA4_23 = input.LA(4);
					if ( (LA4_23=='e') ) {
						int LA4_28 = input.LA(5);
						if ( ((LA4_28 >= '0' && LA4_28 <= '9')||(LA4_28 >= 'A' && LA4_28 <= 'Z')||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
							alt4=17;
						}

						else {
							alt4=9;
						}

					}

					else {
						alt4=17;
					}

				}

				else {
					alt4=17;
				}

			}

			else {
				alt4=17;
			}

			}
			break;
		case 'f':
			{
			int LA4_10 = input.LA(2);
			if ( (LA4_10=='a') ) {
				int LA4_19 = input.LA(3);
				if ( (LA4_19=='l') ) {
					int LA4_24 = input.LA(4);
					if ( (LA4_24=='s') ) {
						int LA4_29 = input.LA(5);
						if ( (LA4_29=='e') ) {
							int LA4_33 = input.LA(6);
							if ( ((LA4_33 >= '0' && LA4_33 <= '9')||(LA4_33 >= 'A' && LA4_33 <= 'Z')||(LA4_33 >= 'a' && LA4_33 <= 'z')) ) {
								alt4=17;
							}

							else {
								alt4=10;
							}

						}

						else {
							alt4=17;
						}

					}

					else {
						alt4=17;
					}

				}

				else {
					alt4=17;
				}

			}

			else {
				alt4=17;
			}

			}
			break;
		case 'i':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='f') ) {
				int LA4_20 = input.LA(3);
				if ( ((LA4_20 >= '0' && LA4_20 <= '9')||(LA4_20 >= 'A' && LA4_20 <= 'Z')||(LA4_20 >= 'a' && LA4_20 <= 'z')) ) {
					alt4=17;
				}

				else {
					alt4=11;
				}

			}

			else {
				alt4=17;
			}

			}
			break;
		case 't':
			{
			switch ( input.LA(2) ) {
			case 'h':
				{
				int LA4_21 = input.LA(3);
				if ( (LA4_21=='e') ) {
					int LA4_26 = input.LA(4);
					if ( (LA4_26=='n') ) {
						int LA4_30 = input.LA(5);
						if ( ((LA4_30 >= '0' && LA4_30 <= '9')||(LA4_30 >= 'A' && LA4_30 <= 'Z')||(LA4_30 >= 'a' && LA4_30 <= 'z')) ) {
							alt4=17;
						}

						else {
							alt4=12;
						}

					}

					else {
						alt4=17;
					}

				}

				else {
					alt4=17;
				}

				}
				break;
			case 'r':
				{
				int LA4_22 = input.LA(3);
				if ( (LA4_22=='u') ) {
					int LA4_27 = input.LA(4);
					if ( (LA4_27=='e') ) {
						int LA4_31 = input.LA(5);
						if ( ((LA4_31 >= '0' && LA4_31 <= '9')||(LA4_31 >= 'A' && LA4_31 <= 'Z')||(LA4_31 >= 'a' && LA4_31 <= 'z')) ) {
							alt4=17;
						}

						else {
							alt4=13;
						}

					}

					else {
						alt4=17;
					}

				}

				else {
					alt4=17;
				}

				}
				break;
			default:
				alt4=17;
			}
			}
			break;
		case '{':
			{
			alt4=14;
			}
			break;
		case '}':
			{
			alt4=15;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=16;
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
		case 'g':
		case 'h':
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
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=17;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=18;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:85: T__20
				{
				mT__20(); 

				}
				break;
			case 15 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:91: T__21
				{
				mT__21(); 

				}
				break;
			case 16 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:97: NUM
				{
				mNUM(); 

				}
				break;
			case 17 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:101: ID
				{
				mID(); 

				}
				break;
			case 18 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:1:104: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
