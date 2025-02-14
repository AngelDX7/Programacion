package Tema3.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BuscarParejas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] animales = {"Perro", "Gato", "Zariguella", "Elefante", "Leon", "Tigre", "Pinguino", "Girafa", "Ornitorrinco", "Jabali"};
        ArrayList<String> baraja = new ArrayList<>();
        for (String animal : animales) {

            baraja.add(animal);
            baraja.add(animal);
        }
        Collections.shuffle(baraja);
        /*Collections.shuffle(lista) reorganiza los elementos del ArrayList en un orden aleatorio.*/
        String[] barajadefinitiva = baraja.toArray(new String[0]);
        /*Convierte la lista barajada en string*/
        boolean[] parejasEncontradas = new boolean[20];
        ArrayList<String> AnimalesSeleccionados = new ArrayList<>();
        int parejasRestantes = 10;
        System.out.println("Bienvenido al juego de encontrar parejas");
        while (parejasRestantes > 0) {
            System.out.println("Tienes 10 parejas, en total 20 numeros, elige del 1 al 20");
            int numero1 = sc.nextInt() - 1;
            while (numero1 < 0 || numero1 >= 20 || parejasEncontradas[numero1]) {
                System.out.println("Número inválido o ya seleccionado. Intenta con otro:");
                numero1 = sc.nextInt() - 1;
            }
            System.out.println("----" + barajadefinitiva[numero1] + "----");
            System.out.println("Dime otro numero");
            int numero2 = sc.nextInt() - 1;
            System.out.println("----" + barajadefinitiva[numero2] + "----");
            while (numero2 < 0 || numero2 >= 20 || parejasEncontradas[numero2] || numero1 == numero2) {
                System.out.println("Número inválido, ya seleccionado o igual al primero. Intenta con otro:");
                numero2 = sc.nextInt() - 1;
            }
            if (barajadefinitiva[numero1].equals(barajadefinitiva[numero2])) {
                System.out.println("Has encontrado la pareja de " + barajadefinitiva[numero1]);
                parejasEncontradas[numero1] = true;
                parejasEncontradas[numero2] = true;
                AnimalesSeleccionados.add(barajadefinitiva[numero1]);
                AnimalesSeleccionados.add(barajadefinitiva[numero2]);
                parejasRestantes--;
            } else {
                System.out.println("Ese no era, vuelve a intentarlo");
            }
            System.out.println("Animales seleccionados correctamente: " + AnimalesSeleccionados);
            System.out.println("Parejas restantes: " + parejasRestantes);
        }
        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
        sc.close();
    }

}
