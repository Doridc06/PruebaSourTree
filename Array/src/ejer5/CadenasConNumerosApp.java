package ejer5;

import java.util.Arrays;

import static ejer5.CadenasConNumeros.arrayCadenas;

public class CadenasConNumerosApp {
    public static void main(String[] args) {
        String[] arrayNumeros2 = {"C0d1g0", "896", "59q", "clase"};
        String[] resultado2 = null;

        resultado2 = arrayCadenas(arrayNumeros2);
        System.out.println("Array inicial");
        System.out.println("------------");
        for (int i = 0; i < arrayNumeros2.length; i++) {
            System.out.println(arrayNumeros2[i] + "");
        }

        System.out.println("-------------");
        System.out.println("array resultado");
        for (int i = 0; i < resultado2.length; i++) {
            System.out.println(resultado2[i] + "");
        }
    }
}