package Herencias;

public class Coche2 extends VehiculoConMotor {

        private int numeroPuertas;

    public Coche2(String color, String modelo, double precio, String marca, int cilindrada, String combustible, int numeroPuertas) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.numeroPuertas = numeroPuertas;
    }
}


