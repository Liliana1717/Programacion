package Clases;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public  void vender(int cantidad){
        if ( cantidad <= stock){
            stock -= cantidad;
            System.out.println("  la venta se ha hecho correctamente" );

        }
        else {
            System.out.println("stock insuficiente");
        }

    }
    public void  reponer(int cantidad){
        if( cantidad > 0){
            stock += cantidad;
            System.out.println(" stock repuesto correctamente");

        }
    }
    public void mostrarInfo(){
        System.out.printf(" producto : %s | precio: %.2f €| stock : %d unidades%n" ,  nombre
        , precio , stock
        );
    }
}
