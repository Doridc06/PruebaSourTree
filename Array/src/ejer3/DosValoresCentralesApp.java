package ejer3;

public class DosValoresCentralesApp {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 12};

        DosValoresCentrales dosValoresCentrales = new DosValoresCentrales();

        int[] arrayA = DosValoresCentrales.dosValores(array1);
        System.out.println(arrayA[0] + " " + arrayA[1]);

        int[] arrayB = dosValoresCentrales.dosValores(array2);
        System.out.println(arrayB[0] + " " + arrayB[1]);
    }
}