package ejercicio2t1;
/*
    Programa Java que declare una variable C de tipo entero y asígnale un valor.
    A continuación, muestra un mensaje indicando si el valor de C es positivo o negativo,
    si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
    Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
     */
public class Ejercicio2 {

    public static void main(String[] args) {

        int C = 97;
        System.out.println(" el numero es " + (C > 0 ? "Positivo" : "negativo"));
        System.out.println(" el valor de C es " + (C % 2 == 0 ? "Par" : "impar"));
        System.out.println(" el valor de C  " + (C % 5 == 0 ? " es multiplo de 5" : " No es multiplo de 5"));
        System.out.println(" el valor de C " + (C % 10 == 0 ? " es Multiplo de 10" : "no es multiplo de 10"));
        System.out.println(" y el valor de C " + (C < 100 ? "es menor que 100" : " no es menor que 100"));

    }
}
