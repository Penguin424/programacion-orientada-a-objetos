package practica4;

import com.operaciones.Multiplicacion;
import com.operaciones.Suma;
import com.operaciones.Division;
import com.operaciones.Resta;
import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Suma sum;
        Resta res;
        Multiplicacion mul;
        Division div;
        Scanner scanner = new Scanner(System.in);
        char respuesta;
        double numero1 = 0.0;
        double numero2 = 0.0;
        
        System.out.println("Este programa realiza las operaciones arimeticas simples");
        do{
            System.out.println("Para resolver una suma digite(S) resta digite(R) multiplicacion digite(M) y division digite(D) Para terminat(T)");
            System.out.print("Ingrese la opcion deseada: ");
            respuesta = scanner.next().charAt(0);
            scanner.nextLine();
            switch(respuesta){
                case 'S':
                case 's':
                    System.out.println("Operación Suma");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = Double.parseDouble(scanner.nextLine());
                    
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = Double.parseDouble(scanner.nextLine());
                    
                    sum = new Suma(numero1, numero2);
                    System.out.println(sum.mostrarResultado());
                    break;
                case 'R':
                case 'r':
                    System.out.println("Operación Resta");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = Double.parseDouble(scanner.nextLine());
                    
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = Double.parseDouble(scanner.nextLine());
                    
                    res = new Resta(numero1, numero2);
                    System.out.println(res.mostrarResultado());
                    break;
                case 'M':
                case 'm':
                    System.out.println("Operación Multiplicación");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = Double.parseDouble(scanner.nextLine());
                    
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = Double.parseDouble(scanner.nextLine());
                    
                    mul = new Multiplicacion(numero1, numero2);
                    System.out.println(mul.mostrarResultado());
                    break;
                case 'D':
                case 'd':
                    System.out.println("Operación División");
                    System.out.print("Ingrese el primer numero: ");
                    numero1 = Double.parseDouble(scanner.nextLine());
                    
                    System.out.print("Ingrese el segundo numero: ");
                    numero2 = Double.parseDouble(scanner.nextLine());
                    
                    div = new Division(numero1, numero2);
                    System.out.println(div.mostrarResultado());
                    break;
                case 'T':
                case 't':
                    System.out.println("El programa ha terminado");
                    break;
                default:
                    System.out.println("Opcion invalida. intenta de nuevo");
                }
        } while(respuesta != 'T' && respuesta != 't');
    }
    
}
