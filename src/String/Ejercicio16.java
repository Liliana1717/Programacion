package String;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

            int a = 0, e = 0, i = 0, o = 0, u = 0;
            boolean encontrado = false;
            int pos = 0;

            while (pos < palabra.length() && !encontrado) {
                char c = palabra.charAt(pos);

                if (c == 'a') a++;
                if (c == 'e') e++;
                if (c == 'i') i++;
                if (c == 'o') o++;
                if (c == 'u') u++;

                if (a > 2 || e > 2 || i > 2 || o > 2 || u > 2) {
                    encontrado = true;
                }

                pos++;
            }

            if (encontrado) {
                System.out.println("Tiene mas de dos vocales iguales");
            } else {
                System.out.println("No hay vocales repetidas más de dos veces");
            }

            sc.close();
        }
    }

