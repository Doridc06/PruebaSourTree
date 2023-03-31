package ejer1;
public class Excepcion {

    public static void main(String[] args) {
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Estuve aqui");
        }
    }
}