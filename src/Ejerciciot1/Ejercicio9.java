package Ejerciciot1;

public class Ejercicio9 {
    public static void main(String[] args) {
        int A, B, C, D;
        A = 15;
        B = 30;
        C = 100;
        D = 47;
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println(" " + " A=" + A + " B=" + B + " C=" + C + " D=" + D);
    }
}
