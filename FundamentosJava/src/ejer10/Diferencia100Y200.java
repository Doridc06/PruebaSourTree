package ejer10;

public class Diferencia100Y200 {

    public static boolean diferencia(int n) {
        if ((n >= 90 && n <= 100) || (n >= 190 && n <= 200)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int numero = 196;
        boolean resultado = diferencia(numero);

        System.out.println(resultado);
    }
}
