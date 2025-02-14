package Tema3.Strings;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class Lingo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("*****BIENVENIDO AL JUEGO DEL LINGO*****");
    boolean win = false;
    boolean lose = false;
    int contador = 0;

    System.out.println("Que palabra quieres ocultar?");
    String palabraoculta = sc.next();
    char[] palabra = palabraoculta.toCharArray();
    while (true) {
        if (palabra.length != 5) {
            System.out.println("Introduce una palabra de 5 letras de longitud.");
        } else {
            break;
        }
    }
    char [] indicador = new char[5];
    Arrays.fill(indicador,'-');
    do {
        System.out.println("Pista: "+ Arrays.toString(indicador));
        System.out.println("---Introduce tu palabra---");
        String palabrausuario = sc.nextLine().toLowerCase();
        System.out.println("Intento: "+palabrausuario);
        char [] palabrausuarioC = palabrausuario.toCharArray();
        for (int i = 0;i<5;i++){
            for (int j = 0; j <5; j++){
                if (palabra[i]==palabrausuarioC[j]) {
                    if(i==j){
                        indicador[i]=palabra[i];}
                } else {
                    indicador[i]= '*';
                }
            }
        }
        contador++;

        if (Arrays.equals(indicador,palabra)){
            win = true;
            System.out.println("FELICIDADES HAS GANADO");
        } else if (contador==5){
            lose = true;
            System.out.println("LO SIENTO HAS PERDIDO");
        }

    } while (win==false&&lose==false);
}
}
