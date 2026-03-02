package exepciones;

public class Burro implements Transportable{
    protected String nombre;
    protected double energia;
    protected double carga;
    protected double kilometros;

    public Burro(String nombre, double energia, double carga) {
        this.nombre = nombre;
        this.energia = energia;
        this.carga = carga;
        this.kilometros = 0;
    }
    public void viajar(double distancia) throws Exception{
        double consumototal = 3  * distancia;
       if( energia < consumototal){
           throw new Exception(" el burro esta cansado");
       }
       energia -= consumototal;
       kilometros += distancia;

    }
    public void Descansar (){
        energia = 100;
    }

    @Override
    public String toString() {
        return "Burro{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", carga=" + carga +
                ", kilometros=" + kilometros +
                '}';
    }
}
