package arrays;

import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[3];
        String[] telefonos = new String[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el nombre de la persona " + (i + 1) );
            nombres[i] = sc.nextLine();
            System.out.print("Introduce el teléfono de " + nombres[i]);
            telefonos[i] = sc.nextLine();
        }


        System.out.println("agenda ::  ");
        for (int i = 0; i < 3; i++) {
            System.out.println( nombres[i] + " tiene el telefono " + telefonos [i]);

        }
        sc.close();
    }
}
