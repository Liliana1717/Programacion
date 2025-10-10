package ejercicio2t1;

import java.util.Scanner;

/*

 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros enteros");
        int valor1 = sc.nextInt();
        System.out.println(" el siguiente numero");
        int valor2 = sc.nextInt();
        System.out.println(" multiplicación de " + valor1 + " y " + valor2 + " es : " + (valor1 + valor2));

        sc.close();
    }

}
