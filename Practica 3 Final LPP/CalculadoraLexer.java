// $ANTLR 3.5.2 Calculadora.g 2015-02-18 21:44:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalculadoraLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int Id=4;
	public static final int Number=5;
	public static final int OpRel=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CalculadoraLexer() {} 
	public CalculadoraLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalculadoraLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Calculadora.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:2:6: ( '(' )
			// Calculadora.g:2:8: '('
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:3:6: ( ')' )
			// Calculadora.g:3:8: ')'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:4:7: ( '*' )
			// Calculadora.g:4:9: '*'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:5:7: ( '+' )
			// Calculadora.g:5:9: '+'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:6:7: ( '-' )
			// Calculadora.g:6:9: '-'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:7:7: ( '/' )
			// Calculadora.g:7:9: '/'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:8:7: ( ';' )
			// Calculadora.g:8:9: ';'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:9:7: ( '=' )
			// Calculadora.g:9:9: '='
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:10:7: ( 'do' )
			// Calculadora.g:10:9: 'do'
			{
			match("do"); 

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
			// Calculadora.g:11:7: ( 'if' )
			// Calculadora.g:11:9: 'if'
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
			// Calculadora.g:12:7: ( 'then' )
			// Calculadora.g:12:9: 'then'
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
			// Calculadora.g:13:7: ( 'while' )
			// Calculadora.g:13:9: 'while'
			{
			match("while"); 

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
			// Calculadora.g:14:7: ( '{' )
			// Calculadora.g:14:9: '{'
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
			// Calculadora.g:15:7: ( '}' )
			// Calculadora.g:15:9: '}'
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

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:221:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// Calculadora.g:221:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// Calculadora.g:221:10: ( '0' .. '9' )+
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
					// Calculadora.g:
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

			// Calculadora.g:221:22: ( '.' ( '0' .. '9' )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='.') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Calculadora.g:221:23: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// Calculadora.g:221:27: ( '0' .. '9' )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// Calculadora.g:
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
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

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
	// $ANTLR end "Number"

	// $ANTLR start "Id"
	public final void mId() throws RecognitionException {
		try {
			int _type = Id;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:226:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// Calculadora.g:226:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// Calculadora.g:226:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Calculadora.g:
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
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Id"

	// $ANTLR start "OpRel"
	public final void mOpRel() throws RecognitionException {
		try {
			int _type = OpRel;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:231:5: ( ( '>' | '<' | '>=' | '<=' | '==' | '!=' ) )
			// Calculadora.g:231:7: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
			{
			// Calculadora.g:231:7: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='=') ) {
					alt5=3;
				}

				else {
					alt5=1;
				}

				}
				break;
			case '<':
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2=='=') ) {
					alt5=4;
				}

				else {
					alt5=2;
				}

				}
				break;
			case '=':
				{
				alt5=5;
				}
				break;
			case '!':
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Calculadora.g:231:8: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// Calculadora.g:231:14: '<'
					{
					match('<'); 
					}
					break;
				case 3 :
					// Calculadora.g:231:20: '>='
					{
					match(">="); 

					}
					break;
				case 4 :
					// Calculadora.g:231:27: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// Calculadora.g:231:34: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// Calculadora.g:231:41: '!='
					{
					match("!="); 

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
	// $ANTLR end "OpRel"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Calculadora.g:238:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// Calculadora.g:238:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// Calculadora.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | Number | Id | OpRel | WS )
		int alt6=18;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt6=1;
			}
			break;
		case ')':
			{
			alt6=2;
			}
			break;
		case '*':
			{
			alt6=3;
			}
			break;
		case '+':
			{
			alt6=4;
			}
			break;
		case '-':
			{
			alt6=5;
			}
			break;
		case '/':
			{
			alt6=6;
			}
			break;
		case ';':
			{
			alt6=7;
			}
			break;
		case '=':
			{
			int LA6_8 = input.LA(2);
			if ( (LA6_8=='=') ) {
				alt6=17;
			}

			else {
				alt6=8;
			}

			}
			break;
		case 'd':
			{
			int LA6_9 = input.LA(2);
			if ( (LA6_9=='o') ) {
				int LA6_20 = input.LA(3);
				if ( ((LA6_20 >= 'A' && LA6_20 <= 'Z')||(LA6_20 >= 'a' && LA6_20 <= 'z')) ) {
					alt6=16;
				}

				else {
					alt6=9;
				}

			}

			else {
				alt6=16;
			}

			}
			break;
		case 'i':
			{
			int LA6_10 = input.LA(2);
			if ( (LA6_10=='f') ) {
				int LA6_21 = input.LA(3);
				if ( ((LA6_21 >= 'A' && LA6_21 <= 'Z')||(LA6_21 >= 'a' && LA6_21 <= 'z')) ) {
					alt6=16;
				}

				else {
					alt6=10;
				}

			}

			else {
				alt6=16;
			}

			}
			break;
		case 't':
			{
			int LA6_11 = input.LA(2);
			if ( (LA6_11=='h') ) {
				int LA6_22 = input.LA(3);
				if ( (LA6_22=='e') ) {
					int LA6_26 = input.LA(4);
					if ( (LA6_26=='n') ) {
						int LA6_28 = input.LA(5);
						if ( ((LA6_28 >= 'A' && LA6_28 <= 'Z')||(LA6_28 >= 'a' && LA6_28 <= 'z')) ) {
							alt6=16;
						}

						else {
							alt6=11;
						}

					}

					else {
						alt6=16;
					}

				}

				else {
					alt6=16;
				}

			}

			else {
				alt6=16;
			}

			}
			break;
		case 'w':
			{
			int LA6_12 = input.LA(2);
			if ( (LA6_12=='h') ) {
				int LA6_23 = input.LA(3);
				if ( (LA6_23=='i') ) {
					int LA6_27 = input.LA(4);
					if ( (LA6_27=='l') ) {
						int LA6_29 = input.LA(5);
						if ( (LA6_29=='e') ) {
							int LA6_31 = input.LA(6);
							if ( ((LA6_31 >= 'A' && LA6_31 <= 'Z')||(LA6_31 >= 'a' && LA6_31 <= 'z')) ) {
								alt6=16;
							}

							else {
								alt6=12;
							}

						}

						else {
							alt6=16;
						}

					}

					else {
						alt6=16;
					}

				}

				else {
					alt6=16;
				}

			}

			else {
				alt6=16;
			}

			}
			break;
		case '{':
			{
			alt6=13;
			}
			break;
		case '}':
			{
			alt6=14;
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
			alt6=15;
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
		case 'e':
		case 'f':
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
		case 'x':
		case 'y':
		case 'z':
			{
			alt6=16;
			}
			break;
		case '!':
		case '<':
		case '>':
			{
			alt6=17;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt6=18;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
		switch (alt6) {
			case 1 :
				// Calculadora.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// Calculadora.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// Calculadora.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// Calculadora.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// Calculadora.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// Calculadora.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// Calculadora.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// Calculadora.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// Calculadora.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// Calculadora.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// Calculadora.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// Calculadora.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// Calculadora.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// Calculadora.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// Calculadora.g:1:92: Number
				{
				mNumber(); 

				}
				break;
			case 16 :
				// Calculadora.g:1:99: Id
				{
				mId(); 

				}
				break;
			case 17 :
				// Calculadora.g:1:102: OpRel
				{
				mOpRel(); 

				}
				break;
			case 18 :
				// Calculadora.g:1:108: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
