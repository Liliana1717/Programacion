package Lista;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
      List<String> colores = new ArrayList<>();
        colores.add("verde");
        colores.add("morado");
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        HashSet<String> sinrepetir = new HashSet<>(colores);
        System.out.println(sinrepetir);

    }
}
