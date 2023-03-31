package ejer4;
public class ObjetoNulo {
        public static void main(String[] args) {
            String objeto = null;

            try {
                objeto.toString();
            } catch (NullPointerException e) {
                System.err.println("Error, " + e.getMessage());
            }
        }
}
