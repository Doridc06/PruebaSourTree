package ejer2;

public class FalsoSiContieneApp {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 7};
        int[] array2 = {0, 2, 4};
        int[] array3 = {5, 1, 9};

       FalsoSiContiene falsoSiContiene= new FalsoSiContiene();

        System.out.println(FalsoSiContiene.contiene(array1));
        System.out.println(FalsoSiContiene.contiene(array2));
        System.out.println(FalsoSiContiene.contiene(array3));
    }

}
