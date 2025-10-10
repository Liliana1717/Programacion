package ejercicio2t1;

import java.util.Scanner;

/*
        Escribe un programa Java que lee un número entero por teclado
        y obtiene y muestra por pantalla el doble y el triple de ese número

 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" INGRESA UN NUMERO");
        int numero = sc.nextInt();
        System.out.println(" el doble de " + numero + " es " + (numero * 2));
        System.out.println(" el triple de " + numero + " es " + (numero * 3));
  sc.close();
    }
}
