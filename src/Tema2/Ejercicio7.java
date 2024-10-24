package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Dime tu segundo numero");
        double numero2 = sc.nextDouble();
        double resultado;

        if (numero1 > numero2) {
             resultado = numero1 - numero2;
        } else {
            resultado = numero2 - numero1;
        }
        System.out.println("El resultado es " + resultado);
    }
}
