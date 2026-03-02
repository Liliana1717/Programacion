package exepciones;

public class SmartPhone  implements  Conectable,Recargable{


        private int bateria;
        private boolean encendido;

        public SmartPhone() {
            this.bateria = 50;
            this.encendido = false;
        }

        @Override
        public void encender() {
            if (bateria > 0) {
                encendido = true;
                System.out.println("Smartphone encendido.");
            } else {
                System.out.println("No hay batería.");
            }
        }

        @Override
        public void apagar() {
            encendido = false;
            System.out.println("Smartphone apagado.");
        }

        @Override
        public void cargarBateria() {
            bateria = 100;
            System.out.println("Batería cargada al 100%.");
        }

}
