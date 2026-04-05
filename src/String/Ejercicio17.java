package String;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("escribe asignaturas: ");
        String asignaturas = sc.nextLine();

        System.out.print("escribe notas: ");
        String notas = sc.nextLine();

        String[] listaAsignaturas = asignaturas.split(":");
        String[] listaNotas = notas.split(":");

        System.out.print("asignaturas aprobadas: ");

        for (int i = 0; i < listaAsignaturas.length; i++) {

            int nota = Integer.parseInt(listaNotas[i]);

            if (nota >= 5) {
                System.out.print(listaAsignaturas[i] + " ");
            }
        }

        sc.close();
    }
}

