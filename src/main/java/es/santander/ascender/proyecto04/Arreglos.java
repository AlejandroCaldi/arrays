package es.santander.ascender.proyecto04;

public class Arreglos {

    public int[] generarArrayIncremental(int valorMaximo, boolean imprimir) {

        int[] arrayGenerado = new int[valorMaximo + 1];

        for (int i = 0; i <= arrayGenerado.length - 1; i++) {
            arrayGenerado[i] = i;
        }

        if (imprimir) {

            System.out.println("\nArray original");
            imprimirArray(arrayGenerado);
        }

        return arrayGenerado;

    }

    public int[] revertirArrayIncremental(int[] arrayInicial, boolean imprimir) {

        int[] arrayNuevo = new int[arrayInicial.length];

        int j = arrayInicial.length - 1;
        for (int i = 0; i <= arrayInicial.length - 1; i++) {

            arrayNuevo[i] = arrayInicial[j-i];
        }

        if (imprimir) {
            System.out.println("Array revertido");
            imprimirArray(arrayNuevo);
        }
        return arrayNuevo;
    }

    public float devolverValorEnIndice(float[] lista, int indiceABuscar)throws Exception{
      
        if (indiceABuscar < 0) {
            throw new Exception("Me has pedido un índice negativo: " + indiceABuscar);
        } else {
            if (indiceABuscar >= lista.length) {
                throw new Exception("El índice es mayor que el arreglo: " + indiceABuscar);
            }
        }

        return lista[indiceABuscar];
    }

    public double sumarValores(double[] valores) {
   
        double suma = 0.0;

        for (int i = 0; i < valores.length; i++) {
            suma = suma + valores[i];
        }

        return suma;
    }

    public double calcularMediaValores(double[] valores) {
        double suma = sumarValores(valores);

        return suma/valores.length;
    }


    public void imprimirArray(int[] arrayImprimir) {

        System.out.print("[");
        for (int i = 0; i <= arrayImprimir.length - 1; i++) {

            if (i < arrayImprimir.length - 1) {
                System.out.print(arrayImprimir[i] + ",");
            } else {
                System.out.print(arrayImprimir[i]);
            }

        }
        System.out.print("]");
        System.out.println("\n");
    }

}
