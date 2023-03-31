package ejer4;

import java.util.Arrays;

public class ArrayInvertidoApp {

    public static void main(String[] args) {
        int[] arr1 = {7, 8, 9, 10};
        int[] arr2 = {0, 1, 2, 3, 4, 5};

        ArrayInvertido arrayInvertido = new ArrayInvertido();

        int[] reversa1 = ArrayInvertido.invertido(arr1);
        System.out.println(Arrays.toString(reversa1));

        int[] reverva2 = ArrayInvertido.invertido(arr2);
        System.out.println(Arrays.toString(reverva2));
    }
}