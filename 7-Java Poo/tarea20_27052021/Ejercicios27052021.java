package ejercicios26052021;

/**
 *
 * @author Isabel
 */
public class Ejercicios26052021 {

    public static void main(String[] args) {
        // 

//        Persona p1=new Persona();
//        p1.nombre="Isabel";
//        Persona p2=new Persona();
//        p2.nombre="Carlos";
//        p1.saludar();
//        p1.sumar(5, 6);
//        System.out.println("El resultado de la multiplicacion es :"+p2.multiplicar());
//        System.out.println("El nombre es "+p1.mostrarNombre("Isabel"));
//        String nombre;
//        nombre=p1.mostrarNombre("Isabel");
//        System.out.println("El nombre es "+nombre);
        // Crear tres clases con sus respectivos atributos,métodos y crear distintas instancias.
        Alumno alumno1 = new Alumno();
        Profesor profesor = new Profesor();
        Apoderado apoderado = new Apoderado();
        System.out.println("Esta es una historia de un alumno que dependerá de sus notas el final feliz o triste...");
        System.out.println("El papá feliz le dice a su hijo:");
        apoderado.alentar();
        System.out.println("El alumno se va a la escuela y al llegar el profesor saluda:");
        alumno1.saludar();
        System.out.println("El profesor contesta: ");
        profesor.saludar();
        System.out.println("AL final de año se promedian las notas y se sabe si pasa o no de curso...");
        float notas = alumno1.obtenerNota();
        System.out.println("Profesor comienza a evaluar segun promedio obtenido... y dice:");
        System.out.println("El promedio de notas que sacó el alumno es: " + notas);
        profesor.evaluar(notas);
        System.out.println("El apoderado reacciona...");
        apoderado.reaccionar(notas);
        
    }
}
