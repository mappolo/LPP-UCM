grammar Calculadora;

@members{
	int cnt = -1;	
	int cntL = -1;
}

/* Este será el punto de entrada de nuestra analizador. */


entrada returns [String codigo]
    :	ins1=instruccion        
        (                   
        ins2=instruccion
        )*
		{
			$codigo = "(HALT,NULL,NULL,NULL)";
			System.out.println($codigo); 	
		}
    ;


instruccion returns [String codigo, String cadenaExpresionAuxiliarFinal, String cadenaFactorAuxiliarFinal]
    :     Id '=' exp=expresion ';'	
				{
					if($exp.resultado.length() == 1) 
						$codigo = "(ASSIGN," + $Id.text + "," + $exp.resultado + ",NULL)";
					else
						$codigo = "(ASSIGN," + $Id.text + ",t" + cnt + ",NULL)";

					/*Independiente de else*/						

					System.out.println($codigo);	 
                              	}
	|'if' '(' d1 = dato op = oprelacional d2 = dato ')' 'then' '{' declara = declaracion '}' ';'	
		{		
			$cadenaExpresionAuxiliarFinal = $declara.cadenaExpresionAuxiliarMedio; 
			$cadenaFactorAuxiliarFinal = $declara.cadenaFactorAuxiliarMedio;
	/*Este es el código que tienes que ordenar*/		
			$codigo = "(IF,!(" + $d1.resultado + $op.resultado + $d2.resultado + "),GOTO,L" + cntL + ")" ;
			System.out.println($codigo);
			System.out.println($cadenaFactorAuxiliarFinal);
			System.out.println($cadenaExpresionAuxiliarFinal);
			System.out.println("L" + cntL + ":");	
		}
	|'while' '('  d3 = dato op2 = oprelacional d4 = dato ')' 'do' '{' declara2 = declaracion '}' ';'
		{
			
		}
    ;


declaracion returns [String codigo, String resultado, String cadenaExpresionAuxiliarMedio, String cadenaFactorAuxiliarMedio]
	:
	(Id '=' exp = expresion_seq ';'
	{
		cntL++;

		$cadenaFactorAuxiliarMedio = $exp.cadenaFactorAuxiliar;
		$cadenaExpresionAuxiliarMedio = "(ASSIGN,"+ $Id.text + "," + $exp.resultado + ",NULL) ";
	})*
;


/* La suma y la resta tienen la prioridad más baja. */


expresion returns [String codigo, String resultado]
    :    m1=termino              
				{ 
					$resultado  = $m1.resultado; 
				} 
         ( '+' m2=termino       { 
					cnt++;
					$codigo = "(ADD,t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ")";
					System.out.println($codigo);
					$resultado = "t" + cnt; 
				}
         | '-' m2=termino       { 
					cnt++;
					$codigo = "(SUB,t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ")";
					System.out.println($codigo);
					$resultado = "t" + cnt;
				}
         )* 
    ;

expresion_seq returns [String codigo, String resultado, String cadenaFactorAuxiliar]
    :    m1 = factor             
				{	
					$codigo = $m1.resultado; $resultado = $m1.codigo;
				} 
         ( '+' m2 = factor       
				{	
					cnt ++;  

					if ($resultado.equals("t" + (cnt-1)))
						$codigo = "(ADD,t" + cnt + "," + $resultado + "," + $m2.resultado + ')';
					else
						$codigo = "(ADD,t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ')'; 
				
					$cadenaFactorAuxiliar = $codigo;					
					$resultado = "t" + cnt;
				}
         | '-' m2 = factor        
				{ 	
					cnt ++; 
				
					if ($resultado.equals("t" + (cnt-1)))
						$codigo = "(SUB,t" + cnt + "," + $resultado + "," + $m2.resultado + ')'; 
					else
						$codigo = "(SUB,t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ')'; 
					
					$cadenaFactorAuxiliar = $codigo;
					$resultado = "t" + cnt;
				}
	| '*' m2 = factor          
				{ 
					cnt ++;
					 
					if ($resultado.equals("t" + (cnt-1)))
						$codigo = "(MULT,t" + cnt + "," + $resultado + "," + $m2.resultado + ')';
					else
						$codigo = "(MULT,t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ')'; 
					
					$cadenaFactorAuxiliar = $codigo;
					$resultado = "t" + cnt;
				}
         | '/' m2=factor        { 
					cnt ++; 

					if ($resultado.equals("t" + (cnt-1)))
						$codigo = "(DIV,t" + cnt + "," + $resultado + "," + $m2.resultado + ')';
					else
						$codigo = "(DIV,t" + cnt + "," + $m1.resultado + "," + $m2.resultado + ')';

					$cadenaFactorAuxiliar = $codigo;					
					$resultado = "t" + cnt;
				}
         )*
    ;

/* La multiplicación y la división tienen una prioridad más alta. */


termino returns [String codigo, String resultado]
    :    a1=factor                  
				{ 
					$resultado  = $a1.resultado; 
				}
         ( '*' a2 = factor            
				{ 
					cnt++;					
					$codigo = "(MULT,t" + cnt + "," + $a1.resultado + "," + $a2.resultado + ")";
					System.out.println($codigo);
					$resultado = "t" + cnt;
				}
         | '/' a2 = factor            
				{ 
					cnt++;					
					$codigo = "(DIV,t" + cnt + "," + $a1.resultado + "," + $a2.resultado + ")";
					System.out.println($codigo);
					$resultado = "t" + cnt; 
				}
         )* 
    ;

      
factor returns [String codigo, String resultado]
    	:	    '(' exp=expresion ')'      
				{ 
					$codigo = $exp.codigo;
					$resultado = $exp.resultado; 
				}
    	|            n=dato                    
				{ 
					$codigo = $n.codigo; 
					$resultado = $n.resultado;
				}
        ;


dato returns [String codigo, String resultado]
   :	Number			{
					$codigo = $Number.text;
					$resultado = $Number.text;
				}
	|Id
				{
					$codigo = $Id.text;
					$resultado = $Id.text;
				}
	|'-'Number
				{
					cnt++;
					$codigo = "(NEG,t" + cnt + ',' + $Number.text + ",NULL)";
					System.out.println($codigo);
					$resultado = "t" + cnt; 
				}
	|'-'Id		
				{
					cnt++;
					$codigo = "(NEG,t" + cnt + ',' + $Id.text + ",NULL)";
					System.out.println($codigo);
					$resultado = "t" + cnt;				
				}
   ;
  
oprelacional returns [String codigo, String resultado]
	:	operador = OpRel
					{
						$codigo = $operador.text;
						$resultado = $operador.text;
					}
; 
   
/* Un número: puede ser un valor entero o un valor decimal. */


Number
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
