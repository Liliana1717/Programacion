package arrays;

import java.util.Random;

public class Ejercicios5 {
    public static void main(String[] args) {
        Random randy = new Random();
        int[] numerosAleatorios = new int[50];
        for (int i = 0; i <= numerosAleatorios.length; i++) {
            numerosAleatorios[i] = randy.nextInt(100) + 1;
        }
            int [] faltantes = new int[100];
            int contador = 0;

        for (int i = 0; i < 100; i++) {
            boolean encontrado = false;


            for (int j = 0; j < numerosAleatorios.length; j++) {
                if (numerosAleatorios[j] == i){
                    encontrado = true;
                }

            }
            if (!encontrado){
                faltantes[contador] = i;
                contador++;
            }
        }
        System.out.println("array generado");
        for (int n  : numerosAleatorios) {
            System.out.println(n + " ");

        }
        System.out.println("");

    }
}
