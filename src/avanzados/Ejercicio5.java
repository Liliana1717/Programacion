package avanzados;
/* Programa que lea dos caracteres por teclado y compruebe si son iguales.*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char caracter = sc.next().charAt(0);
        System.out.println("Introduce otro caracter");
        char caracter2 = sc.next().charAt(0);
        System.out.println(" los caracteres " + ((caracter == caracter2 )? "es igual" : "no son iguales"));
        sc.close();
    }

}
