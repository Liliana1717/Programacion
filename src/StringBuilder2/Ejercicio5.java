package StringBuilder2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();
        String s = Double.toString(numero);
        int punto = s.indexOf('.');
        String entero = (punto == -1) ?  s : s.substring(0,punto);
        String decimal = (punto == -1) ?  "" : s.substring(punto);

        StringBuilder sb = new StringBuilder();
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i,',');
            
        }
        System.out.println(sb.toString() + decimal);
  sc.close();
    }
}
