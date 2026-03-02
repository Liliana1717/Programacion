package exepciones;

public class MainEmpleado {
    public static void main(String[] args) {


        Empleado emp1 = new Empleado(" ana ", 200);
        Gerente gr1 = new Gerente("pablo ", 3000, 1000);
        System.out.println(emp1);
        System.out.println("--------------------------------------");
        System.out.println(gr1);
    }
}