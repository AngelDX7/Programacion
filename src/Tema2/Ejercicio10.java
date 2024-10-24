package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Dime tu segundo numero");
        double numero2 = sc.nextDouble();
        System.out.println("Dime tu tercer numero");
        double numero3 = sc.nextDouble();

        if (numero1 <= numero2 && numero2 <= numero3) {
            System.out.println("Los números están ordenados de menor a mayor.");
        } else {
            System.out.println("Los números NO están ordenados de menor a mayor.");
        }

        sc.close();
    }
}
