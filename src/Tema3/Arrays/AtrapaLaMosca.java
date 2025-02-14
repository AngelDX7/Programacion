package Tema3.Arrays;
import java.util.Scanner;
import java.util.Random;

    public class AtrapaLaMosca {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int[] array = new int[15];
            System.out.print("Este es el array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            boolean mosca = false;
            do {

                int numerosellecionado;
                do {
                    System.out.println("Dime el numero en el que creas que este la mosca");
                    numerosellecionado = sc.nextInt();
                    if (numerosellecionado < 0 || numerosellecionado > 15) {
                        System.out.println("Introduceme un numero valido porfavor");
                    }
                } while (numerosellecionado < 0 || numerosellecionado > 15);
                int numeroAleatorio = random.nextInt(16);

                if (numeroAleatorio == numerosellecionado) {
                    System.out.println("Has encontrado el numero correcto");
                    mosca = true;
                } else if (numerosellecionado == numeroAleatorio - 1 || numerosellecionado == numeroAleatorio + 1) {
                    numeroAleatorio = random.nextInt(16);
                    System.out.println("Has asustadoa a la mosca y ha cambiado de posicon");
                } else {
                    System.out.println("Aqui no esta la mosca prueba otra vez");
                }

            } while (mosca = false);
        }
    }

