package ejer9;
import java.util.Scanner;
public class WhileHastaException {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean retry = true;

            while (retry) {
                try {
                    System.out.print("Ingrese un número: ");
                    int num = Integer.parseInt(input.nextLine());
                    System.out.println("El número ingresado es: " + num);
                    retry = false;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido.");
                }
            }

            System.out.println("Fin del programa.");
        }
    }

