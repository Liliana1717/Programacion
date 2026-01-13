package Clases;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {

        Autor autor = new Autor("oscar wilde", "aleman");
        Libro[] libros = new Libro[1];
        libros[0] = new Libro("el retrato de dorian gray", autor);
        libros[0].prestar();
        libros[0].prestar();
        libros[0].informacion();


    }

}

