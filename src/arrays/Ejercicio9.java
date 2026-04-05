package arrays;

public class Ejercicio9 {
    public static int[] mezclar(int[] A, int[] B) {

        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < A.length) {
            C[k++] = A[i++];
        }

        while (j < B.length) {
            C[k++] = B[j++];
        }

        return C;
    }

    public static void main(String[] args) {

        int[] A = {4, 8, 15, 22, 25, 40};
        int[] B = {3, 6, 18, 21, 25, 47};

        int[] C = mezclar(A, B);

        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}

