package T2basicos;

import java.util.Scanner;
/*
Desarrolla un programa que, dado un número entre el 1 y el 7, indique el día de la semana del que se trata.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeroDia = sc.nextInt();
        switch (numeroDia) {

            case 1:
                System.out.println(" es lunes");
                break;
            case 2:
                System.out.println(" es martes");
                break;
            case 3:
                System.out.println("es miercoles");
                break;
            case 4:
                System.out.println("es jueves");
                break;
            case 5:
                System.out.println("es viernes");
                break;
            case 6:
                System.out.println("es sabado");
                break;
            case 7:
                System.out.println("es domingo");
                break;
            default:
                System.out.println("ingrese un numero del 1 al 7");
                break;
        }
        sc.close();
    }
}
