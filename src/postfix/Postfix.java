/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz 
 */

package postfix;
import java.util.Scanner;


public class Postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner entrada_datos  = new Scanner(System.in);
//<<<<<<< HEAD        
//=======
        System.out.println("Ingrese expresión en postfix:");
//>>>>>>> origin/master
        String entrada = entrada_datos.nextLine();
        TPostfix calc = new TPostfix(entrada);
        double res = calc.eval(100);
        System.out.println("Resultado: " + res);
    }    
}
