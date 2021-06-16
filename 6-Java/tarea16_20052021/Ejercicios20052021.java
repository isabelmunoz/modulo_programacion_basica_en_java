package ejercicios20052021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios20052021 {

    public static void main(String[] args) {
         
        //crear un programa que muestre por pantalla los numeros que sean múltiplos de un determinado número
        //(dado por el usuario) que se ecuentran entre el 1 y 100.
        int numIngresar,contador=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca número para entregar sus múltiplos hasta 100: ");
        System.out.println("----------------------------------------------");
        numIngresar=leer.nextInt();
        for (int i = 1; i <=100; i++) {
            if (i%numIngresar==0) {
                System.out.println(i);
            }
        }
      
      
        //utilizando los ciclos iterativos, crear un programa que calcule el promedio de N notas ingresadas por el usuario
        Scanner leer2=new Scanner(System.in);
        int notas=0;
        double promedio=0,valorNota,suma=0;
        System.out.println("Ingrese la cantidad de notas a promediar");
        notas=leer2.nextInt();
        for (int i = 1; i <= notas; i++) {
            System.out.println("Ingrese nota "+i);
            valorNota=leer2.nextDouble();
            suma=suma+valorNota;
        }
        promedio=suma/notas;
        System.out.println("El promedio de las notas ingresadas es :"+promedio);
        
         
        //Crear un programa que´permita ingresar N números por teclado y que calcule la suma de los números pares ingresados
        //y la muliplicación de los números impares y que además le diga al usuario si se ingresaron mas números pares o impares
        Scanner leer3 = new Scanner(System.in);
        int numCantidad, par=0, impar=1, cont = 1,contPar=0,contImPar=0,valor;
        String mayor="";
        System.out.println("Ingrese cantidad de números a ingresar ");
        numCantidad = leer3.nextInt();
        while (cont <= numCantidad) {
            System.out.println("Ingrese valor:");
            valor=leer3.nextInt();
            if (valor % 2 == 0) {
                par = par + valor;
                contPar++;
            } else {
                impar= impar*valor;
                contImPar++;
            }
            cont++;
            if (contPar<contImPar) {
                mayor="más números Impares";
            }else if(contPar==contImPar){
                mayor="la misma cantidad de Pares e Impares";
            }else{
                mayor="más números Pares";
            }
        }
        System.out.println("El valor total de números pares sumados es :" +par);
        System.out.println("El valor total de números impares multiplicados es :" + impar);
        System.out.println("Se ingresaron "+ mayor);

        //crear un programa que permita el mayor de N números ingresados por el usuario
        int numm,valorr,mayoor=0;
        Scanner leer4 = new Scanner(System.in);
        System.out.println("Escriba la cantidad de números a ingresar");
        numm=leer4.nextInt();
        for (int i = 0; i < numm; i++) {
            System.out.println("Ingrese número");
            valorr=leer4.nextInt();
            if (valorr>mayoor) {
                mayoor=valorr;
            }
        }
        System.out.println("De los números ingresados el "+mayor+" es el mayor");
 
       
        //Realizar un programa que lea una serie de números por teclado hasta que se lea un número negativo.
        //El programa indicará cuantos números acabados en 2 se han leído.
        int nu,contadoor=0;
        Scanner leer5 = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        nu = leer5.nextInt();
        while(nu>=0){
              if(nu%10==2){      //Si el número acaba en dos, se cuenta
                 contadoor++;                
              }
              System.out.print("Introduce un número entero: ");
              nu = leer5.nextInt();
        }
        System.out.println("Se han introducido " + contadoor + " números acabados en 2");  
  
        
        //Realizar un programa que pida por teclado un número y muestra si es perfecto o no 6,28,496,8128,33550336,8589869056
        int ii, sumaa = 0, numero;
        Scanner leer6 = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = leer6.nextInt();
        for (ii = 1; ii < numero; ii++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (numero % ii == 0) {
                sumaa = sumaa + ii;   // si es divisor se suma
            }
        }
        if (sumaa == numero) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("El número ingresado es Perfecto");
        } else {
            System.out.println("El número ingresado es No es perfecto");

        }
     
        //Los números amigos son dos números enteros positivos «a» y «b» tales que la suma de los divisores 
        //(aquellos valores que dividen el número en partes exactas) propios de uno es igual al otro número y viceversa. 
        //El ejemplo más conocido es el de 220 y 284.
        int j,sumar=0, n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();
  
        for(j = 1;j < n1;j++){  // for para sumar todos los divisores propios de n1                                   
             if(n1%j==0){
                sumar=sumar+j;
             }
        }
  
        // si la suma de los divisores de n1 es igual a n2
        if(sumar==n2){
           sumar=0;
           for(j = 1;j < n2;j++){  // sumo los divisores propios de n2                                                
                if(n2%j==0){
                   sumar=sumar+j;
                }
            }
           //si la suma de los divisores de n2 es igual a n1
           if(sumar==n1){
              System.out.println("Son Amigos");
           }else{
              System.out.println("No son amigos");
           }
        }        
        else{
             System.out.println("No son amigos");
        }
    }
}
