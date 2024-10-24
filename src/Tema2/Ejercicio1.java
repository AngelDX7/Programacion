package Tema2;
import java.util.Scanner;
public class Ejercicio1 {
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto mide el lado de tu cuadarado?");
        double ladocuadrado = sc.nextDouble();
        double superficie = ladocuadrado * ladocuadrado;
        double perimetro = ladocuadrado + ladocuadrado + ladocuadrado + ladocuadrado;
        System.out.println("La superficie mide " + superficie + " y tu perimetro mide " + perimetro);
    sc.close();
    }
}
