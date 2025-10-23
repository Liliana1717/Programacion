package avanzados;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int varFijo= 42;
        int intentos = 0;
        System.out.println("estoy pensando en un número, intenta adivinarlo");
        while (intentos != varFijo){
            System.out.print(" Introduce un númerito");
            intentos = sc.nextInt();
            if (intentos > varFijo){

                System.out.println("el número es mayor");
            } else if (intentos < varFijo) {
                System.out.println(" el número es menor ");

            }
        }
        System.out.println(" felicidades adivinaste el numero");
        sc.close();

    }
}
