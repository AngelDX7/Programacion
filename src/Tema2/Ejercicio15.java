package Tema2;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el mes del año en numero y te digo cuantos dias tiene.");
        int mes = sc.nextInt();
        System.out.println("Cual es el año?.");
        int ano = sc.nextInt();

        switch(mes){
            case 1,3,5,7,8,10,12:
                System.out.println("Tu mes tiene 31 dias");
                break;
            case 4,6,9,11:
                System.out.println("Tu mes tiene 30 dias");
                break;
            case 2:
          if ((ano % 4 == 0 && ano % 100 == 0) || (ano % 400 == 0)) {
                System.out.println("Tu mes tiene 29 dias");
            } else {
                System.out.println("Tu mes tiene 28 dias");
            }default:
                System.out.println("Introduce un mes valido");

        }
        sc.close();
    }
}
