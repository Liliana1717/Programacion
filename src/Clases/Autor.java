package Clases;

public class Autor {
    public String nombre;
    public String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String mostrarAutor() {
        return nombre + "(" + nacionalidad + ")";
    }


}
