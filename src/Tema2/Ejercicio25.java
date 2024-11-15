package Tema2;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        int factorial= 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero que quieres que factorize");
        int numero = sc.nextInt();
        if (numero <0 ) {
            System.out.println("el numero debe ser positico");
        }else {
            for (int i = 1; i <= numero; i++){
                factorial*=i;
            }
            System.out.println("el factorial de el numero es "+ factorial);
        }
    }
}
