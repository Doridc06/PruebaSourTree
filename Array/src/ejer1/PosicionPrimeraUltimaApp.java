package ejer1;
public class PosicionPrimeraUltimaApp {

    public static void main(String[] args) {
        int[] array1 = {6, 9, 7};
        int[] array2 = {4, 7, 6};
        int[] array3 = {8, 1, 5};

        PosicionPrimeraUltima posicionPrimeraUltima = new PosicionPrimeraUltima();

        System.out.println(PosicionPrimeraUltima.posicion(array1));
        System.out.println(PosicionPrimeraUltima.posicion(array2));
        System.out.println(PosicionPrimeraUltima.posicion(array3));
    }
}