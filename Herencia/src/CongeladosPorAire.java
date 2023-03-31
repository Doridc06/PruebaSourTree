import java.util.Date;

public class CongeladosPorAire extends ProductosCongelados {
    private int aire;
    public CongeladosPorAire(Date fechaCducidad, int numeroLote, double temperatura) {
        super(fechaCducidad, numeroLote, temperatura);
        this.aire = aire;
    }
}
