package ejer2lista;

import java.util.ArrayList;
import java.util.List;

import static ejer2lista.FalsoSiContiene.contiene;

public class FalsoSiContieneApp {

    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(8);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(0);
        lista2.add(1);
        lista2.add(6);

        List<Integer> lista3 = new ArrayList<>();
        lista3.add(4);
        lista3.add(3);
        lista3.add(9);

        System.out.println(contiene(lista));
        System.out.println(contiene(lista2));
        System.out.println(contiene(lista3));
    }
}
