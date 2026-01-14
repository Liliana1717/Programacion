package Clases;

public class CuentaCorriente {
    public static void main(String[] args) {
         Cuenta c1 = new Cuenta();
        System.out.println(" el saldo inicial : " + c1.saldo());

        c1.imposicion(50);
        System.out.println(" tras ingresar 50 : " + c1.saldo());

        c1.reintegro(20);
        System.out.println(" tras retirar 20 : " + c1.saldo());

        c1. reintegro(   40);
        System.out.println(" tras retirar 40 : " + c1.saldo());
    }
}
