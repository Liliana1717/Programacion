package StringBuilder;

public class Ejercicio3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10 ; i++) {
            sb.append(i);
            if (i < 10);
            sb.append("-");
        }
        String resultado = sb.toString();
        System.out.println(resultado );
    }
}
