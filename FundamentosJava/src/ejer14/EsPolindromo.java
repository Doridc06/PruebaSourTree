package ejer14;

public class EsPolindromo {

    public static boolean esPalindromo(String frase) {
            frase = frase.toLowerCase().replaceAll("\\s+", "");
// recorren la frase la i desde el primero y la j desde el ultimo caracter
            int i = 0;
            int j = frase.length() - 1;

            while (i < j) {
                if (frase.charAt(i) != frase.charAt(j)) {
                    return false;
                }
                // i se incrementa y j se decrementa para pasar
                // al siguiente par de caracteres correspondientes en la cadena
                // i es mayor o igual que j, significa que se han comparado todos los pares de caracteres
                i++;
                j--;
            }
            return true;
        }


        public static void main(String[] args) {
        String frase = "Anita lava la tina";
        boolean resultado = esPalindromo(frase);

        System.out.println(resultado);
    }
}
