package StringBuilder2;

public class Ejercicio1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int cambios = 0;
        String texto = " hola a todos ";
        for (int i = 0; i < texto.length() ; i++) {
            char c = texto.charAt(i);
            char may = Character.toUpperCase(c);
            sb.append(may);
            if (Character.isLetter(c) && c != may){
                cambios++;
            }
        }
        System.out.println("original : " + texto + ":: ");
        System.out.println("resultado : " + sb.toString() + "::");
        System.out.println( cambios +" cambios");

    }
}