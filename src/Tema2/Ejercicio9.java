package Tema2;

import java.util.Scanner;

public class Ejercicio9 { public  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime cuantos dolares tienes");
    double dolar = sc.nextDouble();
    double resultado;
    resultado= (dolar *0.96);
    System.out.println("La cantidad de euros que tienes es" + resultado);
}
}

