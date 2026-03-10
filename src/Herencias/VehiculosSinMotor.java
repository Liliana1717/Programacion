package Herencias;

public class VehiculosSinMotor extends Vehiculo {

        protected String material;

    public VehiculosSinMotor(String color, String modelo, double precio, String marca, String material) {
        super(color, modelo, precio, marca);
        this.material = material;
    }
}


