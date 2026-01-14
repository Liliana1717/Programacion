package Clases;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;

    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.combustible = 100;
        this.capacidadCarga = capacidadCarga;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this(nombre,6.0);
    }
    public void viajar(int distancia){
        int consumo = distancia * 2;
        if( combustible >= consumo){
            combustible -= consumo;
            enMision = true;
    }
        else {
            System.out.println("combustible insuficiente");
        }


    }

    public void repostar(){
        combustible = 100;
        enMision = false;

    }

    public void mostrarEstado(){
        System.out.println(      " nave " + nombre +
                " :: combustible  " + combustible +
                " ::  capacidad " + capacidadCarga+ " toneladas " +
                         " :: en mision " + enMision );


    }

    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }
}
