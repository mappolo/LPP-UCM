#include <stdio.h>

extern int yylex();

int main( int argc, const char * argv[] )
{
    
    int analizador_lexico = yylex();
    
    return analizador_lexico;
    
}
