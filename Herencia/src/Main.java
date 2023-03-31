import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Envio envio1 = new Envio (new Date(),02,"grande",30,3);
        System.out.println(envio1);

        System.out.println("El precio con el porcentaje del envio es de: " + EnvioPorBarco.precioPorCajas(10));

    }
}

