package ejer2;

import java.util.Map;

public class FalsoSiContiene {
    public static boolean contiene(Map<Integer, Integer> mapa){
    if (mapa.containsValue(2) | mapa.containsKey(2) | mapa.containsValue(3) | mapa.containsKey(3)) {
        return false;
    }
        return true;
    }
}