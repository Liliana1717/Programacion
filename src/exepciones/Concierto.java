package exepciones;

public class Concierto  extends Evento implements Accesiible{
    private boolean esInternacional;

    public Concierto(String nombre, int capacidad, boolean esInternacional) {
        super(nombre, capacidad);
        this.esInternacional = esInternacional;
    }

    @Override
    public double calcularPrecio() {
        return  esInternacional ? 50: 30;
    }

    @Override
    public boolean puedeEntrar(int edad) {
        return edad >= 18;
    }
}
