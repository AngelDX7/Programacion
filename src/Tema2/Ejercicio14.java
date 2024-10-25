package Tema2;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas sois?");
        double numpers = sc.nextDouble();
        System.out.println("Cuanto timepos hos vais a quedar?");
        double numdias = sc.nextDouble();
        double resultado;
                resultado= ((numdias*15)*numpers);
        if (numpers >= 5 && numdias >= 7) {
            resultado = (resultado *0.75);
        }
        System.out.println("Vustro precio de estancia es " + resultado);
    sc.close();
    }
}