package Clases;

public class ControladorFlota {
    public static void main(String[] args) {
        NaveEspacial [] naveEspacial = new NaveEspacial[3];
        naveEspacial[0] = new NaveEspacial(" navy ", 8.5);
        naveEspacial[1] = new NaveEspacial(" estelar ", 10.0);
        naveEspacial[2] = new NaveEspacial(" azul ");

        naveEspacial[0].viajar(30);
        naveEspacial[1].viajar(60);

        System.out.println(" :: estado  de la flota :: ");
        for ( NaveEspacial  nave : naveEspacial  ) {
            nave.mostrarEstado();
        }

       naveEspacial[0].repostar();

        System.out.println(" estado tras repostar");
        naveEspacial[0].mostrarEstado();

        NaveEspacial NaveconMasCombustible = naveEspacial[1];

        for( NaveEspacial nave : naveEspacial){
            if(nave.getCombustible() > NaveconMasCombustible.getCombustible()){
                NaveconMasCombustible = nave;

            }
        }
        System.out.println(" nave con más energia actualmente " + NaveconMasCombustible.getNombre()
                + "(" + NaveconMasCombustible.getCombustible() + "% )" );


    }
}
