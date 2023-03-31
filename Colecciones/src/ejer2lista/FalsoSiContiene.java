package ejer2lista;

import java.util.List;

public class FalsoSiContiene {

    public static boolean contiene(List<Integer> lista) {
        boolean valorTres = lista.contains(3);
        boolean valorDos = lista.contains(2);
        return valorDos | valorTres;
    }
}
