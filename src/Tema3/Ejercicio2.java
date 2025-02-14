package Tema3;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        boolean resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad:");
        int age = sc.nextInt();
         resultado = Main.isAdult(age);
        if (resultado == true){
            System.out.println("Eres mayor de edad.");
        }  else  {
            System.out.println("No eres mayor de edad.");
        }
    }
}