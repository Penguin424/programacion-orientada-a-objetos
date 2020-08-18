
package practica1;

import com.persona.Persona;
import java.util.Scanner;
    
public class Practica1 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Este programa usa de la clase persona");
        System.out.print("Escribe el nombre de una persona: ");
        persona.setNombre(scanner.nextLine());        
        System.out.print("Escribe su edad: ");  
        persona.setEdad(Integer.parseInt(scanner.nextLine()));
 
        System.out.print("Dame su estatura: ");
        persona.setEstatura(Double.parseDouble(scanner.nextLine()));

        System.out.print("Ingresa su numero de telefono: ");
        persona.setTelefono(scanner.nextLine());
        
        System.out.println("\nEstos son los datos que ingresaste: \n"+persona.toString());
    }
    
}
