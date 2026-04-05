package arrays;

public class Ejercicio8 {
    public static boolean esCuadroMagico(int[][] m) {
        int numero = 5;

        int sumaRef = 0;
        for (int j = 0; j < numero; j++) {
            sumaRef += m[0][j];
        }

        for (int i = 1; i < numero; i++) {
            int suma = 0;
            for (int j = 0; j < numero; j++) {
                suma += m[i][j];
            }
            if (suma != sumaRef) return false;
        }

        for (int j = 0; j < numero; j++) {
            int suma = 0;
            for (int i = 0; i < numero; i++) {
                suma += m[i][j];
            }
            if (suma != sumaRef) return false;
        }

        int diag1 = 0;
        for (int i = 0; i < numero; i++) {
            diag1 += m[i][i];
        }

        int diag2 = 0;
        for (int i = 0; i < numero; i++) {
            diag2 += m[i][numero - 1 - i];
        }

        return diag1 == sumaRef && diag2 == sumaRef;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {15, 8, 1, 24, 17},
                {16, 14, 7, 5, 23},
                {22, 20, 13, 6, 4},
                {3, 21, 19, 12, 10},
                {9, 2, 25, 18, 11}
        };

        System.out.println("¿Es cuadro mágico? " + esCuadroMagico(matriz));
    }
}

