// $ANTLR 3.5.2 Calculadora.g 2015-02-18 21:44:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalculadoraParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Id", "Number", "OpRel", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'", "';'", "'='", "'do'", "'if'", 
		"'then'", "'while'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CalculadoraParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalculadoraParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalculadoraParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Calculadora.g"; }


		int cnt = -1;	
		int cntL = -1;



	// $ANTLR start "entrada"
	// Calculadora.g:11:1: entrada returns [String codigo] : ins1= instruccion (ins2= instruccion )* ;
	public final String entrada() throws RecognitionException {
		String codigo = null;


		ParserRuleReturnScope ins1 =null;
		ParserRuleReturnScope ins2 =null;

		try {
			// Calculadora.g:12:5: (ins1= instruccion (ins2= instruccion )* )
			// Calculadora.g:12:7: ins1= instruccion (ins2= instruccion )*
			{
			pushFollow(FOLLOW_instruccion_in_entrada29);
			ins1=instruccion();
			state._fsp--;

			// Calculadora.g:13:9: (ins2= instruccion )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Id||LA1_0==17||LA1_0==19) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Calculadora.g:14:9: ins2= instruccion
					{
					pushFollow(FOLLOW_instruccion_in_entrada78);
					ins2=instruccion();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}


						codigo = "(HALT,NULL,NULL,NULL)";
						System.out.println(codigo); 	
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return codigo;
	}
	// $ANTLR end "entrada"


	public static class instruccion_return extends ParserRuleReturnScope {
		public String codigo;
		public String cadenaExpresionAuxiliarFinal;
		public String cadenaFactorAuxiliarFinal;
	};


	// $ANTLR start "instruccion"
	// Calculadora.g:23:1: instruccion returns [String codigo, String cadenaExpresionAuxiliarFinal, String cadenaFactorAuxiliarFinal] : ( Id '=' exp= expresion ';' | 'if' '(' d1= dato op= oprelacional d2= dato ')' 'then' '{' declara= declaracion '}' ';' | 'while' '(' d3= dato op2= oprelacional d4= dato ')' 'do' '{' declara2= declaracion '}' ';' );
	public final CalculadoraParser.instruccion_return instruccion() throws RecognitionException {
		CalculadoraParser.instruccion_return retval = new CalculadoraParser.instruccion_return();
		retval.start = input.LT(1);

		Token Id1=null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope d1 =null;
		ParserRuleReturnScope op =null;
		ParserRuleReturnScope d2 =null;
		ParserRuleReturnScope declara =null;
		ParserRuleReturnScope d3 =null;
		ParserRuleReturnScope op2 =null;
		ParserRuleReturnScope d4 =null;
		ParserRuleReturnScope declara2 =null;

		try {
			// Calculadora.g:24:5: ( Id '=' exp= expresion ';' | 'if' '(' d1= dato op= oprelacional d2= dato ')' 'then' '{' declara= declaracion '}' ';' | 'while' '(' d3= dato op2= oprelacional d4= dato ')' 'do' '{' declara2= declaracion '}' ';' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case Id:
				{
				alt2=1;
				}
				break;
			case 17:
				{
				alt2=2;
				}
				break;
			case 19:
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
					// Calculadora.g:24:11: Id '=' exp= expresion ';'
					{
					Id1=(Token)match(input,Id,FOLLOW_Id_in_instruccion119); 
					match(input,15,FOLLOW_15_in_instruccion121); 
					pushFollow(FOLLOW_expresion_in_instruccion125);
					exp=expresion();
					state._fsp--;

					match(input,14,FOLLOW_14_in_instruccion127); 

										if((exp!=null?((CalculadoraParser.expresion_return)exp).resultado:null).length() == 1) 
											retval.codigo = "(ASSIGN," + (Id1!=null?Id1.getText():null) + "," + (exp!=null?((CalculadoraParser.expresion_return)exp).resultado:null) + ",NULL)";
										else
											retval.codigo = "(ASSIGN," + (Id1!=null?Id1.getText():null) + ",t" + cnt + ",NULL)";

										/*Independiente de else*/						

										System.out.println(retval.codigo);	 
					                              	
					}
					break;
				case 2 :
					// Calculadora.g:35:3: 'if' '(' d1= dato op= oprelacional d2= dato ')' 'then' '{' declara= declaracion '}' ';'
					{
					match(input,17,FOLLOW_17_in_instruccion138); 
					match(input,8,FOLLOW_8_in_instruccion140); 
					pushFollow(FOLLOW_dato_in_instruccion146);
					d1=dato();
					state._fsp--;

					pushFollow(FOLLOW_oprelacional_in_instruccion152);
					op=oprelacional();
					state._fsp--;

					pushFollow(FOLLOW_dato_in_instruccion158);
					d2=dato();
					state._fsp--;

					match(input,9,FOLLOW_9_in_instruccion160); 
					match(input,18,FOLLOW_18_in_instruccion162); 
					match(input,20,FOLLOW_20_in_instruccion164); 
					pushFollow(FOLLOW_declaracion_in_instruccion170);
					declara=declaracion();
					state._fsp--;

					match(input,21,FOLLOW_21_in_instruccion172); 
					match(input,14,FOLLOW_14_in_instruccion174); 
							
								retval.cadenaExpresionAuxiliarFinal = (declara!=null?((CalculadoraParser.declaracion_return)declara).cadenaExpresionAuxiliarMedio:null); 
								retval.cadenaFactorAuxiliarFinal = (declara!=null?((CalculadoraParser.declaracion_return)declara).cadenaFactorAuxiliarMedio:null);
						/*Este es el código que tienes que ordenar*/		
								retval.codigo = "(IF,!(" + (d1!=null?((CalculadoraParser.dato_return)d1).resultado:null) + (op!=null?((CalculadoraParser.oprelacional_return)op).resultado:null) + (d2!=null?((CalculadoraParser.dato_return)d2).resultado:null) + "),GOTO,L" + cntL + ")" ;
								System.out.println(retval.codigo);
								System.out.println(retval.cadenaFactorAuxiliarFinal);
								System.out.println(retval.cadenaExpresionAuxiliarFinal);
								System.out.println("L" + cntL + ":");	
							
					}
					break;
				case 3 :
					// Calculadora.g:46:3: 'while' '(' d3= dato op2= oprelacional d4= dato ')' 'do' '{' declara2= declaracion '}' ';'
					{
					match(input,19,FOLLOW_19_in_instruccion183); 
					match(input,8,FOLLOW_8_in_instruccion185); 
					pushFollow(FOLLOW_dato_in_instruccion192);
					d3=dato();
					state._fsp--;

					pushFollow(FOLLOW_oprelacional_in_instruccion198);
					op2=oprelacional();
					state._fsp--;

					pushFollow(FOLLOW_dato_in_instruccion204);
					d4=dato();
					state._fsp--;

					match(input,9,FOLLOW_9_in_instruccion206); 
					match(input,16,FOLLOW_16_in_instruccion208); 
					match(input,20,FOLLOW_20_in_instruccion210); 
					pushFollow(FOLLOW_declaracion_in_instruccion216);
					declara2=declaracion();
					state._fsp--;

					match(input,21,FOLLOW_21_in_instruccion218); 
					match(input,14,FOLLOW_14_in_instruccion220); 

								
							
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruccion"


	public static class declaracion_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public String cadenaExpresionAuxiliarMedio;
		public String cadenaFactorAuxiliarMedio;
	};


	// $ANTLR start "declaracion"
	// Calculadora.g:53:1: declaracion returns [String codigo, String resultado, String cadenaExpresionAuxiliarMedio, String cadenaFactorAuxiliarMedio] : ( Id '=' exp= expresion_seq ';' )* ;
	public final CalculadoraParser.declaracion_return declaracion() throws RecognitionException {
		CalculadoraParser.declaracion_return retval = new CalculadoraParser.declaracion_return();
		retval.start = input.LT(1);

		Token Id2=null;
		ParserRuleReturnScope exp =null;

		try {
			// Calculadora.g:54:2: ( ( Id '=' exp= expresion_seq ';' )* )
			// Calculadora.g:55:2: ( Id '=' exp= expresion_seq ';' )*
			{
			// Calculadora.g:55:2: ( Id '=' exp= expresion_seq ';' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==Id) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Calculadora.g:55:3: Id '=' exp= expresion_seq ';'
					{
					Id2=(Token)match(input,Id,FOLLOW_Id_in_declaracion245); 
					match(input,15,FOLLOW_15_in_declaracion247); 
					pushFollow(FOLLOW_expresion_seq_in_declaracion253);
					exp=expresion_seq();
					state._fsp--;

					match(input,14,FOLLOW_14_in_declaracion255); 

							cntL++;

							retval.cadenaFactorAuxiliarMedio = (exp!=null?((CalculadoraParser.expresion_seq_return)exp).cadenaFactorAuxiliar:null);
							retval.cadenaExpresionAuxiliarMedio = "(ASSIGN,"+ (Id2!=null?Id2.getText():null) + "," + (exp!=null?((CalculadoraParser.expresion_seq_return)exp).resultado:null) + ",NULL) ";
						
					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaracion"


	public static class expresion_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
	};


	// $ANTLR start "expresion"
	// Calculadora.g:68:1: expresion returns [String codigo, String resultado] : m1= termino ( '+' m2= termino | '-' m2= termino )* ;
	public final CalculadoraParser.expresion_return expresion() throws RecognitionException {
		CalculadoraParser.expresion_return retval = new CalculadoraParser.expresion_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		try {
			// Calculadora.g:69:5: (m1= termino ( '+' m2= termino | '-' m2= termino )* )
			// Calculadora.g:69:10: m1= termino ( '+' m2= termino | '-' m2= termino )*
			{
			pushFollow(FOLLOW_termino_in_expresion287);
			m1=termino();
			state._fsp--;

			 
								retval.resultado = (m1!=null?((CalculadoraParser.termino_return)m1).resultado:null); 
							
			// Calculadora.g:73:10: ( '+' m2= termino | '-' m2= termino )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}
				else if ( (LA4_0==12) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Calculadora.g:73:12: '+' m2= termino
					{
					match(input,11,FOLLOW_11_in_expresion321); 
					pushFollow(FOLLOW_termino_in_expresion325);
					m2=termino();
					state._fsp--;

					 
										cnt++;
										retval.codigo = "(ADD,t" + cnt + "," + (m1!=null?((CalculadoraParser.termino_return)m1).resultado:null) + "," + (m2!=null?((CalculadoraParser.termino_return)m2).resultado:null) + ")";
										System.out.println(retval.codigo);
										retval.resultado = "t" + cnt; 
									
					}
					break;
				case 2 :
					// Calculadora.g:79:12: '-' m2= termino
					{
					match(input,12,FOLLOW_12_in_expresion346); 
					pushFollow(FOLLOW_termino_in_expresion350);
					m2=termino();
					state._fsp--;

					 
										cnt++;
										retval.codigo = "(SUB,t" + cnt + "," + (m1!=null?((CalculadoraParser.termino_return)m1).resultado:null) + "," + (m2!=null?((CalculadoraParser.termino_return)m2).resultado:null) + ")";
										System.out.println(retval.codigo);
										retval.resultado = "t" + cnt;
									
					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expresion"


	public static class expresion_seq_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
		public String cadenaFactorAuxiliar;
	};


	// $ANTLR start "expresion_seq"
	// Calculadora.g:88:1: expresion_seq returns [String codigo, String resultado, String cadenaFactorAuxiliar] : m1= factor ( '+' m2= factor | '-' m2= factor | '*' m2= factor | '/' m2= factor )* ;
	public final CalculadoraParser.expresion_seq_return expresion_seq() throws RecognitionException {
		CalculadoraParser.expresion_seq_return retval = new CalculadoraParser.expresion_seq_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		try {
			// Calculadora.g:89:5: (m1= factor ( '+' m2= factor | '-' m2= factor | '*' m2= factor | '/' m2= factor )* )
			// Calculadora.g:89:10: m1= factor ( '+' m2= factor | '-' m2= factor | '*' m2= factor | '/' m2= factor )*
			{
			pushFollow(FOLLOW_factor_in_expresion_seq399);
			m1=factor();
			state._fsp--;

				
								retval.codigo = (m1!=null?((CalculadoraParser.factor_return)m1).resultado:null); retval.resultado = (m1!=null?((CalculadoraParser.factor_return)m1).codigo:null);
							
			// Calculadora.g:93:10: ( '+' m2= factor | '-' m2= factor | '*' m2= factor | '/' m2= factor )*
			loop5:
			while (true) {
				int alt5=5;
				switch ( input.LA(1) ) {
				case 11:
					{
					alt5=1;
					}
					break;
				case 12:
					{
					alt5=2;
					}
					break;
				case 10:
					{
					alt5=3;
					}
					break;
				case 13:
					{
					alt5=4;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// Calculadora.g:93:12: '+' m2= factor
					{
					match(input,11,FOLLOW_11_in_expresion_seq432); 
					pushFollow(FOLLOW_factor_in_expresion_seq438);
					m2=factor();
					state._fsp--;

						
										cnt ++;  

										if (retval.resultado.equals("t" + (cnt-1)))
											retval.codigo = "(ADD,t" + cnt + "," + retval.resultado + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')';
										else
											retval.codigo = "(ADD,t" + cnt + "," + (m1!=null?((CalculadoraParser.factor_return)m1).resultado:null) + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')'; 
									
										retval.cadenaFactorAuxiliar = retval.codigo;					
										retval.resultado = "t" + cnt;
									
					}
					break;
				case 2 :
					// Calculadora.g:105:12: '-' m2= factor
					{
					match(input,12,FOLLOW_12_in_expresion_seq464); 
					pushFollow(FOLLOW_factor_in_expresion_seq470);
					m2=factor();
					state._fsp--;

					 	
										cnt ++; 
									
										if (retval.resultado.equals("t" + (cnt-1)))
											retval.codigo = "(SUB,t" + cnt + "," + retval.resultado + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')'; 
										else
											retval.codigo = "(SUB,t" + cnt + "," + (m1!=null?((CalculadoraParser.factor_return)m1).resultado:null) + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')'; 
										
										retval.cadenaFactorAuxiliar = retval.codigo;
										retval.resultado = "t" + cnt;
									
					}
					break;
				case 3 :
					// Calculadora.g:117:4: '*' m2= factor
					{
					match(input,10,FOLLOW_10_in_expresion_seq489); 
					pushFollow(FOLLOW_factor_in_expresion_seq495);
					m2=factor();
					state._fsp--;

					 
										cnt ++;
										 
										if (retval.resultado.equals("t" + (cnt-1)))
											retval.codigo = "(MULT,t" + cnt + "," + retval.resultado + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')';
										else
											retval.codigo = "(MULT,t" + cnt + "," + (m1!=null?((CalculadoraParser.factor_return)m1).resultado:null) + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')'; 
										
										retval.cadenaFactorAuxiliar = retval.codigo;
										retval.resultado = "t" + cnt;
									
					}
					break;
				case 4 :
					// Calculadora.g:129:12: '/' m2= factor
					{
					match(input,13,FOLLOW_13_in_expresion_seq524); 
					pushFollow(FOLLOW_factor_in_expresion_seq528);
					m2=factor();
					state._fsp--;

					 
										cnt ++; 

										if (retval.resultado.equals("t" + (cnt-1)))
											retval.codigo = "(DIV,t" + cnt + "," + retval.resultado + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')';
										else
											retval.codigo = "(DIV,t" + cnt + "," + (m1!=null?((CalculadoraParser.factor_return)m1).resultado:null) + "," + (m2!=null?((CalculadoraParser.factor_return)m2).resultado:null) + ')';

										retval.cadenaFactorAuxiliar = retval.codigo;					
										retval.resultado = "t" + cnt;
									
					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expresion_seq"


	public static class termino_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
	};


	// $ANTLR start "termino"
	// Calculadora.g:146:1: termino returns [String codigo, String resultado] : a1= factor ( '*' a2= factor | '/' a2= factor )* ;
	public final CalculadoraParser.termino_return termino() throws RecognitionException {
		CalculadoraParser.termino_return retval = new CalculadoraParser.termino_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		try {
			// Calculadora.g:147:5: (a1= factor ( '*' a2= factor | '/' a2= factor )* )
			// Calculadora.g:147:10: a1= factor ( '*' a2= factor | '/' a2= factor )*
			{
			pushFollow(FOLLOW_factor_in_termino579);
			a1=factor();
			state._fsp--;

			 
								retval.resultado = (a1!=null?((CalculadoraParser.factor_return)a1).resultado:null); 
							
			// Calculadora.g:151:10: ( '*' a2= factor | '/' a2= factor )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==10) ) {
					alt6=1;
				}
				else if ( (LA6_0==13) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// Calculadora.g:151:12: '*' a2= factor
					{
					match(input,10,FOLLOW_10_in_termino616); 
					pushFollow(FOLLOW_factor_in_termino622);
					a2=factor();
					state._fsp--;

					 
										cnt++;					
										retval.codigo = "(MULT,t" + cnt + "," + (a1!=null?((CalculadoraParser.factor_return)a1).resultado:null) + "," + (a2!=null?((CalculadoraParser.factor_return)a2).resultado:null) + ")";
										System.out.println(retval.codigo);
										retval.resultado = "t" + cnt;
									
					}
					break;
				case 2 :
					// Calculadora.g:158:12: '/' a2= factor
					{
					match(input,13,FOLLOW_13_in_termino653); 
					pushFollow(FOLLOW_factor_in_termino659);
					a2=factor();
					state._fsp--;

					 
										cnt++;					
										retval.codigo = "(DIV,t" + cnt + "," + (a1!=null?((CalculadoraParser.factor_return)a1).resultado:null) + "," + (a2!=null?((CalculadoraParser.factor_return)a2).resultado:null) + ")";
										System.out.println(retval.codigo);
										retval.resultado = "t" + cnt; 
									
					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "termino"


	public static class factor_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
	};


	// $ANTLR start "factor"
	// Calculadora.g:169:1: factor returns [String codigo, String resultado] : ( '(' exp= expresion ')' |n= dato );
	public final CalculadoraParser.factor_return factor() throws RecognitionException {
		CalculadoraParser.factor_return retval = new CalculadoraParser.factor_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope n =null;

		try {
			// Calculadora.g:170:6: ( '(' exp= expresion ')' |n= dato )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==8) ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= Id && LA7_0 <= Number)||LA7_0==12) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Calculadora.g:170:12: '(' exp= expresion ')'
					{
					match(input,8,FOLLOW_8_in_factor723); 
					pushFollow(FOLLOW_expresion_in_factor727);
					exp=expresion();
					state._fsp--;

					match(input,9,FOLLOW_9_in_factor729); 
					 
										retval.codigo = (exp!=null?((CalculadoraParser.expresion_return)exp).codigo:null);
										retval.resultado = (exp!=null?((CalculadoraParser.expresion_return)exp).resultado:null); 
									
					}
					break;
				case 2 :
					// Calculadora.g:175:19: n= dato
					{
					pushFollow(FOLLOW_dato_in_factor763);
					n=dato();
					state._fsp--;

					 
										retval.codigo = (n!=null?((CalculadoraParser.dato_return)n).codigo:null); 
										retval.resultado = (n!=null?((CalculadoraParser.dato_return)n).resultado:null);
									
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class dato_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
	};


	// $ANTLR start "dato"
	// Calculadora.g:183:1: dato returns [String codigo, String resultado] : ( Number | Id | '-' Number | '-' Id );
	public final CalculadoraParser.dato_return dato() throws RecognitionException {
		CalculadoraParser.dato_return retval = new CalculadoraParser.dato_return();
		retval.start = input.LT(1);

		Token Number3=null;
		Token Id4=null;
		Token Number5=null;
		Token Id6=null;

		try {
			// Calculadora.g:184:4: ( Number | Id | '-' Number | '-' Id )
			int alt8=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt8=1;
				}
				break;
			case Id:
				{
				alt8=2;
				}
				break;
			case 12:
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3==Number) ) {
					alt8=3;
				}
				else if ( (LA8_3==Id) ) {
					alt8=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Calculadora.g:184:6: Number
					{
					Number3=(Token)match(input,Number,FOLLOW_Number_in_dato814); 

										retval.codigo = (Number3!=null?Number3.getText():null);
										retval.resultado = (Number3!=null?Number3.getText():null);
									
					}
					break;
				case 2 :
					// Calculadora.g:188:3: Id
					{
					Id4=(Token)match(input,Id,FOLLOW_Id_in_dato822); 

										retval.codigo = (Id4!=null?Id4.getText():null);
										retval.resultado = (Id4!=null?Id4.getText():null);
									
					}
					break;
				case 3 :
					// Calculadora.g:193:3: '-' Number
					{
					match(input,12,FOLLOW_12_in_dato832); 
					Number5=(Token)match(input,Number,FOLLOW_Number_in_dato833); 

										cnt++;
										retval.codigo = "(NEG,t" + cnt + ',' + (Number5!=null?Number5.getText():null) + ",NULL)";
										System.out.println(retval.codigo);
										retval.resultado = "t" + cnt; 
									
					}
					break;
				case 4 :
					// Calculadora.g:200:3: '-' Id
					{
					match(input,12,FOLLOW_12_in_dato843); 
					Id6=(Token)match(input,Id,FOLLOW_Id_in_dato844); 

										cnt++;
										retval.codigo = "(NEG,t" + cnt + ',' + (Id6!=null?Id6.getText():null) + ",NULL)";
										System.out.println(retval.codigo);
										retval.resultado = "t" + cnt;				
									
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dato"


	public static class oprelacional_return extends ParserRuleReturnScope {
		public String codigo;
		public String resultado;
	};


	// $ANTLR start "oprelacional"
	// Calculadora.g:209:1: oprelacional returns [String codigo, String resultado] : operador= OpRel ;
	public final CalculadoraParser.oprelacional_return oprelacional() throws RecognitionException {
		CalculadoraParser.oprelacional_return retval = new CalculadoraParser.oprelacional_return();
		retval.start = input.LT(1);

		Token operador=null;

		try {
			// Calculadora.g:210:2: (operador= OpRel )
			// Calculadora.g:210:4: operador= OpRel
			{
			operador=(Token)match(input,OpRel,FOLLOW_OpRel_in_oprelacional875); 

									retval.codigo = (operador!=null?operador.getText():null);
									retval.resultado = (operador!=null?operador.getText():null);
								
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oprelacional"

	// Delegated rules



	public static final BitSet FOLLOW_instruccion_in_entrada29 = new BitSet(new long[]{0x00000000000A0012L});
	public static final BitSet FOLLOW_instruccion_in_entrada78 = new BitSet(new long[]{0x00000000000A0012L});
	public static final BitSet FOLLOW_Id_in_instruccion119 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_instruccion121 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_expresion_in_instruccion125 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_instruccion127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_instruccion138 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_instruccion140 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_dato_in_instruccion146 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_oprelacional_in_instruccion152 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_dato_in_instruccion158 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_instruccion160 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_instruccion162 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_instruccion164 = new BitSet(new long[]{0x0000000000200010L});
	public static final BitSet FOLLOW_declaracion_in_instruccion170 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_instruccion172 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_instruccion174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_instruccion183 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_instruccion185 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_dato_in_instruccion192 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_oprelacional_in_instruccion198 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_dato_in_instruccion204 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_instruccion206 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_instruccion208 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_instruccion210 = new BitSet(new long[]{0x0000000000200010L});
	public static final BitSet FOLLOW_declaracion_in_instruccion216 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_instruccion218 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_instruccion220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_declaracion245 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_declaracion247 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_expresion_seq_in_declaracion253 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_declaracion255 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_termino_in_expresion287 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_expresion321 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_termino_in_expresion325 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_expresion346 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_termino_in_expresion350 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_factor_in_expresion_seq399 = new BitSet(new long[]{0x0000000000003C02L});
	public static final BitSet FOLLOW_11_in_expresion_seq432 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_factor_in_expresion_seq438 = new BitSet(new long[]{0x0000000000003C02L});
	public static final BitSet FOLLOW_12_in_expresion_seq464 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_factor_in_expresion_seq470 = new BitSet(new long[]{0x0000000000003C02L});
	public static final BitSet FOLLOW_10_in_expresion_seq489 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_factor_in_expresion_seq495 = new BitSet(new long[]{0x0000000000003C02L});
	public static final BitSet FOLLOW_13_in_expresion_seq524 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_factor_in_expresion_seq528 = new BitSet(new long[]{0x0000000000003C02L});
	public static final BitSet FOLLOW_factor_in_termino579 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_10_in_termino616 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_factor_in_termino622 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_13_in_termino653 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_factor_in_termino659 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_8_in_factor723 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_expresion_in_factor727 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_factor729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dato_in_factor763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_dato814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_dato822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_dato832 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Number_in_dato833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_dato843 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Id_in_dato844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpRel_in_oprelacional875 = new BitSet(new long[]{0x0000000000000002L});
}
