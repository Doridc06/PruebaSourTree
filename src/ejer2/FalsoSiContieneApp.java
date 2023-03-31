package ejer2;

import java.util.HashMap;
import java.util.Map;

import static ejer2.FalsoSiContiene.contiene;
public class FalsoSiContieneApp {

    public static void main(String[] args) {

        Map<Integer, Integer> mapa = new HashMap<>();
        mapa.put(0,1);
        mapa.put(1,8);
        mapa.put(2,3);

        Map<Integer, Integer> mapa2 = new HashMap<>();
        mapa2.put(0,9);
        mapa2.put(1,3);
        mapa2.put(4,7);

        Map<Integer, Integer> mapa3 = new HashMap<>();
        mapa3.put(0,1);
        mapa3.put(1,5);
        mapa3.put(9,0);

        System.out.println(contiene(mapa));
        System.out.println(contiene(mapa2));
        System.out.println(contiene(mapa3));
    }
}
