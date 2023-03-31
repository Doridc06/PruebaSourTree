package ejer2;

import java.util.Scanner;

public class SaludoApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        saludar(nombre);
    }

    public static void saludar(String nombre) {
        boolean contieneNumeros = false;
        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            if (caracter >= '0' && caracter <= '9') {
                contieneNumeros = true;
                break;
            }
        }
        if (contieneNumeros) {
            System.out.println("ERROR!! Contiene números, por favor ingrese letras");
            return;
        }
        System.out.println("Hola " + nombre);
    }
}

