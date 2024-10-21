package Tema1;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer número entero:");
        int num1 = scanner.nextInt();
        System.out.println("Dime el segundo número entero:");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        double division = (double) num1 / num2;
        int resto = num1 % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);
        System.out.println("Resto: " + resto);
    }

}
