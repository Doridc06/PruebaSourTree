package ejer1;

import java.util.ArrayList;
import java.util.List;

public class PosicionPrimeraUltima {
    public static boolean posicion(List<Integer> lista) {
        int primeraPosicion = lista.get(0);
        int ultimaPosicion = lista.get(lista.size() - 1);

        return primeraPosicion == 6 | ultimaPosicion == 6;
    }
}