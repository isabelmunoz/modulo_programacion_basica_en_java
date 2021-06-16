package ejercicios25052021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios25052021 {

    public static void main(String[] args) {
        // 
        //Algoritmo de un cajero bancario que permite ver el saldo, realizar abonos o deposito y realizar giros.
        Scanner leer = new Scanner(System.in);

        int clave,saldo,depos=0, giro, oper, confirmacion = 1;

        System.out.println("Bienvenido");
        System.out.println("Ingrese su clave");
        clave = leer.nextInt();

        if (clave != 1234) {
            System.out.println("Su clave es incorrecta, por favor ingrese clave correctamente");

        } else {
            System.out.println("Por favor indique su saldo inicial");
            saldo = leer.nextInt();

            while (confirmacion == 1) {
                System.out.println("Su saldo es: " + saldo);
                System.out.println("Ingrese operacion a realizar");
                System.out.println("1-Deposito 2-Giro");
                oper = leer.nextInt();

                switch (oper) {

                    case 1:
                        System.out.println("Su saldo actual es: " + saldo);
                        System.out.println("Ingrese cantidad a depositar");
                        depos = leer.nextInt();
                        saldo = saldo + depos;
                        break;

                    case 2:
                        System.out.println("Su saldo actual es: " + saldo);
                        System.out.println("Ingrese cantidad a girar");
                        giro = leer.nextInt();

                        if (saldo == 0) {
                            System.out.println("Saldo de  cuenta insuficiente " + saldo + " , por favor elija otra operación");

                        } else if (giro > saldo) {
                            System.out.println("No puede realizar un giro mayor al saldo de su cuenta, vuelva a intentarlo");

                        } else if (giro <= saldo) {
                            saldo = saldo - giro;

                        } else {
                            System.out.println("Operación invalida");

                        }
                        break;

                    default:
                        System.out.println("Operación invalida");
                        break;

                }

                System.out.println("Su saldo es: " + saldo);
                System.out.println("¿Desea realizar otra operación?");
                System.out.println("1-Si 2-No(O cualquier tecla)");
                confirmacion = leer.nextInt();

            }

            System.out.println("Gracias por operar con nosotros, hasta luego!");
        }
        //------------------------------------------------------------------------------------------------------------
        //Prueba de ingreso de datos a un Arreglo (Array)

        Scanner leer2 = new Scanner(System.in);

        int aux, suma = 0;

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese valor");
            numeros[i] = leer2.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            aux = i + 1;
            System.out.println("El valor ingresado de " + aux + " es: " + numeros[i]);
            suma = suma + numeros[i];

        }
        System.out.println("La suma de sus números es :" + suma);
        //-----------------------------------------------------------------------------------------------------------------
        //ordenamiento

        Scanner leer3 = new Scanner(System.in);

        int[] numeros2 = new int[5];

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Ingrese sus datos numericos mayores a 0");
            numeros2[i] = leer.nextInt();

        }

        int menor = numeros2[0];

        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] < menor) {
                menor = numeros2[i];
            }

        }

        System.out.println("El menor número ingresado es: " + menor);

    }
}
