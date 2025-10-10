package ejerciciosdeclase;

public class PrecioVideoJuegos {
    public static void main(String[] args) {

        double ahorro = 1000;
        double precioVideojuego1 = 79.90;

        System.out.println(" tengo " + ahorro + " ahorrado");
        System.out.println(" me voy a comprar un videojuego que cuesta " + precioVideojuego1);
        ahorro = ahorro - precioVideojuego1;

        System.out.println(" ya me he comprado el videojuego y ahora tengo " + ahorro + " de mis ahorros");
    }
}