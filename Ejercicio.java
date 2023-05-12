
package ejercicio;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        
        try {
            System.out.println("Escriba un entero ");
            Scanner s = new Scanner(System.in);
            
            int cant = s.nextInt();
 
        } catch (InputMismatchException e) {
            
            System.err.println("Error no es entero");
            System.out.println(e.getMessage());
            
        }
        
        catch   (Exception e){
            System.err.println("Otra cosa mogolico");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
       
    }
    
}
