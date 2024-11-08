package es.santander.ascender.proyecto04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Ejercicio de Manipulación de Arrays");
        Arreglos arra = new Arreglos();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo del array original: ");
        int largoArray = scanner.nextInt();
        scanner.close();

        int[] arrayOriginal = arra.generarArrayIncremental(largoArray-1, true);
        arra.revertirArrayIncremental(arrayOriginal, true);

        System.out.println("Fin del Ejercicio de Manipulación de Arrays");
    }
}
