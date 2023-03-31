package ejer3;

import java.util.ArrayList;
import java.util.List;

public class DosValoresCentrales {
    public static List<Integer> valoresCentrales(List<Integer> lista) {
        List<Integer> numeros = new ArrayList<>();
        int size = lista.size();

        if (size % 2 != 0) {
            throw new IllegalArgumentException("La lista debe tener una longitud par.");
        }

        int longitud = size / 2;
        numeros.add(lista.get(longitud - 1));
        numeros.add(lista.get(longitud));

        return numeros;
    }
}
