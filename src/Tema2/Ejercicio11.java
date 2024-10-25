package Tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Dime tu segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Dime tu tercer numero");
        double num3 = sc.nextDouble();
        if (num1 == num2 + 1 && num2 == num3 + 1) {
            System.out.println("Los números son consecutivos.");
        } else if (num1 == num2 - 1 && num2 == num3 - 1) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        } sc.close();
    }
}