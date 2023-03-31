package ejer1;

import java.util.ArrayList;
import java.util.List;

import static ejer1.PosicionPrimeraUltima.posicion;

public class PosicionPrimeraUltimaApp {
    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(9);
        lista.add(8);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(1);
        lista2.add(6);

        List<Integer> lista3 = new ArrayList<>();
        lista3.add(4);
        lista3.add(7);
        lista3.add(1);

        System.out.println(posicion(lista));
        System.out.println(posicion(lista2));
        System.out.println(posicion(lista3));
    }
}
