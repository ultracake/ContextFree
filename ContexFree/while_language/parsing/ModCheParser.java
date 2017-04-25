// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g 2017-04-25 19:24:14

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ModCheParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "P", "WS", "'+'", "';'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int P=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ModCheParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ModCheParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ModCheParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g"; }



	// $ANTLR start "program"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:20:1: program returns [String str] : s= note EOF ;
	public final String program() throws RecognitionException {
		String str = null;


		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:21:5: (s= note EOF )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:21:7: s= note EOF
			{
			pushFollow(FOLLOW_note_in_program50);
			s=note();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program52); 
			 str = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "program"



	// $ANTLR start "note"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:24:1: note returns [Statement str] : s= base_note ( ';' s= base_note )* ;
	public final Statement note() throws RecognitionException {
		Statement str = null;


		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:25:5: (s= base_note ( ';' s= base_note )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:25:7: s= base_note ( ';' s= base_note )*
			{
			pushFollow(FOLLOW_base_note_in_note77);
			s=base_note();
			state._fsp--;

			 str = s; 
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:26:7: ( ';' s= base_note )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==7) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:26:9: ';' s= base_note
					{
					match(input,7,FOLLOW_7_in_note95); 
					pushFollow(FOLLOW_base_note_in_note99);
					s=base_note();
					state._fsp--;

					 str = new SeqStatement(str,s); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "note"



	// $ANTLR start "base_note"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:29:1: base_note returns [Statement str] : e= arith_expr ;
	public final Statement base_note() throws RecognitionException {
		Statement str = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:30:5: (e= arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:30:7: e= arith_expr
			{
			pushFollow(FOLLOW_arith_expr_in_base_note127);
			e=arith_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "base_note"



	// $ANTLR start "arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:34:1: arith_expr returns [ArithExpr str] : e= add_arith_expr '+' e= add_arith_expr ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr str = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:35:5: (e= add_arith_expr '+' e= add_arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:35:7: e= add_arith_expr '+' e= add_arith_expr
			{
			pushFollow(FOLLOW_add_arith_expr_in_arith_expr153);
			e=add_arith_expr();
			state._fsp--;

			 str = e; 
			match(input,6,FOLLOW_6_in_arith_expr169); 
			pushFollow(FOLLOW_add_arith_expr_in_arith_expr173);
			e=add_arith_expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "add_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:39:1: add_arith_expr returns [ArithExpr str] : e= base_arith_expr ;
	public final ArithExpr add_arith_expr() throws RecognitionException {
		ArithExpr str = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:40:5: (e= base_arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:40:7: e= base_arith_expr
			{
			pushFollow(FOLLOW_base_arith_expr_in_add_arith_expr197);
			e=base_arith_expr();
			state._fsp--;

			 str = e; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "add_arith_expr"



	// $ANTLR start "base_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:43:1: base_arith_expr returns [ArithExpr str] : P ;
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr str = null;


		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:44:5: ( P )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:44:7: P
			{
			match(input,P,FOLLOW_P_in_base_arith_expr226); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules



	public static final BitSet FOLLOW_note_in_program50 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_note_in_note77 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_note95 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_base_note_in_note99 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_arith_expr_in_base_note127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_arith_expr_in_arith_expr153 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_arith_expr169 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_add_arith_expr_in_arith_expr173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_arith_expr_in_add_arith_expr197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_P_in_base_arith_expr226 = new BitSet(new long[]{0x0000000000000002L});
}
