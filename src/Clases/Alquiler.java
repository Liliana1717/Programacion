package Clases;

public class Alquiler {
    public static void main(String[] args) {
        Vehiculo vh1 = new Vehiculo("ford",253.09,false,7);
        Vehiculo vh2 = new Vehiculo("tesla 300",300.0,true,20);
        Vehiculo vh3 = new Vehiculo("fiat 500", 100.89,false,5);
        vh1.mostrarResumen(24);
        vh2.mostrarResumen(30);
        vh3.mostrarResumen(40);


    }
}
