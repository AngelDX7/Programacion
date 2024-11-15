package Tema2;

public class Ejercicio27 {
    public static void main(String[] args) {
                int countador = 0;
                int numero = 2;
                while (countador < 20) {
                    boolean esPrimo = true;
                    for (int i = 2; i < numero; i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                        }
                    }if (esPrimo) {
                        System.out.println(numero);
                        countador++;
                    }
                    numero++;
                }
            }
        }
