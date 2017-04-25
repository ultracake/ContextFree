// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g 2017-04-25 17:33:04

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
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:20:1: program returns [Statement value] : s= statement EOF ;
	public final Statement program() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:21:5: (s= statement EOF )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:21:7: s= statement EOF
			{
			pushFollow(FOLLOW_statement_in_program50);
			s=statement();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program52); 
			 value = s; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:24:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
	public final Statement statement() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:25:5: (s= base_statement ( ';' s= base_statement )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:25:7: s= base_statement ( ';' s= base_statement )*
			{
			pushFollow(FOLLOW_base_statement_in_statement77);
			s=base_statement();
			state._fsp--;

			 value = s; 
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:26:7: ( ';' s= base_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==7) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:26:9: ';' s= base_statement
					{
					match(input,7,FOLLOW_7_in_statement95); 
					pushFollow(FOLLOW_base_statement_in_statement99);
					s=base_statement();
					state._fsp--;

					 value = new SeqStatement(value,s); 
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
		return value;
	}
	// $ANTLR end "statement"



	// $ANTLR start "base_statement"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:29:1: base_statement returns [Statement value] : e= arith_expr ;
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:30:5: (e= arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:30:7: e= arith_expr
			{
			pushFollow(FOLLOW_arith_expr_in_base_statement127);
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
		return value;
	}
	// $ANTLR end "base_statement"



	// $ANTLR start "arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:34:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr '+' e= mult_arith_expr ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:35:5: (e= mult_arith_expr '+' e= mult_arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:35:7: e= mult_arith_expr '+' e= mult_arith_expr
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr153);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			match(input,6,FOLLOW_6_in_arith_expr170); 
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr174);
			e=mult_arith_expr();
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
		return value;
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "mult_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:39:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:40:5: (e= base_arith_expr )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:40:7: e= base_arith_expr
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr198);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mult_arith_expr"



	// $ANTLR start "base_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:43:1: base_arith_expr returns [ArithExpr value] : P ;
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:44:5: ( P )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\ModChe.g:44:7: P
			{
			match(input,P,FOLLOW_P_in_base_arith_expr227); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program50 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_statement_in_statement77 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_statement95 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_base_statement_in_statement99 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr153 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_arith_expr170 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_P_in_base_arith_expr227 = new BitSet(new long[]{0x0000000000000002L});
}
