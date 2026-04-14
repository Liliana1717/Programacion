package lambdas;
import java.util.*;
public class Ejercicio2 {

        public static void main(String[] args) {
            List<String> nombres = List.of("ana", "luis", "guzmán", "marta");

            List<String> nombresMayusculas = nombres.stream()
                    .map(nombre -> nombre.toUpperCase())
                    .toList();

            System.out.println(nombresMayusculas);
        }
    }
