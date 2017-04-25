// $ANTLR 3.5.1 C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g 2017-04-25 16:46:44

package while_language.parsing;

import while_language.ast.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'!'", "'!='", 
		"'&&'", "'*'", "'+'", "'-'", "':='", "';'", "'<='", "'='", "'do'", "'else'", 
		"'false'", "'if'", "'then'", "'true'", "'while'", "'{'", "'||'", "'}'"
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
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:19:1: program returns [Statement value] : s= statement EOF ;
	public final Statement program() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:20:5: (s= statement EOF )
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:20:7: s= statement EOF
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
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:23:1: statement returns [Statement value] : s= base_statement ( ';' s= base_statement )* ;
	public final Statement statement() throws RecognitionException {
		Statement value = null;


		Statement s =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:24:5: (s= base_statement ( ';' s= base_statement )* )
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:24:7: s= base_statement ( ';' s= base_statement )*
			{
			pushFollow(FOLLOW_base_statement_in_statement76);
			s=base_statement();
			state._fsp--;

			 value = s; 
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:25:7: ( ';' s= base_statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:25:9: ';' s= base_statement
					{
					match(input,14,FOLLOW_14_in_statement94); 
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
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:28:1: base_statement returns [Statement value] : ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | '{' s= statement '}' | 'while' c= bool_expr 'do' s1= base_statement );
	public final Statement base_statement() throws RecognitionException {
		Statement value = null;


		Token ID1=null;
		ArithExpr e =null;
		BoolExpr c =null;
		Statement s1 =null;
		Statement s2 =null;
		Statement s =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:29:5: ( ID ':=' e= arith_expr | 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement | '{' s= statement '}' | 'while' c= bool_expr 'do' s1= base_statement )
			int alt2=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 20:
				{
				alt2=2;
				}
				break;
			case 24:
				{
				alt2=3;
				}
				break;
			case 23:
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
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:29:7: ID ':=' e= arith_expr
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_base_statement124); 
					match(input,13,FOLLOW_13_in_base_statement126); 
					pushFollow(FOLLOW_arith_expr_in_base_statement130);
					e=arith_expr();
					state._fsp--;

					 value = new AssignStatement(ID1.getText(), e); 
					}
					break;
				case 2 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:30:7: 'if' c= bool_expr 'then' s1= base_statement 'else' s2= base_statement
					{
					match(input,20,FOLLOW_20_in_base_statement161); 
					pushFollow(FOLLOW_bool_expr_in_base_statement165);
					c=bool_expr();
					state._fsp--;

					match(input,21,FOLLOW_21_in_base_statement167); 
					pushFollow(FOLLOW_base_statement_in_base_statement171);
					s1=base_statement();
					state._fsp--;

					match(input,18,FOLLOW_18_in_base_statement179); 
					pushFollow(FOLLOW_base_statement_in_base_statement183);
					s2=base_statement();
					state._fsp--;

					 value = new IfStatement(c,s1,s2); 
					}
					break;
				case 3 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:32:7: '{' s= statement '}'
					{
					match(input,24,FOLLOW_24_in_base_statement210); 
					pushFollow(FOLLOW_statement_in_base_statement214);
					s=statement();
					state._fsp--;

					match(input,26,FOLLOW_26_in_base_statement216); 
					 value = s; 
					}
					break;
				case 4 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:34:7: 'while' c= bool_expr 'do' s1= base_statement
					{
					match(input,23,FOLLOW_23_in_base_statement253); 
					pushFollow(FOLLOW_bool_expr_in_base_statement257);
					c=bool_expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_base_statement259); 
					pushFollow(FOLLOW_base_statement_in_base_statement263);
					s1=base_statement();
					state._fsp--;

					 value = new WhileLoop(c,s1); 
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



	// $ANTLR start "bool_expr_log"
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:37:1: bool_expr_log returns [BoolExpr value] : e= bool_expr ( '||' e= bool_expr )* ;
	public final BoolExpr bool_expr_log() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:38:5: (e= bool_expr ( '||' e= bool_expr )* )
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:38:7: e= bool_expr ( '||' e= bool_expr )*
			{
			pushFollow(FOLLOW_bool_expr_in_bool_expr_log288);
			e=bool_expr();
			state._fsp--;

			 value = e; 
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:39:7: ( '||' e= bool_expr )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==25) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:39:9: '||' e= bool_expr
					{
					match(input,25,FOLLOW_25_in_bool_expr_log306); 
					pushFollow(FOLLOW_bool_expr_in_bool_expr_log310);
					e=bool_expr();
					state._fsp--;

					 value = new LogExpr(value,e); 
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
	// $ANTLR end "bool_expr_log"



	// $ANTLR start "bool_expr"
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:41:1: bool_expr returns [BoolExpr value] : e= literal ( '&&' e= literal )* ;
	public final BoolExpr bool_expr() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:42:5: (e= literal ( '&&' e= literal )* )
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:42:7: e= literal ( '&&' e= literal )*
			{
			pushFollow(FOLLOW_literal_in_bool_expr338);
			e=literal();
			state._fsp--;

			 value = e; 
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:43:7: ( '&&' e= literal )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==9) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:43:9: '&&' e= literal
					{
					match(input,9,FOLLOW_9_in_bool_expr356); 
					pushFollow(FOLLOW_literal_in_bool_expr360);
					e=literal();
					state._fsp--;

					 value = new AndExpr(value,e); 
					}
					break;

				default :
					break loop4;
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
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:46:1: literal returns [BoolExpr value] : (e= base_bool_expr | '!' e= literal );
	public final BoolExpr literal() throws RecognitionException {
		BoolExpr value = null;


		BoolExpr e =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:47:5: (e= base_bool_expr | '!' e= literal )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ID && LA5_0 <= NUM)||LA5_0==19||LA5_0==22) ) {
				alt5=1;
			}
			else if ( (LA5_0==7) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:47:7: e= base_bool_expr
					{
					pushFollow(FOLLOW_base_bool_expr_in_literal388);
					e=base_bool_expr();
					state._fsp--;

					 value = e; 
					}
					break;
				case 2 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:48:7: '!' e= literal
					{
					match(input,7,FOLLOW_7_in_literal401); 
					pushFollow(FOLLOW_literal_in_literal405);
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
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:51:1: base_bool_expr returns [BoolExpr value] : ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr );
	public final BoolExpr base_bool_expr() throws RecognitionException {
		BoolExpr value = null;


		ArithExpr e1 =null;
		ArithExpr e2 =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:52:5: ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr )
			int alt6=5;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:52:7: 'true'
					{
					match(input,22,FOLLOW_22_in_base_bool_expr428); 
					 value = new BoolValueExpr(true); 
					}
					break;
				case 2 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:53:7: 'false'
					{
					match(input,19,FOLLOW_19_in_base_bool_expr466); 
					 value = new BoolValueExpr(false); 
					}
					break;
				case 3 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:54:7: e1= arith_expr '=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr505);
					e1=arith_expr();
					state._fsp--;

					match(input,16,FOLLOW_16_in_base_bool_expr507); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr511);
					e2=arith_expr();
					state._fsp--;

					 value = new EqualsExpr(e1,e2); 
					}
					break;
				case 4 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:55:7: e1= arith_expr '<=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr524);
					e1=arith_expr();
					state._fsp--;

					match(input,15,FOLLOW_15_in_base_bool_expr526); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr530);
					e2=arith_expr();
					state._fsp--;

					 value = new LargerExpr(e1,e2); 
					}
					break;
				case 5 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:56:7: e1= arith_expr '!=' e2= arith_expr
					{
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr543);
					e1=arith_expr();
					state._fsp--;

					match(input,8,FOLLOW_8_in_base_bool_expr545); 
					pushFollow(FOLLOW_arith_expr_in_base_bool_expr549);
					e2=arith_expr();
					state._fsp--;

					 value = new NotEqualsExpr(e1,e2); 
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
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:59:1: arith_expr returns [ArithExpr value] : e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* ;
	public final ArithExpr arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:60:5: (e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )* )
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:60:7: e= mult_arith_expr ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			{
			pushFollow(FOLLOW_mult_arith_expr_in_arith_expr575);
			e=mult_arith_expr();
			state._fsp--;

			 value = e; 
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:61:7: ( '+' e= mult_arith_expr | '-' e= mult_arith_expr )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==11) ) {
					alt7=1;
				}
				else if ( (LA7_0==12) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:61:9: '+' e= mult_arith_expr
					{
					match(input,11,FOLLOW_11_in_arith_expr593); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr597);
					e=mult_arith_expr();
					state._fsp--;

					 value = new PlusExpr(value,e); 
					}
					break;
				case 2 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:62:9: '-' e= mult_arith_expr
					{
					match(input,12,FOLLOW_12_in_arith_expr610); 
					pushFollow(FOLLOW_mult_arith_expr_in_arith_expr614);
					e=mult_arith_expr();
					state._fsp--;

					 value = new MinusExpr(value,e); 
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
	// $ANTLR end "arith_expr"



	// $ANTLR start "mult_arith_expr"
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:65:1: mult_arith_expr returns [ArithExpr value] : e= base_arith_expr ( '*' e= base_arith_expr )* ;
	public final ArithExpr mult_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		ArithExpr e =null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:66:5: (e= base_arith_expr ( '*' e= base_arith_expr )* )
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:66:7: e= base_arith_expr ( '*' e= base_arith_expr )*
			{
			pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr642);
			e=base_arith_expr();
			state._fsp--;

			 value = e; 
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:67:7: ( '*' e= base_arith_expr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==10) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:67:9: '*' e= base_arith_expr
					{
					match(input,10,FOLLOW_10_in_mult_arith_expr660); 
					pushFollow(FOLLOW_base_arith_expr_in_mult_arith_expr664);
					e=base_arith_expr();
					state._fsp--;

					 value = new MultExpr(value,e); 
					}
					break;

				default :
					break loop8;
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
	// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:70:1: base_arith_expr returns [ArithExpr value] : ( NUM | ID );
	public final ArithExpr base_arith_expr() throws RecognitionException {
		ArithExpr value = null;


		Token NUM2=null;
		Token ID3=null;

		try {
			// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:71:5: ( NUM | ID )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==NUM) ) {
				alt9=1;
			}
			else if ( (LA9_0==ID) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:71:7: NUM
					{
					NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_base_arith_expr690); 
					 value = new NumExpr(Integer.parseInt(NUM2.getText())); 
					}
					break;
				case 2 :
					// C:\\Users\\Kristian Krarup\\Documents\\ContextFree\\ContexFree\\while_language\\parsing\\WhileLanguage.g:72:7: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_base_arith_expr700); 
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


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\27\uffff";
	static final String DFA6_eofS =
		"\27\uffff";
	static final String DFA6_minS =
		"\1\4\2\uffff\2\10\3\4\3\uffff\6\10\2\4\4\10";
	static final String DFA6_maxS =
		"\1\26\2\uffff\2\20\3\5\3\uffff\6\20\2\5\4\20";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\5\uffff\1\3\1\4\1\5\14\uffff";
	static final String DFA6_specialS =
		"\27\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\4\1\3\15\uffff\1\2\2\uffff\1\1",
			"",
			"",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\14\1\13",
			"\1\16\1\15",
			"\1\20\1\17",
			"",
			"",
			"",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\5\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10",
			"\1\24\1\23",
			"\1\26\1\25",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\21\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10",
			"\1\12\1\uffff\1\22\1\6\1\7\2\uffff\1\11\1\10"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "51:1: base_bool_expr returns [BoolExpr value] : ( 'true' | 'false' |e1= arith_expr '=' e2= arith_expr |e1= arith_expr '<=' e2= arith_expr |e1= arith_expr '!=' e2= arith_expr );";
		}
	}

	public static final BitSet FOLLOW_statement_in_program49 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_statement_in_statement76 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_statement94 = new BitSet(new long[]{0x0000000001900010L});
	public static final BitSet FOLLOW_base_statement_in_statement98 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_base_statement124 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_base_statement126 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_statement130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_base_statement161 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement165 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_base_statement167 = new BitSet(new long[]{0x0000000001900010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement171 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_base_statement179 = new BitSet(new long[]{0x0000000001900010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_base_statement210 = new BitSet(new long[]{0x0000000001900010L});
	public static final BitSet FOLLOW_statement_in_base_statement214 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_base_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_base_statement253 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_bool_expr_in_base_statement257 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_base_statement259 = new BitSet(new long[]{0x0000000001900010L});
	public static final BitSet FOLLOW_base_statement_in_base_statement263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_expr_in_bool_expr_log288 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_bool_expr_log306 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_bool_expr_in_bool_expr_log310 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_literal_in_bool_expr338 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_bool_expr356 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_literal_in_bool_expr360 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_base_bool_expr_in_literal388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_literal401 = new BitSet(new long[]{0x00000000004800B0L});
	public static final BitSet FOLLOW_literal_in_literal405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_base_bool_expr428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_base_bool_expr466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr505 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_base_bool_expr507 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr524 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_base_bool_expr526 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr543 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_base_bool_expr545 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_arith_expr_in_base_bool_expr549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr575 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_arith_expr593 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr597 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_arith_expr610 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_mult_arith_expr_in_arith_expr614 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr642 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_mult_arith_expr660 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_base_arith_expr_in_mult_arith_expr664 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_NUM_in_base_arith_expr690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_base_arith_expr700 = new BitSet(new long[]{0x0000000000000002L});
}
