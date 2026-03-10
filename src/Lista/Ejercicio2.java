package Lista;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashSet<Integer> ids = new HashSet<>();
        ids.add(123);
        ids.add(234);
        ids.add(1);

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un ID");
        int id = sc.nextInt();
        boolean acceso =ids .contains(id);
        System.out.println(" tienes acceso? " + acceso);
        sc.close();
    }
}
