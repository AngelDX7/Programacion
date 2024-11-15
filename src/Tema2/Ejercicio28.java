package Tema2;

    import java.util.Scanner;
import java.util.Random;

    public class Ejercicio28 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int ganador = random.nextInt(100000);
            int intentos = 5;
            for (int i = 1; i <= intentos; i++) {
                System.out.print("Introduce un número de la lotería (entre 0 y 99,999): ");
                int numeroUsuario = sc.nextInt();

                while (numeroUsuario == ganador) {
                    System.out.println("¡Felicidades! Has ganado la lotería.");


                } if (numeroUsuario != ganador){
                    System.out.println("Lo siento ese no es el numero ganador.");
                }
                if (i == intentos) {
                    System.out.println("Te has quedado sin intenos");
                }
            }
        }
    }

