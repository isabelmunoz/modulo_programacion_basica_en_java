package ejercicios19052021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios19052021 {

    public static void main(String[] args) {
        // Paqueteria Internacional
        Scanner leer = new Scanner(System.in);
        double peso, costo;
        costo = 0;
        peso = 0;
        int zona;
        System.out.println("Ingresa el peso del paquete en kilos");
        peso = leer.nextDouble();
        if (peso > 5) {
            System.out.println("El paquete no se puede transportar");
        } else {
            System.out.println("Ingresa la zona a donde va dirigido");
            System.out.println("1 = America del Norte");
            System.out.println("2 = America Central");
            System.out.println("3 = America del sur");
            System.out.println("4 = Europa");
            System.out.println("5 = Asia");
            zona = leer.nextInt();
            if (zona >= 1 && zona <= 5) {
                if (zona == 1) {
                    costo = (peso * 1000) * 110;
                    System.out.println("Ha seleccionado la opción 1 = America del Norte");
                }
                if (zona == 2) {
                    costo = (peso * 1000) * 100;
                    System.out.println("Ha seleccionado la opción 2 = America Central");
                }
                if (zona == 3) {
                    costo = (peso * 1000) * 120;
                    System.out.println("Ha seleccionado la opción 3 = America del sur");
                }
                if (zona == 4) {
                    costo = (peso * 1000) * 240;
                    System.out.println("Ha seleccionado la opción 4 = Europa");
                }
                if (zona == 5) {
                    costo = (peso * 1000) * 270;
                    System.out.println("Ha seleccionado la opción 5 = Asia");
                }
            }
            if (zona > 5) {
                System.out.println("La opción seleccionada no es válida");
            }
        }
        System.out.println("El cobro por el envio del paquete es: $" + costo);
        System.out.println("El paquete tiene un peso de: " + peso + " kilos");
       
        
        //crear un programa que muestre por pantalla los numeros del 1 al 100 y los numeros del 100 a 1
        System.out.println("Escribir numeros del 1 al 100");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("Escribir numeros del 100 al 1");
        for (int j = 100; j >= 1; j--) {
            System.out.println(j);
        }
     
        //crear un programa que muestre por pantalla los numeros pares que se encuentran entre el 1 y el numero
        //que decida el usuario
        int cantNum,sumPar=0;
        Scanner leer2=new Scanner(System.in);
        System.out.println("Introduzca número: ");
        cantNum=leer2.nextInt();
        for (int i = 0; i <cantNum; i++) {
            if (i%2==0) {
                sumPar+=i;
            }
        }
        System.out.println("La suma de los numeros pares desde 1 hasta el numero ingresado es: "+sumPar);
     
    
        //crear un programa que muestre por pantalla los numeros que sean múltiplos de un determinado número
        //(dado por el usuario) que se ecuentran entre el 1 y 100.
        int numIngresar,contador=1;
        Scanner leer3=new Scanner(System.in);
        System.out.println("Introduzca número para entregar sus múltiplos hasta 100: ");
        System.out.println("----------------------------------------------");
        numIngresar=leer3.nextInt();
        for (int i = 1; i <=100; i++) {
            if (i%numIngresar==0) {
                System.out.println(i);
            }
        }
        
        
    }
}
