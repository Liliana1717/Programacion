package avanzados;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce una posicion");
        int posicion = sc.nextInt();
        switch (posicion){
            case 1 :
                System.out.println("DAVID");
                break;
            case 2 :
                System.out.println("Antonio");
                break;
            case 3 :
                System.out.println("Juan Carlos");
                break;
            default:
                System.out.println("gabriel");
        }
        sc.close();
    }
}
