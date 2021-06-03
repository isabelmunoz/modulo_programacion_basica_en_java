package tresejercicios_if_else;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class TresEjercicios_If_Else {

    public static void main(String[] args) {
        
        // Descuento en Motos, Honda 5%,Yamaha 8%, Suzuki 10%,otra marca 2%
        String marca;
        double precio, des, pago;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la marca de la moto ;");
        marca = dato.next();
        if ("Honda".equals(marca)) {
            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.05;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);
        } else if ("Yamaha".equals(marca)) {
            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.08;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);
        } else if ("Suzuki".equals(marca)) {
            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.1;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);
        } else {

            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.02;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);

        }
        
        //Ingresar dos numeros, si el resultado al sumarlos es menor a 10, se muestra la suma por pantalla, si es
        //mayor a 10 se muestra la potencia del primer numero por el segundo
        int n1, n2, n3, n4;
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1 = dato2.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = dato2.nextInt();
        n3 = n1 + n2;
        if (n3 <= 10) {
            System.out.println("La suma de los numeros es : " + n3);
        } else {
            n4 = (int) Math.pow(n1, n2);
            System.out.println("La potencia de los numeros es : " + n4);
        }
         
        //suma de digitos de un numero de dos o mas cifras
        Scanner leer4 = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = leer4.nextInt();
        int d = Integer.toString(n).length();
        int t = 0;
        if (d >= 2) {
            for (int i = 0; i < d; i++) {
                String num = String.valueOf(Integer.toString(n).charAt(i));
                t += Integer.parseInt(num);
                
            }
            System.out.println("El resultado es: " + t);
        } else {
            System.out.println("Ingrese un número con más dígitos");
        }
       package tresejercicios_if_else;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class TresEjercicios_If_Else {

    public static void main(String[] args) {
        
        // Descuento en Motos, Honda 5%,Yamaha 8%, Suzuki 10%,otra marca 2%
        String marca;
        double precio, des, pago;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la marca de la moto ;");
        marca = dato.next();
        if ("Honda".equals(marca)) {
            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.05;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);
        } else if ("Yamaha".equals(marca)) {
            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.08;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);
        } else if ("Suzuki".equals(marca)) {
            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.1;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);
        } else {

            System.out.println("Ingrese el precio de la moto ;");
            precio = dato.nextDouble();
            des = precio * 0.02;
            System.out.println("Su descuento es de ; " + des);
            pago = precio - des;
            System.out.println("El pago total de la moto es ");
            System.out.println(pago);

        }
        
        //Ingresar dos numeros, si el resultado al sumarlos es menor a 10, se muestra la suma por pantalla, si es
        //mayor a 10 se muestra la potencia del primer numero por el segundo
        int n1, n2, n3, n4;
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n1 = dato2.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = dato2.nextInt();
        n3 = n1 + n2;
        if (n3 <= 10) {
            System.out.println("La suma de los numeros es : " + n3);
        } else {
            n4 = (int) Math.pow(n1, n2);
            System.out.println("La potencia de los numeros es : " + n4);
        }
         
        //suma de digitos de un numero de dos o mas cifras
        Scanner leer4 = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = leer4.nextInt();
        int d = Integer.toString(n).length();
        int t = 0;
        if (d >= 2) {
            for (int i = 0; i < d; i++) {
                String num = String.valueOf(Integer.toString(n).charAt(i));
                t += Integer.parseInt(num);
                
            }
            System.out.println("El resultado es: " + t);
        } else {
            System.out.println("Ingrese un número con más dígitos");
        }
        
    }

}
}
 
    }

}
}
