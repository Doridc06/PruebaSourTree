package ejer15;

public class ParametrosSumatorios {

    public static void sumarNumeros(String... numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            try {
                suma += Integer.parseInt(numeros[i]);
            } catch (NumberFormatException e) {
                System.out.println("El parámetro No. " + (i+1) + " no es numérico");
            }
        }
        System.out.println("La sumatoria es: " + suma);
    }
    public static void main(String[] args) {
        sumarNumeros("1", "2", "3", "cuatro", "5");
    }

}
