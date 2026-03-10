package Herencias;

public class Moto extends VehiculoConMotor {
    private String tipo;

    public Moto(String color, String modelo, double precio, String marca, int cilindrada, String combustible, String tipo) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.tipo = tipo;
    }
}
