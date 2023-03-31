package ejer3;

public class Instanciada {
    private static int numeroInstancias;

    public Instanciada() {
        numeroInstancias++;
    }

    public static int getNumeroInstancias() {
        return numeroInstancias;
    }
}