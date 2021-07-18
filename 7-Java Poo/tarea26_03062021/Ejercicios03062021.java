package ejercicios03062021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios03062021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

   
        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setSaldo(importe);

   
        Cuenta cuenta2 = new Cuenta("Carlos González", "00012354", 300000);


        //mostrar datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

       
        cuenta1.deposito(100000);
        System.out.println("Saldo: " + cuenta1.getSaldo());

        //mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

     

        //realizar una transferencia 
        cuenta1.transferencia(cuenta2, 10000);

        //mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar el saldo de cuenta1
        System.out.println("Saldo de la cuenta 1");
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();
    }

}
