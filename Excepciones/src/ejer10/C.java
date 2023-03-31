package ejer10;

import ejer2.PropiaException;

public class C extends B {
        public void nivelTres() throws PropiaException {
                throw new PropiaException("Excepción de nivel 3");
        }
}
