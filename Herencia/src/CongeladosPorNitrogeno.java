import java.util.Date;

public class CongeladosPorNitrogeno extends ProductosCongelados {
    private double nitrogeno;
    public CongeladosPorNitrogeno(Date fechaCducidad, int numeroLote, double temperatura, double nitrogeno) {
        super(fechaCducidad, numeroLote, temperatura);
        this.nitrogeno = nitrogeno;
    }
}
