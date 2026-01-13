package Clases;

public class Coche {
    private String matricula;
    private String color;
    private String marca;
    private double km;

    public void conducir( int cuantosKmConduces){
      km += cuantosKmConduces;
    }
    public void pintar(String nuevoColor){
        color = nuevoColor;
    }

    public Coche(String matricula, String color, String marca, double km) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.km = km;
    }
    public String toString (){
        return "coche de marca " + marca + "y de color" + color + "conduce km" + km;
    }
}
