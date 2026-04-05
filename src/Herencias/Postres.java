package Herencias;

public class Postres extends Plato {
    private boolean sinAzucar;

    public Postres(String nombre, double precio, boolean sinAzucar) {
        super(nombre, precio);
        this.sinAzucar = sinAzucar;
    }
    public boolean esSinAzucar(){
        return sinAzucar;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "| sinAzucar = " + (sinAzucar ? "si " : "no");

    }
}
