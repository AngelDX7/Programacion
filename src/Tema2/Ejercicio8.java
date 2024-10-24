package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos euros tienes");
        double euro = sc.nextDouble();
            double resultado;
                    resultado= (euro *1.08);
        System.out.println("La cantidad de dolares que tienes es" + resultado);
    }
}
