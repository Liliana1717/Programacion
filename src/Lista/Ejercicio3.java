package Lista;

import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {
        TreeSet<Integer> premios = new TreeSet<>();
        premios.add(2);
        premios.add(34);
        premios.add(23);
        premios.add(12);
        for (int numeros: premios){
            System.out.println("premios :: " + numeros);
        }
    }
}
