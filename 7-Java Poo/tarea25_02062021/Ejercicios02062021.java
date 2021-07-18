package ejercicios02062021;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class Ejercicios02062021 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int d, m, a;

        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = leer.nextInt();
        System.out.print("mes: ");
        m = leer.nextInt();
        System.out.print("año: ");
        a = leer.nextInt();

        Fecha fecha = new Fecha(d, m, a);

        if (fecha.fechaCorrecta()) {

            System.out.println("Fecha introducida: " + fecha);
            System.out.println("Los 5 días siguientes son:");
            for (int i = 1; i <= 5; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }

        } else {
            System.out.println("Fecha no valida");
        }

    }

}
