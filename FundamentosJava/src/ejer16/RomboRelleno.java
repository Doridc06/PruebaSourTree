package ejer16;

public class RomboRelleno {
    public static void main(String[] args) {
        int numeroFilas = 9; // // colocar impar para que no salga choreto

        // Itera sobre las filas
        for (int i = 0; i < numeroFilas; i++) {

            // Itera sobre las columnas
            for (int j = 0; j < numeroFilas; j++) {

                // Determina si se debe imprimir un asterisco o un espacio en blanco
                if (i <= numeroFilas/2) {
                    if (j >= numeroFilas/2 - i && j <= numeroFilas/2 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - numeroFilas/2 && j <= numeroFilas - 1 - (i - numeroFilas/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            // Imprime una nueva línea al final de cada fila
            // con esto se hace la forma del rombo
            System.out.println();
        }
    }
}
