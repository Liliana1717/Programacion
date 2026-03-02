package exepciones;

public abstract class Evento {
    private String nombre;
    private int capacidad;
    private int asistente;

    public Evento(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.asistente = 0;
    }
    public abstract double calcularPrecio();

    public void agregarAsistente() throws  IllegalAccessException{
        if (asistente >= capacidad){
            throw new IllegalAccessException("el evento esta lleno");
        }
        asistente++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAsistente() {
        return asistente;
    }
}
