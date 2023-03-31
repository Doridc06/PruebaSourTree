package ejer3;

public class InstanciadaApp {
    public static void main(String[] args) {

        Instanciada instancia1 = new Instanciada();
        Instanciada instancia2 = new Instanciada();
        Instanciada instancia3 = new Instanciada();
        Instanciada instancia4 = new Instanciada();

        int numeroInstancias = Instanciada.getNumeroInstancias();

        System.out.println("El número de instancias creadas es: " + numeroInstancias);
    }
}


