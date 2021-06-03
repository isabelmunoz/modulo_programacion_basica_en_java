package ejercicios18052021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios18052021 {

    public static void main(String[] args) {
        // Determinar el mayor de tres numeros ingresados por el usuario.

          int n1,n2,n3;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("*****Determinar el mayor de tres numeros*****");
        System.out.println("Ingrese primer numero");
        n1=leer.nextInt();
        System.out.println("Ingrese segundo numero");
        n2=leer.nextInt();
        System.out.println("Ingrese tercer numero");
        n3=leer.nextInt();
        if (n1 > n2) {
            System.out.println("El primer numero es mayor");
        } else if (n2>n3) {
            System.out.println("El segundo numero es mayor");
        }
        else if (n3>n1){
            System.out.println("El tercer numero es mayor");
        }
        else{
            System.out.println("Los numeros son iguales");
        }


        //Traspasar ejercicio de Chismefon a java
        double cantMinutos, costo;
        int impuesto;
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese cantidad de minutos que duró la llamada");
        cantMinutos = leer2.nextDouble();
        System.out.println("Ingrese día llamado:");
        System.out.println("1- Turno matutino - día hábil");
        System.out.println("2- Turno vespertino - día hábil");
        System.out.println("3- Domingo");
        impuesto = leer2.nextInt();
        if (cantMinutos <= 5) {
            costo = cantMinutos * 100;
        } else if (cantMinutos > 5 && cantMinutos <= 8) {
            costo = (cantMinutos - 5) * 80 + 500;
        } else if (cantMinutos > 8 && cantMinutos <= 10) {
            costo = (cantMinutos - 8) * 70 + 740;
        } else {
            costo = (cantMinutos - 10) * 50 + 880;
        }

        switch (impuesto) {
            case 1:
                costo=costo+((costo*3)/100);
                break; 
            case 2:
                costo=costo+((costo*15)/100);
                break; 
            default:
                costo=costo+((costo*10)/100);
        }
        System.out.println("La cantidad a pagar según los "+cantMinutos+" minutos ingresados es de: "+costo);
           
      
        
        // Ejercicio tarea 1 con switch - sabor de helado
        Scanner leer3=new Scanner(System.in);
        String sabor;
        System.out.println("Ingrese sabor de helado");
        System.out.println("chocolate");
        System.out.println("piña");
        System.out.println("frutilla");
        System.out.println("coco");
        System.out.println("platano");
        System.out.println("frutos del bosque");
        sabor=leer3.nextLine();
        switch (sabor) {
            case "chocolate":
                 System.out.println("El sabor elegido es chocolate");
                break; 
            case "piña":
                System.out.println("El sabor elegido es piña");
                break; 
                case "frutilla":
                System.out.println("El sabor elegido es frutilla");
                break; 
                case "coco":
                System.out.println("El sabor elegido es coco");
                break; 
                case "platano":
                System.out.println("El sabor elegido es platano");
                break; 
                case "frutos del bosque":
                System.out.println("El sabor elegido es frutos del bosque");
                break; 
            default:
                 System.out.println("El sabor elegido no está disponible por ahora");
        }
      
           
          
        
        // Ejercicio tarea 2 con switch - figura geométrica de n lados
        Scanner leer4=new Scanner(System.in);
        int lados;
        System.out.println("Ingrese número de lados");
        lados=leer4.nextInt();
        switch(lados){
            case 1: System.out.println("Es una línea");
            break;
            case 2: System.out.println("No es figura, son dos lineas quizas");
            break;
            case 3: System.out.println("Es un triángulo");
            break;
            case 4: System.out.println("Es un cuadrado o rectángulo");
            break;
            case 5: System.out.println("Es un pentágono");
            break;
            case 6: System.out.println("Es un hexágono");
            break;
            case 7: System.out.println("Es un heptágono");
            break;
            case 8: System.out.println("Es una Octágono");
            break;
            default:
                System.out.println("Ups !!! Creo que ya no me sé mas figuras XD");
        }
    }

}
