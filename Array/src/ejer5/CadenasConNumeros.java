package ejer5;

import java.util.ArrayList;
import java.util.List;

public class CadenasConNumeros {

    public static String[] arrayCadenas(String[] arrayNumeros) {
        int longitud = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i].matches(".*\\d.*")) {
                longitud++;
            }
        }
        String[] resultado = new String[longitud];
        int j = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i].matches(".*\\d.*")) {
                resultado[j] = arrayNumeros[i];
                j++;

            }
        }
        return resultado;
    }
}