grammar practica3ANTLR;


// practica3ANTLR;  Miguel Romero

/* Este será el punto de entrada de nuestra analizador. */

@members{
		int cont = -1;
		int contL = -1;
}

entrada returns [String value]
    :	instruccion1 = instruccion        
        (                   
			instruccion2 = instruccion 
        )*
        {
			System.out.println ("(HALT, NULL, NULL, NULL)");
        }
    ;	


instruccion returns [String total]
    :  		

	(Id '=' exp = expresion ';'   		{ 	
							$total = "(ASSIGN, "+ $Id.text + ", " + $exp.t + ", NULL) ";
							System.out.println($total);
                                        	}
	)
	
	|

	'if' '(' d1 = dato op = oprelacional d2 = dato ')' 'then' declara = declaracion ';'	
		{		
			$total = "(IF," + " !(" + $d1.t + $op.t + $d2.t + ")" + ", " + "GoTo " + "L" + contL + ")" ;
			System.out.println($total);
			System.out.println($declara.t);
			System.out.println("L" + contL + ":");
		}    
	|
	
	'while' '('  d3 = dato op2 = oprelacional d4 = dato ')' 'do' '{' declara2 = declaracion '}' ';'
		{
			$total = "L" + contL + ":\n" + "(WHILE, " + "(" + $d3.t + $op2.t + $d4.t + ")" + ", GOTO L" 
			+ (contL+1) + ")" + "\nGOTO L" + (contL+2) + "\nL" + (contL+1) + ":" +
			"\n" + $declara2.t + "\nGOTO L" + (contL) + "\nL" + (contL+2) + ":";
			System.out.println($total);
			contL = contL + 2;
		}
;

declaracion returns [String total, String t]
	:
	(Id '=' exp = expresion_seq ';'
	{
		contL++;

		if ($exp.total.equals("1"))		
			$t = $exp.total + "(ASSIGN, "+ $Id.text + ", " + $exp.t + ", NULL) ";

		else
			$t = $exp.total + "\n" + "(ASSIGN, "+ $Id.text + ", " + $exp.t + ", NULL) ";

		$total = $exp.total + "\n" + "(ASSIGN, "+ $Id.text + ", " + $exp.t + ", NULL) ";
	})*
;

/* La suma y la resta tienen la prioridad más baja. */


expresion returns [String total, String t]
    :    m1 = term              {	$total = $m1.t; $t = $m1.t;} 
         ( '+' m2 = term        
				{	
					cont ++;  
					if ($t.equals("t" + (cont-1)))
						$total = "(ADD, t" + cont + ", " + $t + ", " + $m2.t + ')';
					else
						$total = "(ADD, t" + cont + ", " + $m1.t + ", " + $m2.t + ')'; 
						System.out.println($total);
						$t = "t" + cont;
				}
         | '-' m2 = term        {
				 	cont ++; 
					if ($t.equals("t" + (cont-1)))
						$total = "(SUB, t" + cont + ", " + $t + ", " + $m2.t + ')'; 
					else
						$total = "(SUB, t" + cont + ", " + $m1.t + ", " + $m2.t + ')'; 
						System.out.println($total);
						$t = "t" + cont;
				}
         )*
    ;

expresion_seq returns [String total, String t]
    :    m1 = term_seq             {	$total = $m1.t; $t = $m1.t;} 
         ( '+' m2 = term        
				{	
					cont ++;  
					if ($t.equals("t" + (cont-1)))
						$total = "(ADD, t" + cont + ", " + $t + ", " + $m2.t + ')';
					else
						$total = "(ADD, t" + cont + ", " + $m1.t + ", " + $m2.t + ')'; 
						$t = "t" + cont;
				}
         | '-' m2 = term        { 	
					cont ++; 
					if ($t.equals("t" + (cont-1)))
						$total = "(SUB, t" + cont + ", " + $t + ", " + $m2.t + ')'; 
					else
						$total = "(SUB, t" + cont + ", " + $m1.t + ", " + $m2.t + ')'; 
						$t = "t" + cont;
				}
         )*
    ;


/* La multiplicación y la división tienen una prioridad más alta. */

term returns [String salida, String t]
    :    a1 = fact                { $salida = $a1.t; $t = $a1.t;}
         ( '*' a2 = fact          
				{ 
					cont ++; 
					if ($t.equals("t" + (cont-1)))
						$salida = "(MULT, t" + cont + ", " + $t + ", " + $a2.t + ')';
					else
						$salida = "(MULT, t" + cont + ", " + $a1.t + ", " + $a2.t + ')'; 
						System.out.println($salida);
						$t = "t" + cont;
				}
         | '/' a2=fact          { 
					cont ++; 
					if ($t.equals("t" + (cont-1)))
						$salida = "(DIV, t" + cont + ", " + $t + ", " + $a2.t + ')'; 
					else
						$salida = "(DIV, t" + cont + ", " + $a1.t + ", " + $a2.t + ')'; 
						System.out.println($salida);
						$t = "t" + cont;
				}
         )*
    ;

term_seq returns [String salida, String t]
    :    a1 = fact                { $salida = $a1.t; $t = $a1.t;}
         ( '*' a2 = fact          
				{ 
					cont ++; 
					if ($t.equals("t" + (cont-1)))
						$salida = "(MULT, t" + cont + ", " + $t + ", " + $a2.t + ')';
					else
					$salida = "(MULT, t" + cont + ", " + $a1.t + ", " + $a2.t + ')'; 
					$t = "t" + cont;
				}
         | '/' a2=fact          { 
					cont ++; 
					if ($t.equals("t" + (cont-1)))
						$salida = "(DIV, t" + cont + ", " + $t + ", " + $a2.t + ')'; 
					else
						$salida = "(DIV, t" + cont + ", " + $a1.t + ", " + $a2.t + ')'; 
						$t = "t" + cont;
				}
         )*
    ;
 
fact returns [String value, String t]
    	:	    '(' exp=expresion ')'      {$value = $exp.t; $t = $exp.t;}
    	|            n=dato                    {$value = $n.t; $t = $n.t;}
        ;


dato returns [String codigo, String t]
   :	(z=Num				{
						$codigo = $z.text;
						$t = $z.text;
					}
   	| x=Id				{
						$codigo = $x.text;
						$t = $x.text;
					}
   	| '-' z=Num			{
						cont ++; 
						$codigo = "(NEG, t" + cont + ", " + $z.text + ", NULL) "; 
						System.out.println($codigo);
						$t = "t" + cont;
					}
   	| '-' x=Id			{ 
						cont ++; 
						$codigo = "(NEG, t" + cont + ", " + $x.text + ", NULL) "; 
						System.out.println($codigo);
						$t = "t" + cont;
					}
   	)
   ;

oprelacional returns [String codigo, String t]
	:	oper = OpRel
					{
						$codigo = $oper.text;
						$t = $oper.text;
					}
;
   
/* Un número: puede ser un valor entero o un valor decimal. */


Num
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;


Id 	
    :	('a'..'z' | 'A'..'Z')+
    ;

OpRel

    :	('>' | '<' | '>=' | '<=' | '==' | '!=' )
    ;

/* Ignoramos todos los caracteres de espacios en blanco. */

WS
    :   (' ' | '\t' | '\r'| '\n')    { $channel=HIDDEN; }
    ;
