package es.santander.ascender.proyecto04;

public class Arrays {

    public int[] generarArrayIncremental(int valorMaximo, boolean imprimir) {

        int[] arrayGenerado = new int[valorMaximo+1];
        
        for (int i=0;i<=arrayGenerado.length-1;i++) {
            arrayGenerado[i] = i;
        }

        if (imprimir) {

            imprimirArray(arrayGenerado);
        }

        return arrayGenerado;

    }

    public int[] revertirArrayIncremental(int[] arrayInicial, boolean imprimir) {

        int[] arrayNuevo = new int[arrayInicial.length];

        int j = arrayInicial.length-1;
        for(int i = 0; i<=arrayInicial.length-1;i++) {

            arrayNuevo[i] = j - i;
        }

        if (imprimir) {

            imprimirArray(arrayNuevo);
        }

        return arrayNuevo;
    }

        public void imprimirArray(int[] arrayImprimir) {

            System.out.println("\n");
            System.out.print("[");
            for(int i=0; i<=arrayImprimir.length-1;i++) {

                if (i<arrayImprimir.length-1) {
                    System.out.print(arrayImprimir[i] + ",");
                } else {
                    System.out.print(arrayImprimir[i]);
                }

            }
            System.out.print("]");
            System.out.println("\n");
        }


}
