/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //hola mundo
        System.out.println("hola mundo");
        System.out.println("¿Cómo estás?");
        System.out.println("Yo completando mis tareas");
        
        
        //creación de variables
        byte num1=127;
        short num2=12345;
        int num3=123665;
        long num4=168468;
        float num5=98.64f;
        double num6= 2.6565;
        
        
        //realizar operaciones
        int suma,resta, multiplica;
        double divide;
        
        suma=num1+num2;
        System.out.println("El resultado de la suma de  num1 y num2 es: "+suma);
        resta=num2-num1;
        System.out.println("El resultado de la resta de  num2 menos num1 es: "+resta);
        multiplica=num3*num2;
        System.out.println("El resultado de la multiplicación de  num3 por num2 es: "+multiplica);
        divide= num3/num1;
        System.out.println("El resultado de la división de num3 por num1 es: "+divide);
        
        
        
        // calcular el promedio de 4 notas
        double nota1=4.5;
        double nota2=7.0;
        double nota3=6.5;
        double nota4=5.8;
        double promedio= (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("El promedio de las cuatro notas es: "+promedio);
        
        
        //clase scanner
        Scanner leer= new Scanner(System.in);
        int numero;
        double numero2;
        double sumar;
        System.out.println("Ingrese el primer número");
        numero=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2=leer.nextDouble();
        sumar=numero+numero2;
        System.out.println("La suma de los valores ingresados es: "+sumar);
     
        //Promedio con Scanner
       Scanner leer2= new Scanner(System.in);
        double valor1,valor2,valor3,valor4,promediar;
        System.out.println("Ingrese la primera nota");
        valor1=leer2.nextDouble();
        System.out.println("Ingrese la segunda nota");
        valor2=leer2.nextDouble();
        System.out.println("Ingrese la tercera nota");
        valor3=leer2.nextDouble();
        System.out.println("Ingrese la curta nota");
        valor4=leer2.nextDouble();
        promediar= (valor1+valor2+valor3+valor4)/4;
        System.out.println("El promedio de las notas ingresadas es: "+promediar);
        

       //Intercambio de variables
        Scanner leer3= new Scanner(System.in);
        int a,b,c;
        System.out.println("Ingrese el valor para la variable a");
        a=leer3.nextInt();
        System.out.println("Ingrese el valor para la variable b2");
        b=leer3.nextInt();
        System.out.println("intercambiando el valor de las variables...");
        System.out.println(".....................");
        c=a;
        a=b;
        b=c;
        System.out.println("El valor de las variables a es: "+a);
        System.out.println("El valor de las variables b es: "+b);
    }
    
}