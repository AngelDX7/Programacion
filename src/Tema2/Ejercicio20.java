
package Tema2;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero A: ");
        int A = scanner.nextInt();

        System.out.print("Introduce el numero B: ");
        int B = scanner.nextInt();

        if (B > A) {
            System.out.println("Los números impares entre " + A + " y " + B + " son:");
            for (int num = A + 1; num < B; num++) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        } else {
            System.out.println("B no es mayor que A. No se puede realizar la operación.");
        }

        scanner.close();
    }
}
