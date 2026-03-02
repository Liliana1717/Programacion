package exepciones;

public class Autobus extends Vehiculo {

    protected double pasajerosActuales;
    protected final int  capacidadMaxima = 50;


    public Autobus(String matricula, double combustible, double pasajerosActuales) {
        super(matricula, combustible);
        if (pasajerosActuales > capacidadMaxima)
            throw new IllegalArgumentException("demasiados pasajeros");
        this.pasajerosActuales = pasajerosActuales;
    }

    @Override
    public void viajar(double distancia) throws Exception {
        double consumoPorkm = 0.08 + (0.05 * pasajerosActuales);
        double consumoTotal = consumoPorkm * distancia;

        if (combustible < pasajerosActuales){
            throw new Exception(" el autobus se ha quedado sin combustible ");
        }

        combustible -= consumoTotal;
        kilometros += distancia;


    }

    @Override
    public String toString() {
        return "Autobus{" +
                "pasajerosActuales=" + pasajerosActuales +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}
