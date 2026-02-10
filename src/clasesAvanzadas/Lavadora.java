package clasesAvanzadas;

public class Lavadora extends Producto {
    protected double carga;

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void capacidadCarga(double carga) {
        if (carga > 30) {
            double recargo = 0.05;
            double precioFinal = precioBase + (precioBase * recargo);
            System.out.println(" el precio es " + precioFinal);

        }
     else {
        System.out.println(" el precio es  " + precioBase);
    }

}

   public void Pago( double metodoPago, double transferencia , double trajeta , double efectivo){
        if (metodoPago == transferencia){

        }
   }
    }

