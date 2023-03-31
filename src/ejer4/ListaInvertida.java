package ejer4;

import java.util.ArrayList;
import java.util.List;

public class ListaInvertida {

    public static List<Integer> invertida(List<Integer> lista) {
        List<Integer> listaInvertir = new ArrayList<Integer>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertir.add(lista.get(i));
        }
        return listaInvertir;
    }

}
