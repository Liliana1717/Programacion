package exepciones;

public class MainRegistro {
    public static void main(String[] args) {
        Registro registro1 = new Registro();

        try {
            registro1.RegistrarEdad(40);
        }
        catch (EdadInvalidaException e){
            System.out.println("error : " + e.getMessage());
        }
        System.out.println("programa finalizado");
    }
}
