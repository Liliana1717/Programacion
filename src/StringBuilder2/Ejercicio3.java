package StringBuilder2;

public class Ejercicio3 {
    public static String codificar(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length() ; i++) {
            char c = cadena.charAt(i);
            resultado.append((char) (c +1));
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        String entrada = "lunes";
        String salida = codificar(entrada);
        System.out.println(" entrada :: " + entrada);
        System.out.println(" salida ::" + salida);
    }
}
