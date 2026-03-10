package Herencias;

public class Bicicleta extends VehiculosSinMotor {

    private int numeroMarchas;

    public Bicicleta(String color, String modelo, double precio, String marca, String material, int numeroMarchas) {
        super(color, modelo, precio, marca, material);
        this.numeroMarchas = numeroMarchas;
    }
}


