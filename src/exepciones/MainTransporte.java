package exepciones;

public class MainTransporte {
    public static void main(String[] args) {
        Camion camion = new Camion("273737z",50,2000,5000);
        Autobus autobus = new Autobus("7474774m",40,20);
        Burro burro = new Burro("belen",100,100);

        Transportable [] flota = {camion,autobus,burro};
        for (Transportable t: flota ){
            try {
                t.viajar(35);
                System.out.println(t.toString());

            }
            catch (Exception e){
                System.out.println("incidencia "+ e.getMessage());
            }
            System.out.println("-------------------------------------------");
        }


    }
}
