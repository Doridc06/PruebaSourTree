package ejer5;

public class CaracteresParImpar {

    public static void caracteresParImpar(String palabra1,String palabra2 ) {
        if ((palabra1.length() % 2 == 0) && (palabra2.length() % 2 == 0)){
            System.out.println("La palabra: " + palabra1 + ", tiene una cantidad Par de caracteres");
            System.out.println("La palabra: " + palabra2 + ", tiene una cantidad Par de caracteres");
        }else{
            System.out.println("La palabra: " + palabra1 + ", tiene una cantidad Par de caracteres");
            System.out.println("La palabra: " + palabra2 + ", tiene una cantidad Impar de caracteres");
        }
    }

    public static void main(String[] args) {
        caracteresParImpar("Programacion", "Web");
    }
}
