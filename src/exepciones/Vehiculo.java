package exepciones;

public abstract class Vehiculo implements Transportable {
    protected String matricula;
    protected double kilometros;

    protected double combustible ;

    public Vehiculo(String matricula, double combustible) {
        this.matricula = matricula;
        this.kilometros = 0;
        this.combustible = combustible;
    }
    public abstract void viajar(double distancia) throws Exception;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", kilometros=" + kilometros +
                ", combustible=" + combustible +
                '}';
    }
}

