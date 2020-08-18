package claseabstacta;

import com.profesiones.Doctor;
import com.profesiones.Empleado;
import com.profesiones.Ingeniero;
import java.util.Scanner;

public class ClaseAbstacta {

    public static void main(String[] args) {
      Scanner entrada  = new Scanner(System.in);
      Doctor persona1;
      Ingeniero persona2;
      Empleado persona3;
      String var1, var2, var3;
      int entero1, respuesta;
      
      System.out.println("Este programa hace uuso de una clase abstracta llamada persona");
      
      do{
         System.out.println("Menu de profesiones");
         System.out.println("\n1. Doctor\n2. Ingeniero\n3. Empleado\n4. Terminar\n\n");
         System.out.print("Selecciona una opcion: ");
         respuesta = entrada.nextInt();
         entrada.nextLine();
         switch(respuesta){
             case 1:
                 System.out.print("Escribe el nombre del doctor: ");
                 var1 = entrada.nextLine();
                 System.out.print("Su edad: ");
                 entero1 = Integer.parseInt(entrada.nextLine());
                 
                 System.out.print("Su genero: ");
                 var2 = entrada.nextLine();
                 System.out.print("Especialidad que estudio: ");
                 var3 = entrada.nextLine();
                 persona1 = new Doctor(var1, entero1, var2, var3);
                 System.out.println("Asi trabaja el doctor : \n"+persona1.trabaja());
                 break;
            case 2:
                 System.out.print("Escribe el nombre del ingeniero: ");
                 var1 = entrada.nextLine();
                 System.out.print("Su edad: ");
                 entero1 = Integer.parseInt(entrada.nextLine());
                 
                 System.out.print("Su genero: ");
                 var2 = entrada.nextLine();
                 System.out.print("Ingenieria que estudio: ");
                 var3 = entrada.nextLine();
                 persona2 = new Ingeniero(var1, entero1, var2, var3);
                 System.out.println("Asi trabaja el Ingeniero : \n"+persona2.trabaja());
                 break;
            case 3:
                System.out.print("Escribe el nombre del empledo: ");
                 var1 = entrada.nextLine();
                 System.out.print("Su edad: ");
                 entero1 = Integer.parseInt(entrada.nextLine());
                 
                 System.out.print("Su genero: ");
                 var2 = entrada.nextLine();
                 System.out.print("Oficio actual: ");
                 var3 = entrada.nextLine();
                 persona3 = new Empleado(var1, entero1, var2, var3);
                 System.out.println("Asi trabaja un empleado : \n"+persona3.trabaja());
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
