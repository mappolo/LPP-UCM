import org.antlr.runtime.*;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nPlease, introduce la entrada:\n");
        
        String expresion;
        
        Scanner entradaConsole = new Scanner (System.in);
        
        expresion = entradaConsole.nextLine ();

        ANTLRStringStream entrada = new ANTLRStringStream(expresion);
        
        CalculadoraLexer analizador_lexico = new CalculadoraLexer(entrada);
        
        CommonTokenStream tokens = new CommonTokenStream(analizador_lexico);
        
        CalculadoraParser analizador_sintactico = new CalculadoraParser(tokens);
        
        System.out.println("\nResultados:\n");
        
        analizador_sintactico.entrada();
        
        System.out.println("\n");
        
    }
    
}
