package Herencias;

import java.util.Arrays;

public class Comanda {
    private int NumMesa;
    private int numComensales;

    private Plato [] platos;
    private int contador;

    public Comanda(int numMesa, int numComensales,int capacidad) {
        this.NumMesa = numMesa;
        this.numComensales = numComensales;
        this.platos = new  Plato[capacidad] ;
        this.contador = 0;
    }
    public void añadirPlato( Plato P){
      if( contador < platos.length){
          platos[contador++] = P;
      }

            

    }
    public double coste(){
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += platos[i].getPrecio();

        }
        return total;
    }
    public boolean hayDiabeticos(){
        for (int i = 0; i < contador ; i++) {
            if (platos [i] instanceof Postres){
                Postres P = (Postres) platos[i];
                if (P.esSinAzucar()){
                return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String resultado = "NumMesa=" + NumMesa +
                ", numComensales=" + numComensales;
        for (int i = 0; i < contador; i++) {
            resultado += " - " + platos[i] + "\n";
        }
        return resultado;
    }
}
