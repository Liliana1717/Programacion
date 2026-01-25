package Clases;

public class Torneo {
    public static void main(String[] args) {


        Robot robot1 = new Robot("Mazinger", "Z");
        Robot robot2 = new Robot("Optimus", "Prime");

        System.out.println(" estadisticas finales");
        robot1.MostrarEstadisticas();
        robot2.MostrarEstadisticas();

        int ronda = 1;

        while (robot1.estaVivo() && robot2.estaVivo()) {
            System.out.println("RONDA " + ronda);

            robot1.atacar(robot2);

            if (robot2.estaVivo()) {
                robot2.atacar(robot1);
            }

            System.out.printf(
                    "Vida restante -> %s: %.2f | %s: %.2f%n%n",
                    robot1.getNombre(), robot1.getVida(),
                    robot2.getNombre(), robot2.getVida()
            );

            ronda++;
        }
        System.out.println(" RESULTADO FINAL");
        if (robot1.estaVivo()) {
            System.out.println("Ganador: " + robot1.getNombre());
        } else {
            System.out.println("Ganador: " + robot2.getNombre());
        }
    }


}


