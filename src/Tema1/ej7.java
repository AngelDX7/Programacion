package Tema1;

import java.util.Scanner;
public class ej7 {
    public static void main(String[] args) {
        System.out.println("Dime cual es la cara de tu dado");
        Scanner scanner = new Scanner(System.in);
        int caradado = scanner.nextInt();
        if (caradado < 1 || caradado > 6) {
            System.out.println("El numero no entra en las caras del dado");
        } else {
            caradado = caradado - 7;
            System.out.println("tu dado da de resultado"+ (caradado*-1));
        }
    }
}
