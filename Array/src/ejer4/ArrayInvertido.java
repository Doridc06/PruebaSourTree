package ejer4;

public class ArrayInvertido {

    public static int[] invertido(int[] array) {
        int[] reversa = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversa[i] = array[array.length - 1 - i];
        }

        return reversa;
    }
}


