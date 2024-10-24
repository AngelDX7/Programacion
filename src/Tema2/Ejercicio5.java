package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Dime tu segundo numero");
        double numero2 = sc.nextDouble();
        System.out.println("Dime tu tercer numero");
        double numero3 = sc.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("La media es " + media);
        int mediasindecimales = (int) Math.round(media);

        System.out.println("La media sin decimales es " + mediasindecimales);
    }
}


