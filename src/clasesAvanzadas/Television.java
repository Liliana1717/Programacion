package clasesAvanzadas;

public class Television extends Producto{
    protected double tamaño;
    protected  boolean sintonizadorTDT;

    public Television(double precioBase, String color, char consumoBasico, double peso, double tamaño, boolean sintonizadorTDT) {
        super(precioBase, color, consumoBasico, peso);
        this.tamaño = tamaño;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public  void medirTamaño(double pulgadas, double precioFinal){
        if (pulgadas >= 60){
            precioFinal = precioBase * 0.3;
            System.out.println( " precio final de la compra :: " + precioFinal);

        }



    }

}
