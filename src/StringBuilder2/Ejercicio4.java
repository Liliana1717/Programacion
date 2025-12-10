package StringBuilder2;

public class Ejercicio4 {
    public static void main(String[] args) {
        String entrada = "lunes";
        int rotar = 3;
        String salida = rotarderecha(entrada, rotar);
        System.out.println(salida);

        }

        public static String rotarderecha( String cadena, int rotaciones){
        int n = cadena.length();
        rotaciones = rotaciones % n;
        String pt1 = cadena.substring(n-rotaciones);
        String pt2 =  cadena.substring(0,n - rotaciones);
        return  pt1 + pt2;
        }

}
