package Tema1;

import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime el radio de tu area");
        int numeroradio = scanner.nextInt();
        double Area= numeroradio*numeroradio*3.14;
    System.out.println("El area es:" + Area);}
}
