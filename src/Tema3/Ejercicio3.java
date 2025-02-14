package Tema3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el radio de tu circulo:");
        double radio = sc.nextDouble();
        if (Main.radioValido(radio) == true){
            double resultadop = Main.calulcarPerimetroCirculo(radio);
            double resutadoa = Main.calcularAreaCirculo(radio);

            System.out.println("Tu perimetro mide "+ resultadop +" y tu area " +resutadoa);

        } else {
            System.out.println("introduce un numero valido");
        }
    }
}
