package exepciones;

public class Registro {


    public void RegistrarEdad(int edad) throws EdadInvalidaException{
        if( edad < 0 || edad> 120){
      throw  new EdadInvalidaException("edad invalida : debe estar entre 0 a 120");

        }
        System.out.println("edad registrada correctamente " + edad);

    }


}
