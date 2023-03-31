import java.util.Date;

public class EnvioPorBarco extends Envio {

    private double porcentaje;
    public EnvioPorBarco(Date fechaCaducidad, int numeroLote, String tamanyo, double precio, int numeroProductos ,double porcentaje) {
        super(fechaCaducidad, numeroLote, tamanyo, precio, numeroProductos);
        this.porcentaje = porcentaje;
    }


    public static double precioPorCajas(double precio) {
        double porciento = 0.1;
        double precioFinal = 0;
        if (precio > 0) {
            precioFinal = precio * porciento;

        }
        return precioFinal + precio;
    }

}

