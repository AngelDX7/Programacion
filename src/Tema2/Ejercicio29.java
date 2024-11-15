
/* “El número secreto”. Programa un juego en el que se calcula
aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
vez que el usuario pone un número el programa le indicará si lo ha
acertado, si el número secreto es mayor o si es menor. Termina cuando
el usuario acierta el número*/


package Tema2;

import java.util.Scanner;
import java.util.Random;

        public class Ejercicio29 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random random = new Random();
                int ganador = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
                int numero;

                System.out.println("Dime el número (1-100) a ver si lo adivinas");
                numero = sc.nextInt();

                while (numero != ganador) {
                    if (ganador > numero) {
                        System.out.println("El número es más grande que tu número.");
                    } else {
                        System.out.println("El número es más pequeño que tu número.");
                    }
                    System.out.print("Inténtalo de nuevo: ");
                    numero = sc.nextInt();
                }

                System.out.println("¡Has acertado el número!");
                sc.close();
            }
        }
