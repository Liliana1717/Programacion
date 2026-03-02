package exepciones;

public class MainRE {
    public static void main(String[] args) {
        Pelicula P1 = new Pelicula("incepcion",20, "CIENCIA FICCION");
        Sesion s1 = new Sesion(P1,20,2);
        s1.mostrarInfo();

        System.out.println("intentando reservar");
        try {
            s1.resevarEntrada(2);

        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}
