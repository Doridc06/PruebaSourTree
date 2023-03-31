package ejer7;
import java.util.Scanner;
public class ContarVocales {

        public static int contarVocal(String palabra) {
            palabra = palabra.toLowerCase();
            int numeroVocales = 0;
            char a = 'a';
            char e = 'e';
            char i = 'i';
            char o = 'o';
            char u = 'u';
            for (int j = 0; j < palabra.length(); j++) {
                char caracter = palabra.charAt(j);
                if ((caracter == a) || (caracter == e) || (caracter == i) || (caracter == o) || (caracter == u)) {
                    numeroVocales++;
                }
            }

            return numeroVocales;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce una palabra:");
            String palabra = sc.nextLine();
            int numeroVocales = contarVocal(palabra);
            System.out.println("La palabra " + palabra + " tiene " + numeroVocales + " vocales");
        }
    }
