package exepciones;

public class Sesion {
    private Pelicula pelicula;
    private double horaInicio;

    private int entradas;

    public Sesion(Pelicula pelicula, double horaInicio, int entradas) {
        this.pelicula = pelicula;
        this.horaInicio = horaInicio;
        this.entradas = entradas;
    }

    public void resevarEntrada (int cantidad)  throws Exception {
        if (cantidad <= 0) {
            throw new Exception(" debes reservar como minimo una entrada");
        }
        if (cantidad > entradas) {
            throw new Exception("no hay suficientes entradas disponibles");
        }
        entradas -= cantidad;
        System.out.println(" se ha reservado correctamente");
    }

  public void mostrarInfo(){
            System.out.println(" pelicula : " + pelicula);
            System.out.println("hora Inicio : " + horaInicio);
            System.out.println(" entradas" + entradas);

        }
    }

