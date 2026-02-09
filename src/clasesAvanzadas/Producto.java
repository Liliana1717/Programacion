package clasesAvanzadas;

public class Producto {
    protected  double precioBase;
    protected String Color;
    protected  char ConsumoBasico;
    protected double peso;

    public Producto(double precioBase, String color, char consumoBasico, double peso) {
        this.precioBase = precioBase;
        Color = color;
        ConsumoBasico = consumoBasico;
        this.peso = peso;
    }
}
