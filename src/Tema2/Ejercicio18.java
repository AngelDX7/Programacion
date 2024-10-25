package Tema2;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        if (numero<0) {
            System.out.println("no es posible realizar la raiz quadrada");
        }else{
            double RaizQuadrada= Math.sqrt(numero);
            System.out.println("La raiz quadrada de " +numero  + " es " + RaizQuadrada);
        }sc.close();
    }
}
