package Clases;

public class Robot {
    private final String nombre;
    private final String modelo;
    private double vida;
    private final double pontenciaAtaque;
    private final double blindaje;

    public Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100.0;
        this.pontenciaAtaque = 10 + Math.random() * 10;
        this.blindaje = Math.random() * 10;
    }

    public void MostrarEstadisticas() {
        System.out.printf("🤖 %s (%s)%nVida: %.2f%nAtaque: %.2f%nBlindaje: %.2f%n%n",
                nombre, modelo, vida, pontenciaAtaque, blindaje);
    }

    public void recibirDano(double cantidad) {
        double danoReal = cantidad - blindaje;

        if (danoReal > 0) {
            vida -= danoReal;
            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public double getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }


    public void atacar(Robot enemigo) {
        if (!this.estaVivo()) {
            System.out.println("El robot " + nombre + " está destruido y no puede atacar.");
            return;
        }

        if (!enemigo.estaVivo()) {
            System.out.println("El enemigo ya está vencido.");
            return;
        }

        enemigo.recibirDano(this.pontenciaAtaque);


    }


}