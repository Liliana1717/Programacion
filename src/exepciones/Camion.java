package exepciones;

public class Camion extends Vehiculo {
    protected double cargaActual;
    protected double capacidadMaxima;

    public Camion(String matricula, double combustible, double cargaActual, double capacidadMaxima) {
        super(matricula, combustible);
        if (cargaActual > capacidadMaxima){
            throw new IllegalArgumentException("carga superio a la capacidad maxima");
        }
        this.cargaActual = cargaActual;
    }

    @Override
    public void viajar(double distancia) throws Exception {

        double consumoPorKm = 0.1 + (0.1 *( cargaActual / 1000));
        double consumoTotal = consumoPorKm * distancia;

        if (combustible < consumoTotal ){
            throw new Exception(" el camion se ha quedado sin combustible ");
        }
        combustible =- consumoTotal;
        kilometros += distancia;


    }

    @Override
    public String toString() {
        return "Camion{" +
                "cargaActual=" + cargaActual +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}
