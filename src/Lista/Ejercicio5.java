package Lista;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {
        Set<String> matriculas = new HashSet<>();

        matriculas.add("1234ZB");
        boolean añadido = matriculas.add("1234ZB");
        if (!añadido){
            System.out.println("error  la matricula ya existe :: " );
        }
        }}