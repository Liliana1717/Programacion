package FuncionesAvanzadas;

public class Seguro {

        public double calcularSeguro(int edad, boolean tuvoAccidente, String tipoSeguro, String colorCoche, int antiguedadCoche) {
            double precioBase = 500.0;


            if (edad < 25) {
                precioBase += 150;
            } else if (edad > 60) {
                precioBase += 100;
            }

            if (tuvoAccidente) {
                precioBase += 200;
            }

            switch (tipoSeguro.toLowerCase()) {
                case "basico":
                    precioBase += 0;
                    break;
                case "completo":
                    precioBase += 300;
                    break;
                case "premium":
                    precioBase += 600;
                    break;
                default:
                    System.out.println("Tipo de seguro desconocido, usando básico por defecto.");
            }

            if (colorCoche.equalsIgnoreCase("rojo") || colorCoche.equalsIgnoreCase("amarillo")) {
                precioBase += 50;
            }


            if (antiguedadCoche > 10) {
                precioBase += 100;
            } else if (antiguedadCoche <= 2) {
                precioBase -= 50;
            }

            return precioBase;
        }

        public static void main(String[] args) {
            Seguro seguro = new Seguro();
            double costo = seguro.calcularSeguro(30, false, "Completo", "Rojo", 5);
            System.out.println("El costo del seguro es: $" + costo);
        }
    }


