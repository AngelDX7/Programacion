package Tema1;

import java.util.Scanner;
public class ej10 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Dime el primer número :");
    double num1 = scanner.nextInt();
    System.out.println("Dime el segundo número :");
    double num2 = scanner.nextInt();

    double suma = num1 + num2;
    double resta = num1 - num2;
    double producto = num1 * num2;
    double division = (double) num1 / num2;
    double resto = num1 % num2;

    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Producto: " + producto);
    System.out.println("División: " + division);
    System.out.println("Resto: " + resto);
}

}


