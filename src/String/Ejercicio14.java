package String;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primera palabra: ");
        String p1 = sc.nextLine();

        System.out.print("Segunda palabra: ");
        String p2 = sc.nextLine();

        String resultado = "";
        int max = Math.max(p1.length(), p2.length());

        for (int i = 0; i < max; i++) {

            if (i < p1.length()) {
                resultado += p1.charAt(i);
            }

            if (i < p2.length()) {
                resultado += p2.charAt(i);
            }
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }

}
