package avanzados;

import java.util.Scanner;

/*

 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un caracter");
        char caracter = sc.next().charAt(0);
        System.out.println((caracter == 'A') &&  ( caracter == 'Z') ? "es mayuscula" : "no es mayuscula");


    }
}
