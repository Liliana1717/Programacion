package exepciones;

public class Empleado {
    protected String nombre;
    protected  double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }
    public double CalcularSueldo(){

        return sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}
