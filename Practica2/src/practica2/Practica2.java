
package practica2;

import com.cuenta.Cuenta;
import  java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta;
        String nombre, tipo;
        double cantidad;
        int opcion;

          System.out.println("Este programa simula una cuenta bancaria con datos basicos");
          System.out.print("Escribe el nombre del cliente: ");
          nombre = scanner.nextLine();
          System.out.print("Indica el tipo de cuenta: (ahorros / nomina) ");
          tipo = scanner.nextLine();
          System.out.print("ingresa la cantidad del deposito inicial: ");
          cantidad = Double.parseDouble(scanner.nextLine());
          cuenta = new Cuenta(nombre, tipo, cantidad);

          do
          {
                System.out.println("Menu de opciones");
                System.out.println("1 Depositar");
                System.out.println("2 Retirar");
                System.out.println("3 Consultar saldo");
                System.out.println("4 Terminar");
                System.out.print("Seleccione una opcion: ");
                opcion = Integer.parseInt(scanner.nextLine());
           
                switch(opcion){
                    case 1:
                        System.out.print("Ingresa l cantidad que vas a depositar: ");
                        cantidad =  Double.parseDouble(scanner.nextLine());
                        cuenta.depositar(cantidad);
                        System.out.println("Deposito efectuado con exito");
                        break;
                    case 2:
                        System.out.println("Ingresa la cantidad que vas a retirar: ");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        if(cuenta.retirar(cantidad) == 1){
                            System.out.println("Retiro efectuado corectamente");
                         } else {
                             System.out.println("No tienes saldo suficiente");
                         }   
                        break;
                    case 3:
                        System.out.println("Este es tu saldo actual: \n"+cuenta.toString());
                        break;
                    case 4:
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opcion invalida, intenta de nuevo");
                 }

            } while(opcion !=4);
    }

}