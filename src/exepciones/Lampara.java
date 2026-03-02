package exepciones;

public class Lampara implements  Conectable{

        private boolean encendida;

        @Override
        public void encender() {
            encendida = true;
            System.out.println("Lámpara encendida.");
        }

        @Override
        public void apagar() {
            encendida = false;
            System.out.println("Lámpara apagada.");
        }
    }

