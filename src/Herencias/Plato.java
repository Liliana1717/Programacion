package Herencias;

public abstract class Plato {

        protected String nombre;
        protected double precio;

        public Plato(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return nombre + " - " + precio + "€";
        }
    }

