package ejer9;

import java.util.Scanner;

public class PuedeDormir {
    public static boolean puedeDormir(boolean diasDeSemana, boolean vacaciones) {
        if (!diasDeSemana && vacaciones) {
            return true;
        } else {
           return false;
        }
    }


    public static void main(String[] args) {
        boolean diasDeSemana = false;
        boolean vacaciones = false;

        String diasSemana = "lunesmartesmiercolesjuevesviernes";
        String estaVacaciones = "si";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana:");
        String dias = sc.nextLine();

        System.out.println("Estas de vacaciones?");
        String siONo = sc.nextLine();

        if (diasSemana.indexOf(dias) != -1) {
            diasDeSemana = true;
        }
        if (siONo.contains(estaVacaciones)) {
            vacaciones = true;
        }

        boolean resultado = puedeDormir(diasDeSemana, vacaciones);

        System.out.println(resultado);
    }
}

