package avanzados;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" introduce una cantidad");
        int cantidad = sc.nextInt();
        if ( cantidad <=2){
            System.out.println("agua");
        }
        else if (cantidad <=5){
            System.out.println(" coca cola");
        } else if (cantidad <= 7) {
            System.out.println("agua y bocadillo");

        } else  {

            System.out.println( "coca cola y bocadillo");
        }
        sc.close();
    }
}
