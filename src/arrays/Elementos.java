package arrays;

import java.util.Arrays;
import java.util.Random;

public class Elementos {
    public static void main(String[] args) {
        Random randi = new Random();
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < 20; i++) {
            numerosAleatorios[i] = randi.nextInt(10);

        }
        System.out.println("  los numeros aleatorios son" + Arrays.toString(numerosAleatorios));

    }
}