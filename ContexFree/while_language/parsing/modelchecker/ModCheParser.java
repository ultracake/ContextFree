// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g 2017-04-26 21:19:32

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ModCheParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "P", "StateID", "WS", "'+'", "':='"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int P=4;
	public static final int StateID=5;
	public static final int WS=6;

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
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:19:1: program returns [Note note] : s= note EOF ;
	public final FindNote program() throws RecognitionException {
		FindNote note = null;


		FindNote s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:20:5: (s= note EOF )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:20:7: s= note EOF
			{
			pushFollow(FOLLOW_note_in_program49);
			s=note();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program51); 
			 note = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return note;
	}
	// $ANTLR end "program"



	// $ANTLR start "note"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:23:1: note returns [Note note] : s= base_note ;
	public final FindNote note() throws RecognitionException {
		FindNote note = null;


		FindNote s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:24:5: (s= base_note )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:24:7: s= base_note
			{
			pushFollow(FOLLOW_base_note_in_note76);
			s=base_note();
			state._fsp--;

			 note = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return note;
	}
	// $ANTLR end "note"



	// $ANTLR start "base_note"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:27:1: base_note returns [Note note] : StateID ':=' e= arith_expr ;
	public final FindNote base_note() throws RecognitionException {
		FindNote note = null;


		Token StateID1=null;
		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:28:5: ( StateID ':=' e= arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:28:7: StateID ':=' e= arith_expr
			{
			StateID1=(Token)match(input,StateID,FOLLOW_StateID_in_base_note105); 
			match(input,8,FOLLOW_8_in_base_note107); 
			pushFollow(FOLLOW_arith_expr_in_base_note111);
			e=arith_expr();
			state._fsp--;

			 note = new FindNote(StateID1.getText(), e); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return note;
	}
	// $ANTLR end "base_note"



	// $ANTLR start "arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:31:1: arith_expr returns [ArithExpr note] : e= base_arith_expr '+' e= base_arith_expr ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr note = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:32:5: (e= base_arith_expr '+' e= base_arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:32:7: e= base_arith_expr '+' e= base_arith_expr
			{
			pushFollow(FOLLOW_base_arith_expr_in_arith_expr144);
			e=base_arith_expr();
			state._fsp--;

			 note = e; 
			match(input,7,FOLLOW_7_in_arith_expr160); 
			pushFollow(FOLLOW_base_arith_expr_in_arith_expr164);
			e=base_arith_expr();
			state._fsp--;

			 note = new addExpr(note,e); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return note;
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "base_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:36:1: base_arith_expr returns [ArithExpr note] : P StateID ;
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr note = null;


		Token P2=null;
		Token StateID3=null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:37:5: ( P StateID )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:37:7: P StateID
			{
			P2=(Token)match(input,P,FOLLOW_P_in_base_arith_expr190); 
			 note = new PExpr(P2.getText()); 
			StateID3=(Token)match(input,StateID,FOLLOW_StateID_in_base_arith_expr200); 
			 note = new IdExpr(StateID3.getText()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return note;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules



	public static final BitSet FOLLOW_note_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_note_in_note76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StateID_in_base_note105 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_base_note107 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_base_note111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_arith_expr_in_arith_expr144 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_arith_expr160 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_base_arith_expr_in_arith_expr164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_P_in_base_arith_expr190 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_StateID_in_base_arith_expr200 = new BitSet(new long[]{0x0000000000000002L});
}
