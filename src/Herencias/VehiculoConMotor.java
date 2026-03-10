package Herencias;

public class VehiculoConMotor extends Vehiculo {

        protected int cilindrada;
        protected String combustible;

        public VehiculoConMotor(String color, String modelo, double precio, String marca,
                                int cilindrada, String combustible) {
            super(color, modelo, precio, marca);
            this.cilindrada = cilindrada;
            this.combustible = combustible;
        }
    }


