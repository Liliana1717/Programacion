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
 public void Pago(double recargo,double metodoPago, double transferencia , double trajeta , double efectivo){
        if (metodoPago == transferencia){
            recargo = 0.3;
            System.out.println("por transferencia es " + recargo);

        } else if (metodoPago == trajeta) {
             recargo = 0.4;

        } else if (metodoPago == efectivo) {
            recargo = 0.3;

        }
        else {
           System.out.println("ingrese un metodo de pago valido");
       }
   }
    }

