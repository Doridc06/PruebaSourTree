package ejer3;

import java.util.List;

import static ejer3.DosValoresCentrales.valoresCentrales;

public class DosValoresCentralesApp {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> DosValoresCentrales = valoresCentrales(lista);
        System.out.println(DosValoresCentrales);
    }
}
