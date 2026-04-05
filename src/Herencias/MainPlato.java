package Herencias;

public class MainPlato {
    public static void main(String[] args) {
        Comanda c = new Comanda(5,3,10);
        c.añadirPlato(new Primero("ensalada",8.5,true));
        c.añadirPlato(new Carnes("solomillo",18.5,Carnes.Coccion.AL_PUNTO));
        c.añadirPlato(new Pescados("Merluza",15.0));
        c.añadirPlato(new Postres("Tarta de queso " , 6.0,true));

        System.out.println(c);
        System.out.println("hay diabeticos ? " + c.hayDiabeticos());
    }

}
