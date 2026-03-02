package exepciones;

public class Gerente  extends  Empleado{

    private double bono;

    public Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }

    @Override
    public double CalcularSueldo() {
        return sueldoBase + bono;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bono=" + bono +
                "sueldo total " + CalcularSueldo()+
                '}';
    }
}
