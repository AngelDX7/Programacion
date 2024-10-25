package Tema2;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero (0,1,2).");
        int numero = sc.nextInt();

        switch(numero){
            case 0 :
                System.out.println("Cuanto mide el lado de tu cuadarado?");
                double ladocuadrado = sc.nextDouble();
                double superficiec = ladocuadrado * ladocuadrado;
                double perimetroc = ladocuadrado + ladocuadrado + ladocuadrado + ladocuadrado;
                System.out.println("La superficie mide " + superficiec + " y tu perimetro mide " + perimetroc);
                sc.close();
                return;
            case 1 :
                System.out.println("Cuanto mide la base de tu rectangulo?");
                double baserectangulo = sc.nextDouble();
                System.out.println("Cuanto mide la altura de tu rectangulo");
                double alturarectangulo = sc.nextDouble();
                double superficie = baserectangulo * alturarectangulo;
                double perimetro = 2 * (baserectangulo + alturarectangulo);
                System.out.println("La superficie del rectángulo es: " + superficie);
                System.out.println("El perímetro del rectángulo es: " + perimetro);
                return;
            case 2 :
                System.out.println("Cuanto mide la base de tu triangulo?");
                double basetriangulo = sc.nextDouble();
                System.out.println("Cuanto mide la altura de tu triangulo");
                double alturatriangulo = sc.nextDouble();
                double area = (basetriangulo * alturatriangulo)/2;
                System.out.println("La area de tu trianguilo es" + area);
                return;
            default:
                System.out.println("Opción no válida. Introduce 0, 1 o 2.");
        }sc.close();
    }
}