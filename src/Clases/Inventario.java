package Clases;

public class Inventario {
    public static void main(String[] args) {
        Producto p1 = new Producto("Lenovo Ipad",489.9,50);
        p1.mostrarInfo();
        p1.vender( 90);
        p1.reponer(100);
        p1.mostrarInfo();
        System.out.println(" :::");
        Producto p2 = new Producto("monitor ace gaming",119.99,20);
        p2.mostrarInfo();
        p2.vender(10);
        p2.reponer(5);
        p2.mostrarInfo();
        System.out.println(":::");
        Producto p3 = new Producto("teclado" ,300.34,15);
        p3.mostrarInfo();
        p3.vender(3);
        p3.reponer(5);
        p3.mostrarInfo();
        System.out.println(":::");

    }

}
