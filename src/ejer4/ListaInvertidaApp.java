package ejer4;

import java.util.List;

import static ejer4.ListaInvertida.invertida;

public class ListaInvertidaApp {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listaInvertir = invertida(lista);
        System.out.println(listaInvertir);
    }
}
