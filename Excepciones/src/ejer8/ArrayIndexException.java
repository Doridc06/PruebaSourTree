package ejer8;

public class ArrayIndexException extends Throwable {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int indice = 5;

        try {
            System.out.println(numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Se produjo una excepción de ArrayIndexOutOfBoundsException");
        }
    }
}
