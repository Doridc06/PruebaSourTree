package ejer4;

public class StringNumeros {
        public static void soloNumeros(String frase) {
            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                if (caracter >= '0' && caracter <= '9') {
                    System.out.print(caracter + " ");
                }
            }
            System.out.println();
        }
    }