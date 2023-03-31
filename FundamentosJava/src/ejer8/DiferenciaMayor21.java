package ejer8;
public class DiferenciaMayor21 {

        public static int diferencia(int n) {
            if (n > 21) {
                return n - 21;
            } else {
                return 2 * (21 - n);
            }
        }

        public static void main(String[] args) {
            int numero = 10;
            int resultado = diferencia(numero);

            System.out.println("El resultado es: " + resultado);
        }
    }
