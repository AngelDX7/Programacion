package Tema3.Matrizes;

import java.util.Random;
import java.util.Scanner;

public class Atrapalamosca {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            int[][] array = new int[4][4];
            System.out.println("Este es el array: ");
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            boolean mosca = false;
            do {

                int numerosellecionadov;
                int numerosellecionadoh;
                do {
                    System.out.println("Dime el numero en el que creas que este la mosca (En el eje vertical o las filas)");
                    numerosellecionadov = sc.nextInt() -1;
                    if (numerosellecionadov < 0 || numerosellecionadov > 4) {
                        System.out.println("Introduceme un numero valido porfavor");
                    }
                    System.out.println("Dime el numero en el que creas que este la mosca (En el eje horizontal o las columnas)");
                    numerosellecionadoh = sc.nextInt()-1;
                    if (numerosellecionadoh < 0 || numerosellecionadoh > 4) {
                        System.out.println("Introduceme un numero valido porfavor");
                    }
                } while (numerosellecionadov < 0 || numerosellecionadov > 4);
                int numeroAleatoriov = random.nextInt(4);
                int numeroAleatorioh = random.nextInt(4);





                if (numeroAleatoriov == numerosellecionadov&&numerosellecionadoh == numeroAleatorioh) {
                    System.out.println("Has encontrado a la mosca");
                    mosca = true;
                } else if (numeroAleatoriov == numerosellecionadov+1||numeroAleatoriov == numerosellecionadov+1 &&numerosellecionadoh == numeroAleatorioh+1||numeroAleatorioh == numerosellecionadoh-1){
                     numeroAleatoriov = random.nextInt(4);
                     numeroAleatorioh = random.nextInt(4);
                    System.out.println("Has asustadoa a la mosca y ha cambiado de posicion");
                } else {
                    System.out.println("Aqui no esta la mosca prueba otra vez");
                }

            } while (mosca == false);
            sc.close();
        }
    }

