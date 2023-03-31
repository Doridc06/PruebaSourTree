package ejer6;

public class Runtime extends Throwable {

    public static void main(String[] args) throws Exception {

        Runtime clase = new Runtime();

        try {
            clase.f();
        } catch (SegundaException e) {
            System.out.println("Segunda Exception " + e.getMessage());
        }
    }

    public void g() throws PrimeraException {
        throw new RuntimeException("Primera Exception");
    }

    public void f() throws SegundaException {
        try {
            g();
        } catch (PrimeraException e) {
            throw new SegundaException("Error en f: " + e.getMessage());
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
