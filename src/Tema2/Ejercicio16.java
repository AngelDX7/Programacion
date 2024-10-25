package Tema2;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Son Euros (E) o Dolares (D)");
        char opcion = sc.next().charAt(0);
        System.out.println("Y cual es la cantidad?");
        Double cantidad = sc.nextDouble();
        if (opcion == 'D' || opcion == 'd') {
            cantidad = (cantidad * 0.96);
        } else if (opcion == 'E' || opcion == 'e') {
            cantidad = (cantidad *1.08);}
            System.out.println("La converson de de resultado " + cantidad + " de " +opcion);
            }
        }

