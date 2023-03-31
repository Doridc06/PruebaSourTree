package ejer7;

public class TresExcepciones {

        public static void metodoConExcepciones() throws Excepcion1, Excepcion2, Excepcion3 {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0:
                    throw new Excepcion1();
                case 1:
                    throw new Excepcion2();
                case 2:
                    throw new Excepcion3();
            }
        }

        public static void main(String[] args) {
            try {
                metodoConExcepciones();
            } catch (Excepcion1 | Excepcion2 | Excepcion3 e) {
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }
}
