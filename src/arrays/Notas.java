package arrays;

import java.util.Arrays;

public class Notas {

    public static void main(String[] args) {

        int[] notaLiliana = new int[3];
        notaLiliana[0] = 6;
        notaLiliana[1] = 7;
        notaLiliana[2] = 8;
        System.out.println(Arrays.toString(notaLiliana));
        int[] notasLilianaAuxiliares = notaLiliana;
        notaLiliana = new int[4];
        for (int i = 0; i < notasLilianaAuxiliares.length; i++) {
            notaLiliana[i] = notasLilianaAuxiliares[i]; // bucle para pasar los datos de un array a otro

        }
        notaLiliana[3] = 7;
        System.out.println(" notas liliana" + Arrays.toString(notasLilianaAuxiliares));
        System.out.println( "notas " + Arrays.toString(notaLiliana));

    }
}