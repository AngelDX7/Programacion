package Tema2;
import java.util.Scanner;

public class Ejercicio24 {
    /*. Realiza un programa que permite a un profesor introducir la nota de un
    número indefinido de alumnos y le indica cuántos suspendidos o
    aprobados hay*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        int suspendidos = 0;

        System.out.println("Introduce la nota (si quieres calcular el numero ed aprobados/susupendidos introduce el numero 11).");
        int numero = sc.nextInt();

        while (numero != 11) {
            if (numero >= 5 ) {
                aprovados++;
            } else  {
                suspendidos++;

            } System.out.println("Introduce la nota (si quieres calcular el numero ed aprobados/susupendidos introduce el numero 11).");
             numero = sc.nextInt();

        }
        System.out.println("Tienes tantos "+ suspendidos +" suspendidos y " + aprovados + " aprobados");
    }
}


