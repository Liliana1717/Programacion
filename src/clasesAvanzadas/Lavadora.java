package clasesAvanzadas;

public class Lavadora extends Producto{
    protected double carga;

    public Lavadora(double precioBase, String color, char consumoBasico, double peso, double carga) {
        super(precioBase, color, consumoBasico, peso);
        this.carga = carga;
    }

    public  void capacidadCarga(double carga){
        if (carga > 30 ){
            double precioFinal = precioBase * 2;
            precioBase = precioBase + precioFinal;

        }

    }

}
