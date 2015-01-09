%{

/******************** 
  Declaraciones en C
**********************/

  #include <stdio.h>
  #include <stdlib.h>
  #include <math.h>
  extern int yylex(void);
  extern char *yytext;
  extern int linea;
  extern FILE *yyin;
  void yyerror(char *s);
%}

/************************
  Declaraciones de Bison
*************************/

/*  Especifica la coleccion completa de tipos de datos para poder usar 
   varios tipos de datos en los terminales y no terminales*/
%union
{
  float real;
}
/* Indica la produccion con la que inicia nuestra gramatica*/
%start Expresion_l

/* Especificacion de termines, podemos especificar tambien su tipo  */
%token <real> TOKEN_NUM
%token TOKEN_MAS
%token TOKEN_MENOS
%token TOKEN_ASIGN
%token TOKEN_PTOCOMA
%token TOKEN_MULT
%token TOKEN_DIV
%token TOKEN_PAA
%token TOKEN_PAC
%token <real> TOKEN_SEN
%token <real> TOKEN_COS
%token <real> TOKEN_ID

/* No Terminales, que tambien podemos especificar su tipo */
%type <real> Expresion
%type <real> Calculadora
%type <real> Expresion_l

/*  Definimos las precedencias de menor a mayor */
%left TOKEN_MAS TOKEN_MENOS
%left TOKEN_MULT TOKEN_DIV

%%
/**********************
  Reglas Gramaticales
***********************/


Expresion_l:		Expresion_l Calculadora   
			|Calculadora
			;
Calculadora	 :  Expresion TOKEN_PTOCOMA {printf ("%4.1f\n",$1);}| Expresion TOKEN_ID {printf("El valor de %s es:", yytext);}		  
		  ;
/* con el simbolo de $$ asignamos el valor semantico de toda
  la accion de la derecha y se la asignamos al no terminal de
   la izquierda, en la siguiente regla, se la asigna a Expresion.
	Para poder acceder al valor de los terminales y no terminales del lado
   derecho usamos el simbolo $ y le concatenamos un numero que representa
   la posicion en la que se encuentra es decir si tenemos

  A --> B NUMERO C

  Si queremos usar el valor que tiene el no terminal B usamos $1, si queremos
  usar el valor que tiene NUMERO usamos $2 y asi sucesivamente.


*/
Expresion : TOKEN_NUM {$$=$1;}
			|Expresion TOKEN_MAS Expresion {$$=$1+$3;}
			|Expresion TOKEN_MENOS Expresion {$$=$1-$3;}
			|Expresion TOKEN_MULT Expresion {$$=$1*$3;}
			|Expresion TOKEN_DIV Expresion {$$=$1/$3;} 
			|TOKEN_PAA Expresion TOKEN_PAC {$$=$2;}
			|TOKEN_SEN TOKEN_PAA Expresion TOKEN_PAC {sen$1;}
			|TOKEN_COS TOKEN_PAA Expresion TOKEN_PAC {cos$1;}
			;
%%
/********************
  Codigo C Adicional
**********************/
void yyerror(char *s)
{
  printf("Error sintactico %s",s);
}

int main(int argc,char **argv)
{
  if (argc>1)
	yyin=fopen(argv[1],"rt");
  else
	yyin=stdin;

  yyparse();
  return 0;
}
