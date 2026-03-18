package Lista;

import java.util.UUID;

public class VideoJuego {
    private String titulo;
    private String Plataforma;
    private String genero;
    private double precio;
    private int stock;
    private UUID id;

    public VideoJuego(String titulo, String plataforma, String genero, double precio, int stock) {
        this.titulo = titulo;
        Plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.id = UUID.randomUUID();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String plataforma) {
        Plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", Plataforma='" + Plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", id=" + id +
                '}';
    }
}