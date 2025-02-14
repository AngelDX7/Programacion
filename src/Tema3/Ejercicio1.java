package Tema3;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num = sc.nextInt();
        int numero = numero1(num);
        System.out.println(numero);
    }

    //Funcion  ejercicio 1
    public static int numero1(int numero) {

        if (numero == 0) {
            return 0;
        } else if (numero > 0) {
            return 1;
        } else {
            return -1;
        }

    }
}
