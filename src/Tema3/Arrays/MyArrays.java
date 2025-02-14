package Tema3.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MyArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menú de operaciones
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Leer un array");
            System.out.println("2. Encontrar el máximo de un array");
            System.out.println("3. Encontrar el mínimo de un array");
            System.out.println("4. Calcular la media de un array");
            System.out.println("5. Comprobar si un número existe en el array");
            System.out.println("6. Sumar dos arrays");
            System.out.println("7. Restar dos arrays");
            System.out.println("8. Multiplicar dos arrays");
            System.out.println("9. Invertir un array");
            System.out.println("10. Comprobar si un array es capicúa");
            System.out.println("0. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el tamaño del array:");
                    int tam = sc.nextInt();
                    int[] array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    lectorArray(array1);
                    break;

                case 2:
                    System.out.println("Introduce el tamaño del array:");
                    tam = sc.nextInt();
                    array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    maxArray(array1);
                    break;

                case 3:
                    System.out.println("Introduce el tamaño del array:");
                    tam = sc.nextInt();
                    array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    minArray(array1);
                    break;

                case 4:
                    System.out.println("Introduce el tamaño del array:");
                    tam = sc.nextInt();
                    array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    mediaArray(array1);
                    break;

                case 5:
                    System.out.println("Introduce el tamaño del array:");
                    tam = sc.nextInt();
                    array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    existeArray(array1);
                    break;

                case 6:
                    System.out.println("Introduce el tamaño del primer array:");
                    tam = sc.nextInt();
                    int[] array2 = new int[tam];
                    System.out.println("Introduce los elementos del primer array:");
                    for (int i = 0; i < tam; i++) {
                        array2[i] = sc.nextInt();
                    }

                    System.out.println("Introduce el tamaño del segundo array:");
                    tam = sc.nextInt();
                    int[] array3 = new int[tam];
                    System.out.println("Introduce los elementos del segundo array:");
                    for (int i = 0; i < tam; i++) {
                        array3[i] = sc.nextInt();
                    }
                    sumaArray(array2, array3);
                    break;

                case 7:
                    System.out.println("Introduce el tamaño del primer array:");
                    tam = sc.nextInt();
                    array2 = new int[tam];
                    System.out.println("Introduce los elementos del primer array:");
                    for (int i = 0; i < tam; i++) {
                        array2[i] = sc.nextInt();
                    }

                    System.out.println("Introduce el tamaño del segundo array:");
                    tam = sc.nextInt();
                    array3 = new int[tam];
                    System.out.println("Introduce los elementos del segundo array:");
                    for (int i = 0; i < tam; i++) {
                        array3[i] = sc.nextInt();
                    }
                    restaArray(array2, array3);
                    break;

                case 8:
                    System.out.println("Introduce el tamaño del primer array:");
                    tam = sc.nextInt();
                    array2 = new int[tam];
                    System.out.println("Introduce los elementos del primer array:");
                    for (int i = 0; i < tam; i++) {
                        array2[i] = sc.nextInt();
                    }

                    System.out.println("Introduce el tamaño del segundo array:");
                    tam = sc.nextInt();
                    array3 = new int[tam];
                    System.out.println("Introduce los elementos del segundo array:");
                    for (int i = 0; i < tam; i++) {
                        array3[i] = sc.nextInt();
                    }
                    multiplicacionArrays(array2, array3);
                    break;

                case 9:
                    System.out.println("Introduce el tamaño del array:");
                    tam = sc.nextInt();
                    array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    cambiarOrdenArrays(array1);
                    break;

                case 10:
                    System.out.println("Introduce el tamaño del array:");
                    tam = sc.nextInt();
                    array1 = new int[tam];
                    System.out.println("Introduce los elementos del array:");
                    for (int i = 0; i < tam; i++) {
                        array1[i] = sc.nextInt();
                    }
                    Capicua(array1);
                    break;

                case 0:
                    System.out.println("¡Adiós!");
                    return;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    public static void lectorArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Máximo: " + max);

    }

    public static void minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Minimo: "+ min);
    }

    public static void mediaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        double media = suma / array.length;
        System.out.println("Media: "+ media);
    }

    public static void existeArray(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que numero quieres que compruebe?");
        int numero = sc.nextInt();
        boolean encontrado = false;
         for (int num : array) {
             if (num==numero){
                 encontrado = true;
                 break;
             }
         }
        if (encontrado==true){
            System.out.println("El numero existe en el array");
        } else {
            System.out.println("El numero no existe en el array");
        }
    }

    public static void sumaArray(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener el mismo tamaño.");
        }
        int[] resultado = new int[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        System.out.println("Tu vector es" +  Arrays.toString(resultado));
    }

    public static void restaArray(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener el mismo tamaño.");
        }
        int[] resultado = new int[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] - vector2[i];
        }

        System.out.println("Tu vector es" + Arrays.toString(resultado));

    }

    public static void multiplicacionArrays(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener el mismo tamaño.");
        }
        int[] resultado = new int[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] * vector2[i];
        }

        System.out.println("Tu vector es" + Arrays.toString(resultado));
    }

    public static void cambiarOrdenArrays(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int inicio = 0;
            int acabar = array.length - 1;


            while (inicio < acabar) {
                int temp = array[inicio];
                array[inicio] = array[acabar];
                array[acabar] = temp;

                inicio++;
                acabar--;
            }
            System.out.println("Array invertida:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }

    public static void Capicua(int[] array) {
        boolean esCapicua = true;
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            if (array[inicio] != array[fin]) {
                esCapicua = false;
                break;
            }
            inicio++;
            fin--;
        }

        if (esCapicua) {
            System.out.println("El array es capicúa.");
        } else {
            System.out.println("El array no es capicúa.");
        }
    }
    }

