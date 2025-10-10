package ejerciciosdeclase;

public class Variables2 {
    public static void main(String[] args) {

        long  dinero = 10000000000L;
        float saldo = 12345.45f;
        System.out.println(dinero);
        // no se puede encajar decimal en entero
       // int numero = 100.4f;

        // double cantidad = 124;

        final int notaFinal;
        double examen1 = 7.8;
        double examen2 = 5.4;
        double media = ( 7.8 + 5.4) / 2;

        System.out.println(" la media seria " + media);
// casting implicito - quita los decimales - se le llama truncado porque esta perdiendo informacion

 notaFinal = (int) media;
        System.out.println(" la nota  final seria: " + notaFinal);

         char inicial = 'L';
        System.out.println(" tu inicial es " + (byte) inicial);
    }
}
