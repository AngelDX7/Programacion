package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Cuanto mide la base de tu triangulo?");
               double basetriangulo = sc.nextDouble();
            System.out.println("Cuanto mide la altura de tu triangulo");
                double alturatriangulo = sc.nextDouble();
                double area = (basetriangulo * alturatriangulo)/2;
                    System.out.println("La area de tu trianguilo es" + area);
        System.out.println("Cuanto mide tu lado 1?");
        double lado1 = sc.nextDouble();
        System.out.println("Cuanto mide tu lado 2?");
        double lado2 = sc.nextDouble();
        System.out.println("Cuanto mide tu lado 3?");
        double lado3 = sc.nextDouble();
             double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perímetro del triángulo es: " + perimetro);
        sc.close();
    }
}
