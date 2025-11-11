package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayOrdenado {
        public static boolean estaOrdenado(int[] array) {
            for (int i = 0; i < array.length- 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {

            Random randi = new Random();
            int[] numerosAleatorios = new int[20];

            for (int i = 0; i < 20; i++) {
                numerosAleatorios[i] = randi.nextInt(10);

            }
            System.out.println("  los numeros aleatorios son" + Arrays.toString(numerosAleatorios ));
            System.out.println(" el array esta ordenado? " + estaOrdenado(numerosAleatorios));
        }
    }


