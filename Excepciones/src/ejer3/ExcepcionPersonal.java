package ejer3;

import ejer2.PropiaException;

public class ExcepcionPersonal extends Throwable{

    private String message;
    public ExcepcionPersonal (String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        try {
            throw new PropiaException("Intentar compilar");
        } catch (Exception | PropiaException e) {
            System.out.println(e.getMessage());
        }
    }
}
