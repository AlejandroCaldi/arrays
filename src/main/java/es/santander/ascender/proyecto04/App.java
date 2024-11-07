package es.santander.ascender.proyecto04;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Ejercicio de Manipulación de Arrays");
        Arrays arra = new Arrays();
        
        Scanner scanner = new Scanner(System.in);

        // Reading a String input
        System.out.print("Ingrese el largo del array original: ");
        int largoArray = scanner.nextInt();
        scanner.close();

        int[] arrayOriginal = arra.generarArrayIncremental(largoArray-1, true);
        int[] arrayRevertido = arra.revertirArrayIncremental(arrayOriginal, true);

        System.out.println("Fin del Ejercicio de Manipulación de Arrays");
    }
}
