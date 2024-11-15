package Tema2;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1) {
        System.out.println("Dime que operacion queires realizar (+, -, *, / o %)");
        char operacion = sc.next().charAt(0);
        System.out.println("Dime el numero que quieras operar");
        double num1 = sc.nextDouble();
        System.out.println("Dime el segundo numero que quieras operar");
        double num2 = sc.nextDouble();
        double resultado;

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        break;
                    }
                case '%':
                    resultado = num1 % num2;
                    break;
                default:
                    System.out.println("Operacion no valida");
                    return;

            }
            System.out.println("Resultado: " + resultado);


            System.out.println("Quieres seguir calucalndo? ( 1 es Si 2 es No)");
            int numerocontinuar = sc.nextInt();

            if (numerocontinuar == 2){
                continuar=2;
            }
        }
    }
}