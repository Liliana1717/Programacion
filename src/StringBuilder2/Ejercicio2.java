package StringBuilder2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int contador = 0;
        for (int i = 0; i < texto.length() ; i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)){
                sb.append(c);
            } else {
                if ( sb.length() > 0){
                    contador++;
                    sb.setLength(0);
                }
            }

        }
        if( sb.length() > 0){
            contador++;
        }
        System.out.println("numero de las palabras : " + contador
        );
    }
}
