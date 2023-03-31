package ejer12;
public class ComienzaConPrograma {

    public static boolean comienzaConPrograma(String cadena) {
        int longitudPrograma = "programa".length();

        if (cadena.length() < longitudPrograma) {
            return false;
        }

        for (int i = 0; i < longitudPrograma; i++) {
            if (cadena.charAt(i) != "programa".charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String cadena = "para la programacion en java";
        boolean resultado = comienzaConPrograma(cadena);

        System.out.println(resultado);
    }
}

