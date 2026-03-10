package Lista;

import java.util.HashSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashSet<String> invitados = new HashSet<>();
        invitados.add("ana");
        invitados.add("julia");
        invitados.add("liliana");
        invitados.add("julia");
        invitados.add("lupe");
        System.out.println("Numero de invitados::" + invitados.size());
        System.out.println("----------------------------------------------");
        System.out.println("invitados únicos :: " + invitados);
    }
}
