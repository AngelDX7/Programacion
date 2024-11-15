package Tema2;
import java.util.Scanner;
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        ;


        System.out.print("Introduce un número entero positivo (o un negativo para terminar): ");
        numero = sc.nextInt();


        while (numero >= 0) {
            suma += numero;
            contador++;

            System.out.print("Introduce un número entero positivo (o un negativo para terminar): ");
            numero = sc.nextInt();

        }if (contador > 0) {
                double media = suma / contador;
                System.out.println("La media de los números introducidos es: " + media);
            } else {
                System.out.println("No se han introducido números positivos.");
            }

            sc.close();  // Cerrar el scanner al finalizar

        }
    }


