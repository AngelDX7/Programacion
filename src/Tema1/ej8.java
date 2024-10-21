package Tema1;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer número entero:");
        int num1 = scanner.nextInt();
        System.out.println("Dime el segundo número entero:");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El " + num1 + " es más grande que " + num2);
        } else if (num1 < num2) {
            System.out.println("El " + num1 + " es más pequeño que " + num2);
        } else {
            System.out.println("El " + num1 + " es igual a " + num2);
        }
        scanner.close();
    }
}