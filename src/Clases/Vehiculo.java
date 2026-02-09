package Clases;

public class Vehiculo {
    private String modelo;
    private double tarifaBase;
    private boolean esElectrico;
    private int diasAlquiler;

    public Vehiculo(String modelo, double tarifaBase, boolean esElectrico, int diasAlquiler) {
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
        this.esElectrico = esElectrico;
        this.diasAlquiler = diasAlquiler;
    }

    public double calcularPrecioFinal(int edadConductor){
        double total = tarifaBase * diasAlquiler;
        if(tarifaBase > 15){
            total *= 0.8;




        } else if (diasAlquiler > 7){
            total *= 0.9;
        }
        if (esElectrico && total >15){
            total -= 15;

        }
        if (edadConductor < 25){
            total += 50;

        }
        if (total < 0) return  total = 0;

        return total;

    }
    public void mostrarResumen(int edadConductor){
        System.out.printf("modelo: %s%n", modelo);
        System.out.printf("tarifa diaria %.2f%n ::" , tarifaBase);
        System.out.printf("dias de alquiler %d%n" , diasAlquiler);
        System.out.printf("electrico %s%n " , esElectrico ? "si" : "no");
        System.out.printf("edad conductor %d%n", edadConductor);
        System.out.printf("calcular precio final %.2f%n",calcularPrecioFinal(edadConductor));
        System.out.println("-------------------------------------------------------");
    }
}

