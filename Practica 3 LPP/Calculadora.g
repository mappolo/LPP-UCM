grammar Calculadora;


/* Este será el punto de entrada de nuestra analizador. */

@members{
		int contador = -1;
}

entrada returns [String valor]
    :	ec1=ecuacion        
        (                   
        ec2=ecuacion 
        )*
        {
         System.out.println ("(HALT, NULL, NULL, NULL)");
        }
    ;


ecuacion returns [String resultado]
    :     Id '=' exp=expresion ';'   { 	$resultado = "(ASSIGN, "+ $Id.text + ", " + $exp.cadena + ", NULL) ";
										System.out.println($resultado);
                                        }
    ;


/* La suma y la resta tienen la prioridad más baja. */


expresion returns [String resultado, String cadena]
    :    m1=termino              {	$resultado = $m1.cadena; $cadena = $m1.cadena;} 
         ( '+' m2=termino        {	contador ++;  
									if ($cadena.equals("cadena" + (contador-1)))
										$resultado = "(ADD, cadena" + contador + ", " + $cadena + ", " + $m2.cadena + ')';
									else
										$resultado = "(ADD, cadena" + contador + ", " + $m1.cadena + ", " + $m2.cadena + ')'; 
									System.out.println($resultado);
									$cadena = "cadena" + contador;}
         | '-' m2=termino        { 	contador ++; 
									if ($cadena.equals("cadena" + (contador-1)))
										$resultado = "(SUB, cadena" + contador + ", " + $cadena + ", " + $m2.cadena + ')'; 
									else
										$resultado = "(SUB, cadena" + contador + ", " + $m1.cadena + ", " + $m2.cadena + ')'; 
									System.out.println($resultado);
									$cadena = "cadena" + contador;}
         )*
    ;


/* La multiplicación y la división tienen una prioridad más alta. */


termino returns [String salida, String cadena]
    :    a1=factor                { $salida = $a1.cadena; $cadena = $a1.cadena;}
         ( '*' a2=factor          { contador ++; 
									if ($cadena.equals("cadena" + (contador-1)))
										$salida = "(MULT, cadena" + contador + ", " + $cadena + ", " + $a2.cadena + ')';
									else
										$salida = "(MULT, cadena" + contador + ", " + $a1.cadena + ", " + $a2.cadena + ')'; 
									System.out.println($salida);
									$cadena = "cadena" + contador;}
         | '/' a2=factor          { contador ++; 
									if ($cadena.equals("cadena" + (contador-1)))
										$salida = "(DIV, cadena" + contador + ", " + $cadena + ", " + $a2.cadena + ')'; 
									else
										$salida = "(DIV, cadena" + contador + ", " + $a1.cadena + ", " + $a2.cadena + ')'; 
									System.out.println($salida);
									$cadena = "cadena" + contador;}
         )*
    ;

      
factor returns [String valor, String cadena]
    	:	    '(' exp=expresion ')'      {$valor = $exp.cadena; $cadena = $exp.cadena;}
    	|            n=dato                    {$valor = $n.cadena; $cadena = $n.cadena;}
        ;


dato returns [String codigo, String cadena]
   :	(numero=Num			{$codigo = $numero.text;
						 $cadena = $numero.text;}
   	| iden=Id				{$codigo = $iden.text;
						 $cadena = $iden.text;}
   	| '-' numero=Num			{ contador ++; 
						  $codigo = "(NEG, cadena" + contador + ", " + $numero.text + ", NULL) "; 
						  System.out.println($codigo);
						  $cadena = "cadena" + contador;}
   	| '-' iden=Id			{ contador ++; 
						  $codigo = "(NEG, cadena" + contador + ", " + $iden.text + ", NULL) "; 
						  System.out.println($codigo);
						  $cadena = "cadena" + contador;}
   	)
   ;
   
   
/* Un número: puede ser un valor entero o un valor decimal. */


Num
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;


Id 	
    :	('a'..'z' | 'A'..'Z')+
    ;


/* Ignoramos todos los caracteres de espacios en blanco. */

WS
    :   (' ' | '\t' | '\r'| '\n')    { $channel=HIDDEN; }
    ;
