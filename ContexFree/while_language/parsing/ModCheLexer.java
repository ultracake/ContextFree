// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g 2017-04-25 19:24:14

package while_language.parsing;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ModCheLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int P=4;
	public static final int WS=5;

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

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
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
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:13:6: ( ';' )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:13:8: ';'
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
	// $ANTLR end "T__7"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			int _type = P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:48:3: ( 'p' | 'qr' | ' ' )
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
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:48:5: 'p'
					{
					match('p'); 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:48:11: 'qr'
					{
					match("qr"); 

					}
					break;
				case 3 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:48:18: ' '
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:53:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:53:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:8: ( T__6 | T__7 | P | WS )
		int alt2=4;
		switch ( input.LA(1) ) {
		case '+':
			{
			alt2=1;
			}
			break;
		case ';':
			{
			alt2=2;
			}
			break;
		case 'p':
		case 'q':
			{
			alt2=3;
			}
			break;
		case ' ':
			{
			alt2=3;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
			{
			alt2=4;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:20: P
				{
				mP(); 

				}
				break;
			case 4 :
				// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:1:22: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
