package String;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra = "Programar ";
        char[] oculta = new char[palabra.length()];

        for (int i = 0; i < oculta.length; i++) {
            oculta[i] = '_';
        }
        int intentos = 8;
        boolean ganado = false;

        while (intentos > 0 && !ganado) {

            for (char c : oculta) {
                System.out.print(c + " ");
            }
            System.out.println("intentos restantes: " + intentos);
            System.out.print("introduce una letra: ");
            char letra = sc.next().toUpperCase().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    oculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Fallo");
            } else {
                System.out.println("Acierto");
            }

            ganado = true;
            for (char c : oculta) {
                if (c == '_') {
                    ganado = false;
                    break;
                }
            }

            System.out.println();
        }

        if (ganado) {
            System.out.println("has ganado, La palabra era: " + palabra);
        } else {
            System.out.println("has perdido. La palabra era: " + palabra);
        }

        sc.close();
    }
}

