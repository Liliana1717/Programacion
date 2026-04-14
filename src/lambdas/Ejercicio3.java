package lambdas;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabra = List.of("java","programación","Stream","codigo","DAM");
        Optional<String> PalabraMasLarga = palabra.stream().max(Comparator.comparing(String :: length));
        PalabraMasLarga.ifPresent(p -> System.out.println("palabra más larga : " + p));
    }
}
