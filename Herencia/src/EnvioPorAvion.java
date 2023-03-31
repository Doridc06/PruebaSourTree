import java.util.Date;

public class EnvioPorAvion extends Envio{

    private double precio;


    public EnvioPorAvion(Date fechaCaducidad, int numeroLote, String tamanyo, double precio, int numeroProductos) {
        super(fechaCaducidad, numeroLote, tamanyo, precio, numeroProductos);
    }
}
