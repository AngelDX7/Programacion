package Tema2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número (0, 1, 2).");
        int numero = sc.nextInt();

        switch (numero) {
            case 0 -> {
                System.out.println("¿Cuánto mide el lado de tu cuadrado?");
                double ladocuadrado = sc.nextDouble();
                double superficiec = ladocuadrado * ladocuadrado;
                double perimetroc = 4 * ladocuadrado;
                System.out.println("La superficie mide " + superficiec + " y el perímetro mide " + perimetroc);
            }
            case 1 -> {
                System.out.println("¿Cuánto mide la base de tu rectángulo?");
                double baserectangulo = sc.nextDouble();
                System.out.println("¿Cuánto mide la altura de tu rectángulo?");
                double alturarectangulo = sc.nextDouble();
                double superficie = baserectangulo * alturarectangulo;
                double perimetro = 2 * (baserectangulo + alturarectangulo);
                System.out.println("La superficie del rectángulo es: " + superficie);
                System.out.println("El perímetro del rectángulo es: " + perimetro);
            }
            case 2 -> {
                System.out.println("¿Cuánto mide la base de tu triángulo?");
                double basetriangulo = sc.nextDouble();
                System.out.println("¿Cuánto mide la altura de tu triángulo?");
                double alturatriangulo = sc.nextDouble();
                double area = (basetriangulo * alturatriangulo) / 2;
                System.out.println("El área de tu triángulo es: " + area);
            }
            default -> System.out.println("Opción no válida. Introduce 0, 1 o 2.");
        }

        sc.close();
    }
}
