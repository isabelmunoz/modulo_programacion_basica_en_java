package ejercicios01062021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios01062021 {

    public static void main(String[] args) {

        System.out.println("*****************Contador 1********************");
        Contador contador1 = new Contador();
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Introduce valor para inicializar el contador: ");
        numero = leer.nextInt();

        contador1.setCont(numero);
        contador1.incrementar();
        System.out.println(contador1.getCont());

        contador1.decrementar();
        System.out.println(contador1.getCont());

        System.out.println("*****************Contador 2********************");
        Contador contador2 = new Contador(20);

        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());

        System.out.println("*****************Contador 3********************");

        Contador contador3 = new Contador(1);
        System.out.println(contador3.getCont());
        contador3.decrementar();
        System.out.println(contador3.getCont());
        contador3.decrementar();
        System.out.println(contador3.getCont());

        System.out.println("*****************Contador 4********************");

        Contador contador4 = new Contador(-10);
        System.out.println(contador4.getCont());

    }

}
