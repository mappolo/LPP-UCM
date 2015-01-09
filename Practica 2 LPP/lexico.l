/***************** 
  Definiciones
	Se colocan las cabeceras, variables y expresiones regulares

********************/


%{
  #include <stdio.h>
  #include <stdlib.h>
  #include "sintactico.tab.h"
  int linea=0;
%}
/*
Creamos todas las expresiones regulares

Creamos la definicion llamada DIGITO, podemos acceder esta definicion
usando {DIGITO}*/
DIGITO [0-9]
TOKEN_NUM {DIGITO}+("."{DIGITO}+)?
TOKEN_ID [a-zA-Z][a-zA-Z0-9_]*


%%
 /***************
   Reglas
 *****************/


 /* Creamos las reglas que reconoceran las cadenas que acepte
  nuestro scanner y retornaremos el token a bison con la
  funcion return. */
{TOKEN_NUM} {yylval.real=atof(yytext); return(TOKEN_NUM);}
"=" 	{return(TOKEN_ASIGN);}
"+" 	{return(TOKEN_MAS);}
"-" 	{return(TOKEN_MENOS);}
";" 	{return(TOKEN_PTOCOMA);}
"*" 	{return(TOKEN_MULT);}
"/" 	{return(TOKEN_DIV);}
"(" 	{return(TOKEN_PAA);}
")" 	{return(TOKEN_PAC);}
"sen" 	{return(TOKEN_SEN);}
"cos" 	{return(TOKEN_COS);}

"\n" 	{linea++;}
[\t\r\f] {}
" "		{}
 /* Si en nuestra entrada tiene algun caracter que no pertenece a 
   las reglas anteriores, se genera un error lexico */

.		{printf("Error lexico en linea %d",linea);}
%%
/* 
Codigo de Usuario

Aqui podemos realizar otras funciones, como por ejemplo ingresar
simbolos a nuestra tabal de simbolos o cualquier otra accione
del usuario.  
Todo lo que el usuario coloque en esta seccion se copiara al
archvi lex.yy.c tal y como esta.
*/
