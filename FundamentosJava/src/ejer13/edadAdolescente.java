package ejer13;

import java.util.Scanner;

public class edadAdolescente {

    public static boolean edades(int edad1, int edad2, int edad3) {
        if ((edad1 >= 13 && edad1 <= 19) || (edad2 >= 13 && edad2 <= 19) || (edad3 >= 13 && edad3 <= 19)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la edad1:");
        int edad1 = sc.nextInt();

        System.out.println("Introduzca la edad2:");
        int edad2 = sc.nextInt();

        System.out.println("Introduzca la edad3:");
        int edad3 = sc.nextInt();

        boolean resultado = edades(edad1,edad2,edad3);

        System.out.println(resultado);
    }
}
