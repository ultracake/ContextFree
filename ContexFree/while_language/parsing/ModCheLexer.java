// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g 2017-04-26 11:10:48

package while_language.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ModCheLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int P=4;
	public static final int StateID=5;
	public static final int WS=6;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ModCheLexer() {} 
	public ModCheLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ModCheLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:12:6: ( '+' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:12:8: '+'
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:13:6: ( ':=' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:13:8: ':='
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:14:6: ( ';' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:14:8: ';'
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
	// $ANTLR end "T__9"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			int _type = P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:42:3: ( 'p' | 'qr' | ' ' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'p':
				{
				alt1=1;
				}
				break;
			case 'q':
				{
				alt1=2;
				}
				break;
			case ' ':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:42:5: 'p'
					{
					match('p'); 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:42:11: 'qr'
					{
					match("qr"); 

					}
					break;
				case 3 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:42:18: ' '
					{
					match(' '); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "StateID"
	public final void mStateID() throws RecognitionException {
		try {
			int _type = StateID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:43:9: ( '1' .. '3' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '3') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StateID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:47:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:47:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
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
		// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:8: ( T__7 | T__8 | T__9 | P | StateID | WS )
		int alt2=6;
		switch ( input.LA(1) ) {
		case '+':
			{
			alt2=1;
			}
			break;
		case ':':
			{
			alt2=2;
			}
			break;
		case ';':
			{
			alt2=3;
			}
			break;
		case 'p':
		case 'q':
			{
			alt2=4;
			}
			break;
		case ' ':
			{
			alt2=4;
			}
			break;
		case '1':
		case '2':
		case '3':
			{
			alt2=5;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
			{
			alt2=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:25: P
				{
				mP(); 

				}
				break;
			case 5 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:27: StateID
				{
				mStateID(); 

				}
				break;
			case 6 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:35: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
