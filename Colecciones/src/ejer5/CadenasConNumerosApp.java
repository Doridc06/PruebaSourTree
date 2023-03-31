package ejer5;

import java.util.Arrays;

import static ejer5.CadenasConNumeros.arrayCadenas;

public class CadenasConNumerosApp {
    public static void main(String[] args) {
        String[] arrayNumeros = {"Codigo", "896", "59q", "7hh89"};
        String[] numeros = arrayCadenas(arrayNumeros);
        System.out.println(Arrays.toString(numeros));
    }
}
