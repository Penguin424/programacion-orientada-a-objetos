package practica3;

import com.figuras.Cuadrado;
import com.figuras.Circulo;
import com.figuras.Rectangulo;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Rectangulo rectangulo;
        Cuadrado cuadrado;
        Circulo circulo;
        
        String nombre;
        int b, a, r, l, respuesta;
        
        System.out.println("Este programa calcula el area y el perimetro de un cuadrado, rectangulo y un circulo" );
        
        do{
            System.out.println("Menu de opciones");
            System.out.println("\n1. Rectangulo\n2. Cuadrado\n3. Circulo\n4. Terminar\n\n");
            System.out.print("Selecciona una opcion: ");
            respuesta = Integer.parseInt(scanner.nextLine());
        
            switch(respuesta){
                case 1:
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la base del rectangulo: ");
                    b = Integer.parseInt(scanner.nextLine());
                    
                    System.out.print("Ingrese la altura del rectangulo: ");
                    a = Integer.parseInt(scanner.nextLine());
                    
                    rectangulo = new Rectangulo(nombre, b, a);
                    System.out.println("\nEl area del "+nombre+" es "+rectangulo.calcularArea());
                    System.out.println("El perimetro del "+nombre+" es "+rectangulo.calcularPerimetro() + "\n");
                    break;                 
                case 2:
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese uno de los lados del cuadrado: ");
                    l = Integer.parseInt(scanner.nextLine());
                     
                    cuadrado = new Cuadrado(nombre, l);
                    System.out.println("\nEl area del "+nombre+" es "+cuadrado.calcularArea());
                    System.out.println("El perimetro del "+nombre+" es "+cuadrado.calcularPerimetro() + "\n");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la figura: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el radio del circulo: ");
                    r = Integer.parseInt(scanner.nextLine());
                    
                    circulo = new Circulo(nombre, r);
                    System.out.println("\nEl area del "+nombre+" es "+circulo.calcularArea());
                    System.out.println("El perimetro "+nombre+" 1es "+circulo.calcularPerimetro() + "\n");
                    break;
                case 4:
                    System.out.println("Fin del programa ");
                    break;
                default:
                 System.out.println("Opcion invalida. intenta de nuevo");
                }
        } while(respuesta != 4);
    }
}
