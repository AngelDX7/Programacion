package Tema2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto mide la base de tu rectangulo?");
        double baserectangulo = sc.nextDouble();
        System.out.println("Cuanto mide la altura de tu rectangulo");
        double alturarectangulo = sc.nextDouble();
        double superficie = baserectangulo * alturarectangulo;
        double perimetro = 2 * (baserectangulo + alturarectangulo);
        System.out.println("La superficie del rectángulo es: " + superficie);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        sc.close();
    }
}