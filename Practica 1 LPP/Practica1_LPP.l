/*
-- Engineer: Miguel Angel Perez Polo
-- Create Date:	11/27/2014 
-- Project Name:	Practica 1 - Conversor ASCII to Code
 
*/

%{
    #include<stdio.h>
    #include<string.h>
	#include<stdlib.h>
    #include "tabla.h"
    
    int linea_actual=0 ;
%}

%s AsciiWord
%s NumberCode

/*
letra      [a-zA-Z]
digito     [0-9]
alphanum   [a-zA-Z_0-9]
blanco     [ \t]
otros      (@|&)

desde 20
*/
%%

#L	BEGIN(AsciiWord);
<AsciiWord>A		{printf("%s", ToCode_A);} 
<AsciiWord>B 		{printf("%s", ToCode_B);}
<AsciiWord>C 		{printf("%s", ToCode_C);}
<AsciiWord>D 		{printf("%s", ToCode_D);}
<AsciiWord>E 		{printf("%s", ToCode_E);}
<AsciiWord>F		{printf("%s", ToCode_F);}
<AsciiWord>G		{printf("%s", ToCode_G);} 
<AsciiWord>H 		{printf("%s", ToCode_H);}
<AsciiWord>I 		{printf("%s", ToCode_I);}
<AsciiWord>J 		{printf("%s", ToCode_J);}
<AsciiWord>K 		{printf("%s", ToCode_K);}
<AsciiWord>L 		{printf("%s", ToCode_L);}
<AsciiWord>M		{printf("%s", ToCode_M);}
<AsciiWord>N		{printf("%s", ToCode_N);} 
<AsciiWord>O 		{printf("%s", ToCode_O);}
<AsciiWord>P 		{printf("%s", ToCode_P);}
<AsciiWord>Q 		{printf("%s", ToCode_Q);}
<AsciiWord>R 		{printf("%s", ToCode_R);}
<AsciiWord>S 		{printf("%s", ToCode_S);}
<AsciiWord>T		{printf("%s", ToCode_T);}
<AsciiWord>U		{printf("%s", ToCode_U);} 
<AsciiWord>V 		{printf("%s", ToCode_V);}
<AsciiWord>W 		{printf("%s", ToCode_W);}
<AsciiWord>X 		{printf("%s", ToCode_X);}
<AsciiWord>Y 		{printf("%s", ToCode_Y);}
<AsciiWord>Z 		{printf("%s", ToCode_Z);}
<AsciiWord>0		{printf("%s", ToCode_CERO);}
<AsciiWord>1		{printf("%s", ToCode_UNO);}
<AsciiWord>2		{printf("%s", ToCode_DOS);}
<AsciiWord>3		{printf("%s", ToCode_TRES);}
<AsciiWord>4		{printf("%s", ToCode_CUATRO);}
<AsciiWord>5		{printf("%s", ToCode_CINCO);}
<AsciiWord>6		{printf("%s", ToCode_SEIS);}
<AsciiWord>7		{printf("%s", ToCode_SIETE);}
<AsciiWord>8		{printf("%s", ToCode_OCHO);}
<AsciiWord>9		{printf("%s", ToCode_NUEVE);}
<AsciiWord>"?"		{printf("%s", ToCode_INTERROGA);}
<AsciiWord>","		{printf("%s", ToCode_COMA);}
<AsciiWord>" "		{printf("%s", ToCode_BLANCO);}
<AsciiWord>"!"		{printf("%s", ToCode_EXCLAMA);}
<AsciiWord>"\""		{printf("%s", ToCode_COMILLA);}
<AsciiWord>"."		{printf("%s", ToCode_PUNTO);}

#H	BEGIN(NumberCode);

<NumberCode>41		{printf("%s", ToASCII_A);}
<NumberCode>42		{printf("%s", ToASCII_B);}
<NumberCode>43		{printf("%s", ToASCII_C);}
<NumberCode>44		{printf("%s", ToASCII_D);}
<NumberCode>45		{printf("%s", ToASCII_E);}
<NumberCode>46		{printf("%s", ToASCII_F);}
<NumberCode>47		{printf("%s", ToASCII_G);}
<NumberCode>48		{printf("%s", ToASCII_H);}
<NumberCode>49		{printf("%s", ToASCII_I);}
<NumberCode>4A		{printf("%s", ToASCII_J);}
<NumberCode>4B		{printf("%s", ToASCII_K);}
<NumberCode>4C		{printf("%s", ToASCII_L);}
<NumberCode>4D		{printf("%s", ToASCII_M);}
<NumberCode>4E		{printf("%s", ToASCII_N);}
<NumberCode>4F		{printf("%s", ToASCII_O);}
<NumberCode>50		{printf("%s", ToASCII_P);}
<NumberCode>51		{printf("%s", ToASCII_Q);}
<NumberCode>52		{printf("%s", ToASCII_R);}
<NumberCode>53		{printf("%s", ToASCII_S);}
<NumberCode>54		{printf("%s", ToASCII_T);}
<NumberCode>55		{printf("%s", ToASCII_U);}
<NumberCode>56		{printf("%s", ToASCII_V);}
<NumberCode>57		{printf("%s", ToASCII_W);}
<NumberCode>58		{printf("%s", ToASCII_X);}
<NumberCode>59		{printf("%s", ToASCII_Y);}
<NumberCode>5A		{printf("%s", ToASCII_Z);}
<NumberCode>30		{printf("%s", ToASCII_CERO);}
<NumberCode>31		{printf("%s", ToASCII_UNO);}
<NumberCode>32		{printf("%s", ToASCII_DOS);}
<NumberCode>33		{printf("%s", ToASCII_TRES);}
<NumberCode>34		{printf("%s", ToASCII_CUATRO);}
<NumberCode>35		{printf("%s", ToASCII_CINCO);}
<NumberCode>36		{printf("%s", ToASCII_SEIS);}
<NumberCode>37		{printf("%s", ToASCII_SIETE);}
<NumberCode>38		{printf("%s", ToASCII_OCHO);}
<NumberCode>39		{printf("%s", ToASCII_NUEVE);}
<NumberCode>3F		{printf("%s", ToASCII_INTERROGA);}
<NumberCode>2C		{printf("%s", ToASCII_COMA);}
<NumberCode>20		{printf("%s", ToASCII_BLANCO);}
<NumberCode>21		{printf("%s", ToASCII_EXCLAMA);}
<NumberCode>22		{printf("%s", ToASCII_COMILLA);}
<NumberCode>2E		{printf("%s", ToASCII_PUNTO);}

%%

void yyerror( const char *msg )
{
    fprintf( stderr, "error %s\n", msg );
}

int yywrap( )
{
    return 1;
}