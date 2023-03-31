package ejer17;
import java.util.Scanner;
public class ValidarDNI {
    public static final String LETRA = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int numDigitos = 9;

    public static boolean esValido(String dni) {
        if (dni.length() == numDigitos) {
            int numeroDNI = Integer.parseInt(dni.substring(0, 8));
            int resto = numeroDNI % 23;
            char letra = dni.charAt(8);
            char letraCorrecta = LETRA.charAt(resto);

            return letra == letraCorrecta;
        } else {
            return false;
        }
    }
}