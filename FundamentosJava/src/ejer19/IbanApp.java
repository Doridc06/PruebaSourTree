package ejer19;

import java.util.Scanner;

public class IbanApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la primera letra: ");
        String letra1 = sc.nextLine().toUpperCase();

        System.out.print("Ingresa la segunda letra: ");
        String letra2 = sc.nextLine().toUpperCase();

        System.out.println(letra1 + letra2 + "00");
        System.out.println(letra1 + letra2 + "00");

        int valor1 = letra1.charAt(0) - 'A' + 10; // Obtener el valor numérico de la primera letra
        int valor2 = letra2.charAt(0) - 'A' + 10; // Obtener el valor numérico de la segunda letra

        if (valor1 >= 10 && valor2 >= 10) { // Verificar que los valores numéricos sean válidos
            System.out.println("El código IBAN ES de España es: " + valor1 + valor2 + "00");
            int modulo = valor1 + valor2 % 97;
             int resto = 98 - modulo;
            System.out.println(letra1 + letra2 + resto);
        } else {
            System.out.println("Las letras ingresadas no son válidas para el código IBAN ES de España");
        }
    }
}

