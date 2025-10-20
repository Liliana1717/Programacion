package T2basicos;

import java.util.Scanner;
/*
Crea un programa que pide tu edad y compruebe si puedes votar.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        if ( edad >= 18){
            System.out.println("Puedes votar");
        }
        else{
            System.out.println("No puedes votar");
        }
        sc.close();
    }
}
