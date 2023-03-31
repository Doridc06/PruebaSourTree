import java.util.Date;

public class ProductosCongelados extends Productos {

    private double temperatura;
    public ProductosCongelados(Date fechaCaducidad, int numeroLote , double temperatura) {
        super(fechaCaducidad, numeroLote);
        this.temperatura = temperatura;
    }
}
