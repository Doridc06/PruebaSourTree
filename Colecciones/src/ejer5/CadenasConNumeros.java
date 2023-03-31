package ejer5;

import java.util.ArrayList;
import java.util.List;

public class CadenasConNumeros {

    public static String[] arrayCadenas(String[] arrayNumeros) {
        List<String> lista = new ArrayList<>();
        for (String encontrarNumeros : arrayNumeros) {
            if (encontrarNumeros.matches(".*\\d.*")) {
                lista.add(encontrarNumeros);
            }
        }
        return lista.toArray(new String[0]);
    }
}

