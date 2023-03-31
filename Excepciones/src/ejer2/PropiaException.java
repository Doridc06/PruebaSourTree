package ejer2;

public class PropiaException extends Throwable {

            private  String message;
            public PropiaException(String message) {
            super(message);
            }

            public String devolverMensaje(){
                return message;
            }

    public static void main(String[] args) {
            try {
                int n1 = 2;
                int n2 = 0;
                System.out.println(n1 / n2);
                throw new PropiaException("Error");
            } catch (PropiaException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Estuve aqui");
            }
        }
    }


