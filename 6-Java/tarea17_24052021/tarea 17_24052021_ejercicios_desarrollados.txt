package ejercicios24052021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios24052021 {

    public static void main(String[] args) {
        /*
        Realizar un programa que pida ingresar la fecha de nacimiento(día-mes-año)y calcule su numero de la suerte.
        El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando 
        las cifras on¿btenidas de la suma.
        Si la fecha de naciemiento es 12/07/1980,calculamos el numero de la suerte así:12+7+1980=  1+9+9+8=28
        numero de la suerte :28.
         */

        Scanner leer = new Scanner(System.in);
        int dia, mes, anio, d, total = 0, sum = 0;
        System.out.println("Ingrese día");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        anio = leer.nextInt();
        sum = dia + mes + anio;
        d = Integer.toString(sum).length();
        if (d == 4) {
            for (int i = 0; i < d; i++) {
                String num = String.valueOf(Integer.toString(sum).charAt(i));
                total += Integer.parseInt(num);
            }

        }
        System.out.println("El numero de la suerte es: " + total);

        /*
        Realizar un programa que lea por teclado tres números entros H,M,S correspondientes a hora,minutos y segundos 
        respectivamente,y comprueba si la hora que indican es una hora válida.Supondremos que leemos una hora en modo
        24 horas, es decir,el valor válido para las horas será mayor o igual que cero y menor que 24.
        El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos.
         */
       int H, M, S;
        Scanner leer2 = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H = leer2.nextInt();
        System.out.print("Introduzca minutos: ");
        M = leer2.nextInt();
        System.out.print("Introduzca segundos: ");
        S = leer2.nextInt();
        if (H >= 0 && H < 24 && M >= 0 && M < 60 && S >= 0 && S < 60) {
            System.out.println("Hora correcta");
            System.out.println("La hora ingresada es: "+H+":"+M+":"+S);
            
        } else {
            System.out.println("Hora incorrecta");
        }
        /*
        Hacer un programa que simule una calculadora donde el usuario pueda 
        seleccionar entre las 4 operaciones básicas(suma-resta-multiplicación-división)
        y que además permita volver a seleccionar una nueva operación.
        */
        
        Scanner leer3 = new Scanner(System.in);
        int operacion,n1,n2,resultado;
        System.out.println("Elija la operación a realizar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        operacion=leer3.nextInt();
        
        System.out.println("Escriba el primer número");
        n1=leer3.nextInt();
        System.out.println("Escriba el segundo número");
        n2=leer3.nextInt();
                
        switch(operacion){
            case 1: 
                resultado=n1+n2;
                System.out.println("El resultado es "+resultado);
                break;
                case 2: 
                resultado=n1-n2;
                System.out.println("El resultado es "+resultado);
                break;
                case 3: 
                resultado=n1*n2;
                System.out.println("El resultado es "+resultado);
                break;
                case 4: 
                resultado=n1/n2;
                System.out.println("El resultado es "+resultado);
                break;
        }     
    }

}
