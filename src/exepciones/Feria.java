package exepciones;

public class Feria extends Evento implements Accesiible{
    private boolean esFamiliar;

    public Feria(String nombre, int capacidad ,boolean esFamiliar) {
        super(nombre, capacidad);
        this.esFamiliar = esFamiliar;
    }


    @Override
    public boolean puedeEntrar(int edad) {
        return edad >=  12 || esFamiliar;
    }

    @Override
    public double calcularPrecio() {
        return esFamiliar ? 10 : 15;
    }
}
