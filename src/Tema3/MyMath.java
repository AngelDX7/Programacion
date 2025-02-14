package Tema3;

public class MyMath {
    public static void main(String[] args) {}


        public static double squarePerimeter(double cuadradop) {
            return 4*cuadradop;
        }
        public static double squareArea(double cuadradoa) {
            return cuadradoa*cuadradoa;
        }
        public static double rectanglePerimeter(double rectanguloaltura, double longitud ) {
            return  rectanguloaltura*2 + longitud*2;
        }
        public static double rectangleArea(double rectanguloaltura, double longitud) {
            return rectanguloaltura*longitud;
        }
        public static double circlePerimeter(double radio) {
            return 2 * Math.PI * radio;
        }
        public static double circleArea(double radio) {
            return Math.PI * radio * radio;
        }
        public static boolean primo (int num) {

            if (num < 2) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static int  contadordigitos (int numero){
            int contador = 0;
        while(numero > 0){
            numero = numero/10;
            contador++;
        } return contador;
        }
        public static int contadorPares (int numero){
        int contadorPar = 0;

        while (numero > 0){
            if(numero%2==0){
                contadorPar++;}
            numero = numero/10;
        } return contadorPar;
        }
        public static int contadorImpares (int numero){
            int contadorImpar= 0;
            while (numero > 0) {
                if (numero % 2 != 0) {
                    contadorImpar++;
                }
                numero = numero / 10;
            }return contadorImpar;
        }
        public static double caluladoraFactorial (double numeroo){
            if (numeroo < 0) {
                System.out.println("El factorial no puede hacerse con numeros negativos");
                return -7;
            }
            int resultado = 1;
            for (int i = 1; i <= numeroo; i++) {
                resultado *= i;
            }
            return resultado;
        }
        public static double calculadoraFactorialRecursivo (double numero){
            if (numero < 0) {
                System.out.println("El factorial no puede hacerse con numeros negativos");
                return -7;
            }
            if (numero == 0 || numero == 1) {
                return 1;
            }
            return numero * calculadoraFactorialRecursivo(numero - 1);
        }
        public static double seNosaIdoLaOlla (double a, double b, double c){
            double discriminante = (b * b) - (4 * a * c);
            if (discriminante > 0) {
                return 2;
            } else if (discriminante == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        public static int sumaDigitos (int numero){
        int suma = 0;
            while (numero > 0) {
                suma += numero % 10;
                numero /= 10;
            }

            return suma;
        }
        }




