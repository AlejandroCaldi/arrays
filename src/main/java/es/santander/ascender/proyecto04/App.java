package es.santander.ascender.proyecto04;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Ejercicio de Manipulación de Arrays");
        Arrays arra = new Arrays();

        int[] arrayOriginal = arra.generarArrayIncremental(99, true);
        int[] arrayRevertido = arra.revertirArrayIncremental(arrayOriginal, true);

        System.out.println(arrayRevertido);

        System.out.println("Fin del Ejercicio de Manipulación de Arrays");
    }
}
