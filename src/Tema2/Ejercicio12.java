package Tema2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Dime tu segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Dime tu tercer numero");
        double num3 = sc.nextDouble();
        double mayor = num1;
        double medio = num2;
        double menor = num3;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
            System.out.println("Números ordenados de mayor a menor: ");
            System.out.println(mayor + " " + medio + " " + menor);
        }
    }
}