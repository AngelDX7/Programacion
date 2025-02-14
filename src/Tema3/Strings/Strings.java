package Tema3.Strings;

public class Strings {public static void palabraMayorLongitud(String string) {
    String[] palabras = string.split(" ");
    String palabrafinal = "";
    for (String palabra : palabras) {
        if (palabra.length() > palabrafinal.length()) {
            palabrafinal = palabra;
        }
    }
    System.out.println(palabrafinal);
}

    public static int cuantasPalabrasSeRepiten(String string, String string1) {
        String[] palabras = string.split(" ");
        String[] palabras1 = string.split(" ");
        int con = 0;
        for (String palabra : palabras) {
            for (String palabra1 : palabras1) {
                if (palabra.equals(palabra1)) {
                    con++;
                }

            }
        }
        return con;
    }

    public static int contadorPalabras(String string) {
        String[] palabras = string.split(" ");
        int contadorpalabras = 0;
        for (String palabra : palabras) {
            contadorpalabras++;
        }
        return contadorpalabras;
    }

    public static void transformadorSrtring(String string) {
        if (string.length() != 11) {
            System.out.println("Introduce un numero de 11 digitos");
        }
        String pais = string.substring(0, 2);
        String primeros = string.substring(2, 5);
        String ultimos = string.substring(5);

        System.out.println("+" + pais + "-" + primeros + "-" + ultimos);
    }

    public static void contadorVocales(String string) {
        String estrella = "*";
        string = string.toLowerCase();
        int contadora = 0, contadore = 0, contadori = 0, contadoro = 0, contadoru = 0;
        for (char n : string.toCharArray()) {
            if (n == 'a') {
                contadora++;
            }
            if (n == 'e') {
                contadore++;
            }
            if (n == 'i') {
                contadori++;
            }
            if (n == 'o') {
                contadoro++;
            }
            if (n == 'u') {
                contadoru++;
            }
        }
        System.out.println("a"+contadora+" "+"*".repeat(contadora));
        System.out.println("e"+contadore+" "+"*".repeat(contadore));
        System.out.println("i"+contadori+" "+"*".repeat(contadori));
        System.out.println("o"+contadoro+" "+"*".repeat(contadoro));
        System.out.println("u"+contadoru+" "+"*".repeat(contadoru));
    }
}

