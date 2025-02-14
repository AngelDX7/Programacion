import java.util.Arrays;
import java.util.Scanner;
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!Bienvenido al jeugo del ahorcado!!");
        System.out.println("Cual es la palabra que quieres adivinar");
        //Planteamiento Variables//
        String palabrausuario = sc.next();
        int huecos = palabrausuario.length();
        char[] palabraAdivinar = new char[huecos];
        Arrays.fill(palabraAdivinar,'_');
        boolean ganado = false;
        boolean perdido = false;
        int intentos = 0;
        //Fin Planteamiento Variables//
        do

        {
            //Texto Inicio//
            System.out.println(Arrays.toString(palabraAdivinar));
            System.out.println("Que letra quieres probar?");
            System.out.println("Intentos:" + intentos + "/6");
            boolean letraencontrada = false;
            //Fin Texto Inicio//
            //Inicio//
            String stringUsuario = sc.next();
            char primerCaracter = stringUsuario.charAt(0);
            for (int i = 0; i < palabrausuario.length(); i++) {
                if (palabrausuario.charAt(i) == primerCaracter) {
                    palabraAdivinar[i] = primerCaracter;
                    letraencontrada = true;
                }
            }
            if (!letraencontrada) {
                intentos++;
            }
            System.out.println("Quieres adivinar la palabra?");
            System.out.println("1.Si//2.No");
            int eleccionmenu = sc.nextInt();

            switch (eleccionmenu) {
                case 1:
                    System.out.println("Cual crees que es la palabra");
                    sc.nextLine();
                    String palabraAdivinada = sc.nextLine();


                    if (palabraAdivinada.equals(palabrausuario)) {
                        ganado = true;
                        break;
                    } else {
                        System.out.println("Lo siento pero esa no es la palabra.");
                        break;
                    }

                case 2:
                    System.out.println("Continuemos pues");
                    break;
            }
            if (intentos == 1) {
                System.out.println("o\n");
            }
            if (intentos == 2) {
                System.out.println("o\n" +
                        "|\n"
                );
            }
            if (intentos == 3) {
                System.out.println(" o\n" +
                        "/|\n"
                );
            }
            if (intentos == 4) {
                System.out.println(" o\n" +
                        "/|\\\n"
                );
            }
            if (intentos == 5) {
                System.out.println(" o\n" +
                        "/|\\\n" +
                        "/ ");
            }
            if (intentos == 6) {
                System.out.println(" o\n" +
                        "/|\\\n" +
                        "/ \\");
                perdido = true;
            }

        } while(!ganado &&!perdido);
        if(ganado ==true)

        {
            System.out.println("-----HAS GANADO-----");
        } else if(perdido ==true)

        {
            System.out.println("-----HAS PERDIDO-----");
        }
    }

