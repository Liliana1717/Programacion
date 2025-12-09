package StringBuilder;

public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = "java es facil";
        String mayusculas = texto.toUpperCase();
        String reemplazo = texto.replace("facil","poderoso");
        String extraido = texto.substring(0,4);
        String invertida = new StringBuilder(texto).reverse().toString();
        System.out.println("original : " + texto);
        System.out.println("mayusculas : " + mayusculas);
        System.out.println("reemplazo : " + reemplazo);
        System.out.println("extraido : " + extraido);
        System.out.println("invertido : " + invertida);
    }
}
