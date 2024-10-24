package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Dime tu segundo numero");
        double numero2 = sc.nextDouble();
        System.out.println("Dime tu tercer numero");
        double numero3 = sc.nextDouble();
        double mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El mayor numero es " + mayor);
        sc.close();

    }
}
