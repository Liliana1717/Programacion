package Clases;

public class Persona {
  private  String nombre;
    private int edad;
    private char sexo;
    private int peso;// en kg
    private int altura;// en cm

    public Persona(String n) {
        this.nombre = n;
    }

    public Persona(String n, int e, char s) {
        this(n);
        this.edad = e;
        this.sexo = s;
    }
    
}