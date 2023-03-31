package ejer11;
public class CaracterInicioFinal {
        public String modificar(String cadena) {
            char ultimoCaracter = cadena.charAt(cadena.length() - 1);
            return ultimoCaracter + cadena + ultimoCaracter;
        }


    public static void main(String[] args) {
        CaracterInicioFinal modificador = new CaracterInicioFinal();
        String resultado = modificador.modificar("Hola");
        System.out.println(resultado);
    }
}
