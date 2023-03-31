import java.util.Date;

public class Envio extends Productos {
   public static final double  PRECIO_PEQUEÑO = 10;
    public static final double PRECIO_MEDIANO = 20;
    public static final double PRECIO_GRANDE = 30;

    final static String TAMANYO_GRANDE = "Grande";
    final static String TAMANYO_MEDIANO = "mediano";
    final static String TAMANYO_PEQUENYO = "pequeño";

    private int numeroProductos;
    private String tamanyo;
    private double precio;

    public Envio(Date fechaCducidad, int numeroLote,String tamanyo, double precio, int numeroProductos) {
        super(fechaCducidad, numeroLote);
        this.tamanyo = tamanyo;
        this.precio = precio;
        this.numeroProductos = numeroProductos;
    }

    public static double precioPorTamanyo(String tamanyo) {
        if (tamanyo.equalsIgnoreCase(TAMANYO_PEQUENYO)) {
            return PRECIO_PEQUEÑO;
        } else if (tamanyo.equalsIgnoreCase(TAMANYO_MEDIANO)) {
            return PRECIO_MEDIANO;
        } else if (tamanyo.equalsIgnoreCase(TAMANYO_GRANDE)) {
            return PRECIO_GRANDE;
        } else {
            throw new IllegalArgumentException("Tamaño inválido: " + tamanyo);
        }
    }


    public String getTamanyo() {
        return tamanyo;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "numeroProductos=" + numeroProductos +
                ", tamanyo='" + tamanyo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
