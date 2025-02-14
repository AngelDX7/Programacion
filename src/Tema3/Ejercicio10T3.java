package Tema3;
import java.util.Scanner;

public class Ejercicio10T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que quieres hacer");
        System.out.println("1.Calcular el area o el perimetro de la figura");
        System.out.println("2.Numero primo o no");
        System.out.println("3.Cuantos digitos tiene el numero");
        System.out.println("4.Cuantos numeros pares tiene el numero");
        System.out.println("5.Cuantos numeros impares tiene el numero");
        System.out.println("6.Calcula el factorial");
        System.out.println("7.Calcula el factorial(recursivo)");
        System.out.println("8.Equacion segundo grado");
        System.out.println("9.Digitos numero entero");
        int seleccion = sc.nextInt();
        int num = 0;
        int numero = 0;
        double numeroo = 0;
        switch(seleccion){

            case 1:
                System.out.println("Funciones disponibles:");
                System.out.println("1.  Calcula el perímetro de un cuadrado dado el lado.");
                System.out.println("2.  Calcula el área de un cuadrado dado el lado.");
                System.out.println("3.  Calcula el perímetro de un rectángulo dados el largo y el ancho.");
                System.out.println("4.  Calcula el área de un rectángulo dados el largo y el ancho.");
                System.out.println("5.  Calcula el perímetro (circunferencia) de un círculo dado el radio.");
                System.out.println("6.  Calcula el área de un círculo dado el radio.");
                int seleccioncase1 = sc.nextInt();
                double longitud;
                double rectanguloaltura;
                double radio;
                switch (seleccioncase1){

                    case 1:
                        System.out.println("Introduce la medida");
                        double cuadradop = sc.nextInt();
                        System.out.println("Mide 4" + MyMath.squarePerimeter(cuadradop));
                        break;
                    case 2:
                        System.out.println("Introduce la medida");
                        double cuadradoa = sc.nextInt();
                        System.out.println("Mide " + MyMath.squareArea(cuadradoa));
                        break;
                    case 3:
                        System.out.println("Introduce la medida del largo");
                         longitud = sc.nextInt();
                        System.out.println("Introduce la medida de la altura");
                         rectanguloaltura = sc.nextInt();
                        System.out.println(MyMath.rectanglePerimeter(longitud,rectanguloaltura));
                        break;
                    case 4:
                        System.out.println("Introduce la medida del largo");
                         longitud = sc.nextInt();
                        System.out.println("Introduce la medida de la altura");
                         rectanguloaltura = sc.nextInt();
                        System.out.println(MyMath.rectangleArea(longitud,rectanguloaltura));
                        break;
                    case 5:
                        System.out.println("Introduce el radio");
                         radio = sc.nextDouble();
                        System.out.println(MyMath.circlePerimeter(radio));
                        break;
                    case 6:
                        System.out.println("Introduce el radio");
                        radio = sc.nextDouble();
                        System.out.println(MyMath.circleArea(radio));
                        break;
                }

                break;
            case 2:
                System.out.println("Dime el numero que quieres que verifique");
                num = sc.nextInt();
                if (MyMath.primo(num)==true) {
                    System.out.println("Tu numero es primo");
                }else{
                    System.out.println("Tu numero no es primo");
                }

                break;
            case 3:
                System.out.println("Dime el numero que quieres que le calcule los digitos que tiene");
                numero = sc.nextInt();
                System.out.println(MyMath.contadordigitos(numero));
                break;
            case 4:
                System.out.println("Dime el  numero y te dire cuantos numeros pares tiene");
                numero = sc.nextInt();
                System.out.println(MyMath.contadorPares(numero));
                break;
            case 5:
                System.out.println("Dime el  numero y te dire cuantos numeros impares tiene");
                numero = sc.nextInt();
                System.out.println(MyMath.contadorImpares(numero));
                break;
            case 6:
                System.out.println("Dime el numero y te calculo el factorial");
                numeroo = sc.nextDouble();
                System.out.println(MyMath.caluladoraFactorial(numeroo));
                break;
            case 7:
                System.out.println("Dime el numero y te calculo el factorial recursivo");
                numeroo = sc.nextDouble();
                System.out.println(MyMath.calculadoraFactorialRecursivo(numeroo));
                break;
            case 8:
                System.out.println("Dime los digitos de la ecuacion de sgundo grado");
                System.out.println("El a");
                double a = sc.nextDouble();
                System.out.println("El b");
                double b = sc.nextDouble();
                System.out.println("El c");
                double c = sc.nextDouble();
                System.out.println("Tu funcion tiene " + MyMath.seNosaIdoLaOlla( a,  b ,  c) + " soluciones");
                break;
            case 9:
                System.out.println("Dime el numero");
                numero = sc.nextInt();
                System.out.println("Tu numero tiene " + MyMath.contadordigitos(numero) + " digitos.");
                break;
            default:
                System.out.println("Introduce un numero valido");
                break;
        }



    }
}
