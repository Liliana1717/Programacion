package Clases;

public class Punto {
    private double x;
   private  double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double calcularDistancia( Punto otro){
     double dx = this.x  - otro.x;
      double dy = this.y - otro.y;
      return  Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(100, 200);
        Punto p2 = new Punto(400,800);
        double distancia = p1.calcularDistancia(p2);
        System.out.println(" la distancia entre los puntos es  " + distancia);
    }
}
