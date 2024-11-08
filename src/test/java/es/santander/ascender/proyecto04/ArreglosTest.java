package es.santander.ascender.proyecto04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ArreglosTest {

    private final Arreglos cut = new Arreglos();

    @Test
    public void testGenerarArrayIncremental() {
        int[] esperado = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // no harìa falta el new int[]
        int limite = esperado.length;
        int[] prueba = cut.generarArrayIncremental(limite, false);
        assertNotNull(prueba, "El array recibido es nulo");

        assertArrayEquals(esperado, prueba);
        // for (int i = 0; i <= limite - 1; i++) {

        //     assertEquals(prueba[i], esperado[i], "En el índice " + i + " del array no coinciden los valores");

        // }

    }

    @Test
    public void testRevertirArrayIncremental() {
        int[] esperado = { 10, 9, 8, 7, 6, 5, 3, 3, 2, 1, 0 }; // no harìa falta el new int[]
        int limite = esperado.length;
        int[] prueba = cut.revertirArrayIncremental(esperado, true);
        assertNotNull(prueba, "El array recibido es nulo");
        assertArrayEquals(esperado, prueba);
        for (int i = 0; i <= limite - 1; i++) {

            assertEquals(prueba[i], esperado[(limite -1) -i], "En el índice " + i + " del array no coinciden los valores");

        }

    }

}
