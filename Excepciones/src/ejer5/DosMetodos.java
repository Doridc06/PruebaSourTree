package ejer5;

public class DosMetodos extends Throwable {

    public static void main(String[] args) throws Exception {

        DosMetodos clase = new DosMetodos();

        try {
            clase.f();
        } catch (SegundaException e) {
            System.out.println("Segunda exception " + e.getMessage());
        }
    }
    public void g() throws PrimeraException{
        throw new PrimeraException("Primera exception");
    }

    public void f() throws SegundaException{
        try {
            g();
        } catch (PrimeraException e) {
            throw new SegundaException("Error en f: " + e.getMessage());
        }
    }
}
