package ejercicio2t1;

import java.util.Scanner;

/*
Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla.

 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lili = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = lili.nextLine();
        System.out.println(  nombre + " Es un nuevo usuario");

        lili.close();

    }
}
