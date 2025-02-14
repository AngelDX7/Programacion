package Tema3;

import java.util.Scanner;

public class Ejercicio4 {
     public static void showMenu(){

         System.out.println("BIENVENIDO AL CONVERTIDOR");
         System.out.println("1. Convertidor Euro a Dollar");
         System.out.println("2. Convertidor Dollar a Euro");
         System.out.println("3. Salir.");

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         showMenu();
         int opcion = sc.nextInt();
         switch (opcion){
             case 1:
                 System.out.println("Dime el numero de euros");
                 double euros = sc.nextDouble();
                 double resultado1 = Main.euroAdollar(euros);
                 System.out.println("Tienes " + resultado1 + " dolares.");
                 break;

             case 2:
                 System.out.println("Dime el numero de dolares");
                 double dolares = sc.nextDouble();
                 double resultado2 = Main.dollarAeuro(dolares);
                 System.out.println("Tienes " + resultado2 + " euros.");
                 break;

             case 3:
                 System.out.println("Okay.");
                 break;
         }



    }
}