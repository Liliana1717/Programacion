package FuncionesAvanzadas;

public class Calculadora {
    public  static int calculadora( int numero1, int numero2){

        return numero1 + numero2;
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
     int resultado = calculadora(9,8);
        System.out.println(" la suma es " + resultado);
    }
}
