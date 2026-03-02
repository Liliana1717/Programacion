package exepciones;

public class MainEvento {
    public static void main(String[] args) throws IllegalAccessException {
        Concierto c1 = new Concierto("Rock fest", 100, true);
        Feria f1 = new Feria("feria local", 50, true);

        int[] edadesConcierto = {18, 20, 25};
        int []edadesferia = {10,15,35};

        for (int edad : edadesConcierto){
            if (c1.puedeEntrar(edad)){
                c1.agregarAsistente();
            }
            else {
                System.out.println("edad " + edad + " no permitida " + c1.getNombre());
            }
        }

        for (int edad: edadesferia) {
            if (f1.puedeEntrar(edad)){
                f1.agregarAsistente();
            }
            else {
                System.out.println(" edad " + edad + "no permitida " + f1.getNombre());
            }
            // Mostrar resultados
            System.out.println("Resumen de eventos:");

            System.out.println(c1.getNombre() +
                    " | Asistentes : " + c1.getAsistente() +
                    " | Precio total: " + (c1.calcularPrecio() * c1.getAsistente()) + "€");

            System.out.println(f1.getNombre() +
                    " | Asistentes: " + f1.getAsistente() +
                    " | Precio total: " + (f1.calcularPrecio() * f1.getAsistente()) + "€");

        }

        }
    }
