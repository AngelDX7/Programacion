package Tema3.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] tablero = new char[20];
        Arrays.fill(tablero, '0');
        Random random = new Random();
        int bombasColocadas = 0;

        while (bombasColocadas < 6) {
            int posicion = random.nextInt(20);
            if (tablero[posicion] == '0') {
                tablero[posicion] = '*';
                bombasColocadas++;
            }
        }


        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == '*') {
                if (i - 1 >= 0 && tablero[i - 1] == '0') {
                    tablero[i - 1] = '1';
                }
                if (i + 1 < tablero.length && tablero[i + 1] == '0') {
                    tablero[i + 1] = '1';
                }
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == '1') {
                if (i - 1 >= 0 && i + 1 < tablero.length && tablero[i - 1] == '*' && tablero[i + 1] == '*') {
                    tablero[i] = '2';
                }
            }
        }
        int contador = 0;
        int contadornumeros=14;
        while (contador < 14) {
            System.out.println("Dime un numero y te dire que tienes");
            int numero = sc.nextInt();
            contador++;

            if (tablero[numero] == '*') {
                System.out.println("Has pisado una bomba");
                break;
            } else if (tablero[numero] == '2' || tablero[numero] == '1' || tablero[numero] == '0') {
                System.out.println(tablero[numero]);
                contadornumeros--;
                System.out.println("Te quedan "+ contadornumeros +" por acertar.");
            }
        }
        System.out.println("Has ganado!!");
        System.out.println(Arrays.toString(tablero));
    }

    }


