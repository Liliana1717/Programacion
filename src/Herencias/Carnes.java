package Herencias;

public class Carnes extends Plato {

    public enum Coccion {
            POCO_HECHO, AL_PUNTO, MUY_HECHO, CARBONIZADO
        }

        private Coccion coccion;

        public Carnes(String nombre, double precio, Coccion coccion) {
            super(nombre, precio);
            this.coccion = coccion;
        }

        @Override
        public String toString() {
            return super.toString() + " | Cocción: " + coccion;
        }
    }

