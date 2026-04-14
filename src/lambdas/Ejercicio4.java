package lambdas;

import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10,20,30,40,50);
        int suma = numeros.stream().mapToInt( n -> n).sum();
        double promedio = numeros.stream().mapToInt(n -> n).average().orElse(0);
        System.out.println("suma " + suma);
        System.out.println("promedio " + promedio);

    }
}
