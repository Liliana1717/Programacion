package ejercicio2t1;

import java.util.Scanner;

/*
        Programa que lee un número de 3 cifras y muestra sus cifras por separado.

 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero de 3 cifras");
        int cifra = sc.nextInt();
        int centenas = cifra / 100;
        int decenas = cifra % 100 / 10;
        int unidades = cifra % 10;
        System.out.println( " centenas =  " + centenas + " decenas = "+ decenas + " unidades =  " +  unidades);


    }
}
