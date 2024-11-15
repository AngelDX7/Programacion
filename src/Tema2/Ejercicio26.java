package Tema2;
import java.util.Scanner;



    public class Ejercicio26 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número entero: ");
            int numero = sc.nextInt();

            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;

                    }
                }
            }

            if (esPrimo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }

            sc.close();
        }
    }
