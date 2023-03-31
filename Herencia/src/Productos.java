import java.util.Date;

public abstract class Productos {

    protected Date fechaCaducidad;
    protected int numeroLote;

    public Productos(Date fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
}
