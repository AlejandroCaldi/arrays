package es.santander.ascender.proyecto04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class ArreglosTest {

    private final Arreglos cut = new Arreglos();
    private final static double DELTA = 0.0000001;

    @Test
    public void testGenerarArrayIncremental() {
        int[] esperado = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // no harìa falta el new int[]
        int limite = esperado.length;
        int[] prueba = cut.generarArrayIncremental(limite-1, false);
        assertNotNull(prueba, "El array recibido es nulo");
   
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
        assertArrayEquals(esperado, cut.revertirArrayIncremental(prueba, false));
        for (int i = 0; i <= limite - 1; i++) {

            assertEquals(prueba[i], esperado[(limite -1) -i], "En el índice " + i + " del array no coinciden los valores");

        }

    }

    @Test
    public void testDevolverValorEnIndice() throws Exception {

        float resultado = cut.devolverValorEnIndice(new float[] {4.6f, 3.2F, -34.7f, 0.0f}, 1);

        assertEquals(3.2f, resultado);

    }
  
    @Test
    public void testSumarValores() {

        double[] sumaPrueba = new double[]{8.2,4.2,4.2,0.0};
        double respuestaCorrecta = 8.2+4.2+4.2+0.0;
        double resustadoPrueba = cut.sumarValores(sumaPrueba);
        assertEquals(respuestaCorrecta, resustadoPrueba);
    }
    
    @Test
    public void testCalcularMediaValores() {

        double mediaCorrecta = (double)(5.2+15.0+7.8+0-0)/4;
        double[] sumaPrueba = new double[] {5.2,15.0,7.8,0.0};
       
        double resultadoMedia =(float) cut.calcularMediaValores(sumaPrueba);
        assertEquals(mediaCorrecta, resultadoMedia);
    }


}
