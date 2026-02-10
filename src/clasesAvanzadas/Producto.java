package clasesAvanzadas;

public class Producto {
    protected double precioBase;
    protected String Color;
    protected char ConsumoEnergetico;
    protected double peso;

    public Producto(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        Color = color;
        ConsumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public char Consumo(char letra) {
        letra = ('A' | 'B' | 'C' | 'D' | 'E' | 'F');
        if (letra != ConsumoEnergetico) {
            return 'F';

        } else {
            System.out.println("el consumo es de " + letra);
        }
        return letra;
    }
    public String Color(String colorA) {
        if (colorA != Color) {
            return "blanco";
        } else {
            System.out.println("el color asigando" + colorA);
        }
        return colorA;
    }

    public void PrecioDinamicoConsumo(){



    }
}
