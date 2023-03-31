package ejer3;

public class DosValoresCentrales {

    public static int[] dosValores(int[] array) {
        int numPares = array.length;

        if (numPares % 2 != 0) {
            throw new IllegalArgumentException("Solo numeros pares.");
        }

        int[] array2 = new int[2];

        int indice = numPares / 2;
        array2[0] = array[indice - 1];
        array2[1] = array[indice];

        return array2;
    }
}
