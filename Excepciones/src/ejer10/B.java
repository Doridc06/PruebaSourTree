package ejer10;

import ejer2.PropiaException;

public class B extends A {

    public void nivelDos() throws PropiaException {
        throw new PropiaException("Excepción de nivel 2");
    }
}
