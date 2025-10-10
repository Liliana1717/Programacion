package ejercicio2t1;
import java.util.Scanner;

/*
Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" introduce la velocidad en km/h");
        double km = sc.nextDouble();
        System.out.println("la velocidad en m/s es : " + km * 1000 / (60 * 60));
        sc.close();
    }
}
