package ejer17;

import java.util.Scanner;

import static ejer17.ValidarDNI.esValido;

public class ValidarDNIApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su DNI:");
        String dni = sc.nextLine();

        if (esValido(dni)) {
            System.out.println("El DNI " + dni + " es válido.");
        } else {
            System.out.println("El DNI " + dni + " no es válido.");
        }
    }
}
