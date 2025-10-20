package T2basicos;

import java.util.Scanner;
/*
Programa Java que lea un número entero y calcule si es par o impar.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println( numero + " es par ");
        }
        else {
            System.out.println(" es impar ");

        }
        sc.close();
    }
}
