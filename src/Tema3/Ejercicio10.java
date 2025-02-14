package Tema3;

import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menú de opciones ===");
        System.out.println("a) Mostrar el signo de un número introducido por el usuario.");
        System.out.println("b) Indicar si el usuario es mayor de edad o no.");
        System.out.println("c) Calcular el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
        System.out.println("Elige una opción:");
        String opcion = " ";
        opcion = sc.next();
        switch (opcion){
            case "a":
                System.out.println("Dime un numero:");
                int num = sc.nextInt();
                int numero = Ejercicio1.numero1(num);
                System.out.println(numero);
                break;
            case "b":
                boolean resultado;
                System.out.println("Introduce la edad:");
                int age = sc.nextInt();
                resultado = Main.isAdult(age);
                if (resultado == true){
                    System.out.println("Eres mayor de edad.");
                }  else  {
                    System.out.println("No eres mayor de edad.");
                }
                break;
            case "c":
                System.out.println("Dime el radio de tu circulo:");
                double radio = sc.nextDouble();
                if (Main.radioValido(radio) == true){
                    double resultadop = Main.calulcarPerimetroCirculo(radio);
                    double resutadoa = Main.calcularAreaCirculo(radio);

                    System.out.println("Tu perimetro mide "+ resultadop +" y tu area " +resutadoa);

                } else {
                    System.out.println("introduce un numero valido");
                }
                break;
            case "d":
                Ejercicio4.showMenu();
                int opcioncaso4 = sc.nextInt();
                switch (opcioncaso4){
                    case 1:
                        System.out.println("Dime el numero de euros");
                        double euros = sc.nextDouble();
                        double resultado1 = Main.euroAdollar(euros);
                        System.out.println("Tienes " + resultado1 + " dolares.");
                        break;

                    case 2:
                        System.out.println("Dime el numero de dolares");
                        double dolares = sc.nextDouble();
                        double resultado2 = Main.dollarAeuro(dolares);
                        System.out.println("Tienes " + resultado2 + " euros.");
                        break;

                    case 3:
                        System.out.println("Okay.");
                        break;
                }

                    break;
                    case "e":
                System.out.println("Dime de que numero quieres tu tabla de mutiplicar");
                int numerocaso5 = sc.nextInt();
                Ejercicio5.tablamultiplicar(numerocaso5);
                break;
            case "f":
                System.out.println("");
                for(int numerocaso6 = 1; numerocaso6 <= 10; numerocaso6++ ){
                    Ejercicio5.tablamultiplicar(numerocaso6);}
                break;
            case "g":
                int numerocaso7;

                System.out.println("Introduce numeros enteros positivos (0 para terminar):");
                numerocaso7 = sc.nextInt();

                while (numerocaso7 != 0) {
                    if (Ejercicio7.esPrimo(numerocaso7)) {
                        System.out.println(numerocaso7 + " es un número primo.");
                    } else {
                        System.out.println(numerocaso7 + " no es un número primo.");
                    }
                    System.out.print("Número: ");
                    numerocaso7 = sc.nextInt();
                }

                break;
            case "h":
                System.out.print("Introduce un día (1-31): ");
                int dia = sc.nextInt();
                System.out.print("Introduce un mes (1-12): ");
                int mes = sc.nextInt();
                System.out.print("Introduce un año: ");
                int año = sc.nextInt();
                if (Ejercicio8.esFechaValida(dia, mes, año)) {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
                } else {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + año + " no es válida.");
                }
                break;
            case "i":
                System.out.print("Introduce la letra para el triángulo: ");
                char caracter = sc.next().charAt(0);
                System.out.print("Introduce el número de líneas: ");
                int lineas = sc.nextInt();
                Ejercicio9.mostrarTriangulo(caracter, lineas);
                break;
            case "j":
                System.out.println("Muy bien!");
                break;

        }



    }
}
