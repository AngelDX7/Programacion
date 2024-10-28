package Tema2;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora (0-23): ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int segundos = sc.nextInt();
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        System.out.printf("La hora con un segundo más es: %02d:%02d:%02d\n", horas, minutos, segundos);

        sc.close();
    }
}

