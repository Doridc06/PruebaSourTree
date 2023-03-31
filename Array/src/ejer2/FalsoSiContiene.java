package ejer2;
public class FalsoSiContiene {
    public static boolean contiene(int[] array) {
        for (int number : array) {
            if (number == 2 || number == 3) {
                return false;
            }
        }
        return true;
    }
}