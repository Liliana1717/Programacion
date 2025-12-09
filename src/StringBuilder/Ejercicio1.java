package StringBuilder;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine();
        int longitud = palabra.length();

        char primer= palabra.charAt(0);
        char ultima = palabra.charAt(palabra.length() -1);
        boolean contieneA = palabra.toLowerCase().contains("a");
        System.out.println(" la longitud : " + longitud);
        System.out.println("primer caracter : " + primer);
        System.out.println("ultimo caracter : " + ultima);
        System.out.println("contiene la letra a : " + (contieneA ? "si" : "no"));
        sc.close();
    }

}
