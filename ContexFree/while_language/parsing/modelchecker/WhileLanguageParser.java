// $ANTLR 3.5.1 C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g 2017-04-21 10:50:14

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'!'", "'&&'", 
		"'*'", "'+'", "'-'", "':='", "';'", "'='", "'else'", "'false'", "'if'", 
		"'then'", "'true'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public WhileLanguageParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileLanguageParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return WhileLanguageParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g"; }



	// $ANTLR start "program"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:19:1: program returns [Statement value] : s= statement EOF ;
	public final Statement program() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:20:5: (s= statement EOF )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:20:7: s= statement EOF
			{
			pushFollow(FOLLOW_statement_in_program49);
			s=statement();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_program51); 
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
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:23:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
	public final Statement statement() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:24:5: (s= base_statement ( ';' s= base_statement )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:24:7: s= base_statement ( ';' s= base_statement )*
			{
			pushFollow(FOLLOW_base_statement_in_statement76);
			s=base_statement();
			state._fsp--;

			 value = s; 
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:25:7: ( ';' s= base_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==13) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:25:9: ';' s= base_statement
					{
					match(input,13,FOLLOW_13_in_statement94); 
					pushFollow(FOLLOW_base_statement_in_statement98);
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
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:28:1: base_statement returns [Statement value] : ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | '{' s= statement '}' );
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token ID1=null;
		ArithExpr e =null;
		BoolExpr c =null;
		Statement s1 =null;
		Statement s2 =null;
		Statement s =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:29:5: ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | '{' s= statement '}' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 17:
				{
				alt2=2;
				}
				break;
			case 20:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:29:7: ID ':=' e= arith_expr
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_base_statement124); 
					match(input,12,FOLLOW_12_in_base_statement126); 
					pushFollow(FOLLOW_arith_expr_in_base_statement130);
					e=arith_expr();
					state._fsp--;

					 value = new AssignStatement(ID1.getText(), e); 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:30:7: 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement
					{
					match(input,17,FOLLOW_17_in_base_statement161); 
					pushFollow(FOLLOW_bool_expr_in_base_statement165);
					c=bool_expr();
					state._fsp--;

					match(input,18,FOLLOW_18_in_base_statement167); 
					pushFollow(FOLLOW_base_statement_in_base_statement171);
					s1=base_statement();
					state._fsp--;

					match(input,15,FOLLOW_15_in_base_statement179); 
					pushFollow(FOLLOW_base_statement_in_base_statement183);
					s2=base_statement();
					state._fsp--;

					 value = new IfStatement(c,s1,s2); 
					}
					break;
				case 3 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:32:7: '{' s= statement '}'
					{
					match(input,20,FOLLOW_20_in_base_statement210); 
					pushFollow(FOLLOW_statement_in_base_statement214);
					s=statement();
					state._fsp--;

					match(input,21,FOLLOW_21_in_base_statement216); 
					 value = s; 
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
		return value;
	}
	// $ANTLR end "base_statement"



	// $ANTLR start "bool_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:35:1: bool_expr returns [BoolExpr value] : e= literal ( '&&' e= literal )* ;
	public final BoolExpr bool_expr() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:36:5: (e= literal ( '&&' e= literal )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:36:7: e= literal ( '&&' e= literal )*
			{
			pushFollow(FOLLOW_literal_in_bool_expr263);
			e=literal();
			state._fsp--;

			 value = e; 
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:37:7: ( '&&' e= literal )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==8) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:37:9: '&&' e= literal
					{
					match(input,8,FOLLOW_8_in_bool_expr281); 
					pushFollow(FOLLOW_literal_in_bool_expr285);
					e=literal();
					state._fsp--;

					 value = new AndExpr(value,e); 
					}
					break;

				default :
					break loop3;
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
	// $ANTLR end "bool_expr"



	// $ANTLR start "literal"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:40:1: literal returns [BoolExpr value] : (e= base_bool_expr | '!' e= literal );
	public final BoolExpr literal() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:41:5: (e= base_bool_expr | '!' e= literal )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ID && LA4_0 <= NUM)||LA4_0==16||LA4_0==19) ) {
				alt4=1;
			}
			else if ( (LA4_0==7) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:41:7: e= base_bool_expr
					{
					pushFollow(FOLLOW_base_bool_expr_in_literal313);
					e=base_bool_expr();
					state._fsp--;

					 value = e; 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:42:7: '!' e= literal
					{
					match(input,7,FOLLOW_7_in_literal326); 
					pushFollow(FOLLOW_literal_in_literal330);
					e=literal();
					state._fsp--;

					 value = new NotExpr(e); 
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
		return value;
	}
	// $ANTLR end "literal"



	// $ANTLR start "base_bool_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:45:1: base_bool_expr returns [BoolExpr value] : ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr );
	public final BoolExpr base_bool_expr() throws RecognitionException {
		BoolExpr value = null;


		ArithExpr e1 =null;
		ArithExpr e2 =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:46:5: ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr )
			int alt5=3;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt5=1;
				}
				break;
			case 16:
				{
				alt5=2;
				}
				break;
			case ID:
			case NUM:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:46:7: 'true'
					{
					match(input,19,FOLLOW_19_in_base_bool_expr353); 
					 value = new BoolValueExpr(true); 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:47:7: 'false'
					{
					match(input,16,FOLLOW_16_in_base_bool_expr391); 
					 value = new BoolValueExpr(false); 
					}
					break;
				case 3 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:48:7: e1= arith_expr '=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr430);
					e1=arith_expr();
					state._fsp--;

					match(input,14,FOLLOW_14_in_base_bool_expr432); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr436);
					e2=arith_expr();
					state._fsp--;

					 value = new EqualsExpr(e1,e2); 
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
		return value;
	}
	// $ANTLR end "base_bool_expr"



	// $ANTLR start "arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:51:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:52:5: (e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:52:7: e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr462);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:53:7: ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==10) ) {
					alt6=1;
				}
				else if ( (LA6_0==11) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:53:9: '+' e= mult_arith_expr
					{
					match(input,10,FOLLOW_10_in_arith_expr480); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr484);
					e=mult_arith_expr();
					state._fsp--;

					 value = new PlusExpr(value,e); 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:54:9: '-' e= mult_arith_expr
					{
					match(input,11,FOLLOW_11_in_arith_expr497); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr501);
					e=mult_arith_expr();
					state._fsp--;

					 value = new MinusExpr(value,e); 
					}
					break;

				default :
					break loop6;
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
	// $ANTLR end "arith_expr"



	// $ANTLR start "mult_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:57:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ( '*' e= base_arith_expr )* ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:58:5: (e= base_arith_expr ( '*' e= base_arith_expr )* )
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:58:7: e= base_arith_expr ( '*' e= base_arith_expr )*
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr529);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:59:7: ( '*' e= base_arith_expr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==9) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:59:9: '*' e= base_arith_expr
					{
					match(input,9,FOLLOW_9_in_mult_arith_expr547); 
					pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr551);
					e=base_arith_expr();
					state._fsp--;

					 value = new MultExpr(value,e); 
					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "mult_arith_expr"



	// $ANTLR start "base_arith_expr"
	// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:62:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token NUM2=null;
		Token ID3=null;

		try {
			// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:63:5: ( NUM | ID )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==NUM) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:63:7: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr577); 
					 value = new NumExpr(Integer.parseInt(NUM2.getText())); 
					}
					break;
				case 2 :
					// C:\\Users\\jacki\\workspace\\test2\\while_language\\parsing\\WhileLanguage.g:64:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr587); 
					 value = new IdExpr(ID3.getText()); 
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
		return value;
	}
	// $ANTLR end "base_arith_expr"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_statement94 = new BitSet(new long[]{0x0000000000120010L});
	public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_base_statement124 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_base_statement126 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_base_statement161 = new BitSet(new long[]{0x00000000000900B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement165 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_base_statement167 = new BitSet(new long[]{0x0000000000120010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement171 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_base_statement179 = new BitSet(new long[]{0x0000000000120010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_base_statement210 = new BitSet(new long[]{0x0000000000120010L});
	public static final BitSet FOLLOW_statement_in_base_statement214 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_base_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_bool_expr263 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_bool_expr281 = new BitSet(new long[]{0x00000000000900B0L});
	public static final BitSet FOLLOW_literal_in_bool_expr285 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_base_bool_expr_in_literal313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_literal326 = new BitSet(new long[]{0x00000000000900B0L});
	public static final BitSet FOLLOW_literal_in_literal330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_base_bool_expr353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_base_bool_expr391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr430 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_base_bool_expr432 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr462 = new BitSet(new long[]{0x0000000000000C02L});
	public static final BitSet FOLLOW_10_in_arith_expr480 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr484 = new BitSet(new long[]{0x0000000000000C02L});
	public static final BitSet FOLLOW_11_in_arith_expr497 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr501 = new BitSet(new long[]{0x0000000000000C02L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr529 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_mult_arith_expr547 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr551 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_NUM_in_base_arith_expr577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base_arith_expr587 = new BitSet(new long[]{0x0000000000000002L});
}
