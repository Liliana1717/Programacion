package Clases;

public class Libro {
    public String titulo;
    public Autor escritor;
    public boolean prestarLibro;

    public Libro(String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.prestarLibro = false;
    }

    public void prestar() {
        if (!prestarLibro) {
            prestarLibro = true;
            System.out.println(" Has prestado " + titulo);
        } else {
            System.out.println("error " + titulo + " no esta disponible ");
        }
    }

    public void devolver() {

        prestarLibro = false;

    }

    public void informacion() {
        System.out.println("titulo " + titulo);
        System.out.println("autor " + escritor.mostrarAutor());
    }

}