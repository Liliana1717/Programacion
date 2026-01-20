package Clases;

public class Socio {
    static int contadorSocio = 0;
    private String nombre;
    private int id;

    public Socio(String nombre) {
        this.nombre = nombre;
        contadorSocio++;
        this.id = contadorSocio;
    }

    public static int getContadorSocio() {
        return contadorSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

}
