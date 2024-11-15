package Tema2;

import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Dime el numero y te digo cuantos digitos tiene");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int contador = 0;
        while (numero > 0){
            numero = numero/10;
            contador++;


        }
        System.out.println("El número tiene "  + contador +  " dígitos.");
    }
}