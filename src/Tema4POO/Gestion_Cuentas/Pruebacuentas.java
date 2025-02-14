package Tema4POO.Gestion_Cuentas;

import java.util.Scanner;

public class Pruebacuentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("★ Bienvenido a el Banco NTETLJ ★");
            System.out.println("1. Instanciar objetos de tipo Persona, y las cuentas asociadas a el");
            System.out.println("2. Mostrar datos de una persona (por su DNI)");
            System.out.println("3. Recibir la nómina mensual de una persona (por DNI y núm de cuenta)");
            System.out.println("4. Recibir un pago (por DNI y núm de cuenta)");
            System.out.println("5. Realizar transferencia entre cuentas");
            System.out.println("6. Imprimir las personas morosas");
            System.out.println("7. Salir");
            System.out.println("8. QUE SIGNIFICA NTETLJ????");
            System.out.print("Seleccione una opción: ");


            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    if (persona1 == null) {
                        System.out.println("Inicie sesión en nuestro maravilloso banco");
                        System.out.println("Su DNI, por favor:");
                        String DNIu = sc.next();

                        if (DNIu.length() != 9) {
                            System.out.println("Introduzca un DNI válido, por favor.");
                            break;
                        }

                        persona1 = new Persona(DNIu);
                        System.out.println("Te has registrado correctamente");
                        System.out.println("Tu DNI se ha registrado como " + persona1.getDNI());

                        System.out.println("¿Cuántas cuentas quiere abrir?");
                        int cantidad_cuentas = sc.nextInt();

                        // Inicializar el array de cuentas correctamente
                        persona1.setCuentas(new Cuenta[cantidad_cuentas]);

                        // Asignar cada cuenta en el array
                        for (int i = 0; i < cantidad_cuentas; i++) {
                            persona1.getCuentas()[i] = new Cuenta(); // Crear una nueva cuenta en cada índice

                            System.out.println("¿Qué número le quieres asociar a la cuenta " + (i + 1) + "?");
                            int numero_asociado = sc.nextInt();
                            persona1.getCuentas()[i].setNumero_cuenta(numero_asociado);

                            System.out.println("¿Cuántos euros tienes en la cuenta " + (i + 1) + "?");
                            int saldoInicial = sc.nextInt();
                            persona1.getCuentas()[i].setSaldo(saldoInicial);

                            System.out.println(saldoInicial + "$ añadidos a la cuenta " + numero_asociado);
                        }
                    } else {
                        System.out.println("Ya has iniciado sesión.");
                    }
                    break;

                case 2:
                    System.out.println("Mostrador de datos. Introduzca su DNI para mostrar sus datos (Si muy seguro ya lo se)");
                    String mostradorDNI = sc.nextLine();
                    if (persona1 != null && mostradorDNI.equals(persona1.getDNI())) {
                        System.out.println("La persona con el DNI" + persona1.getDNI());
                        System.out.println("---TIENE...---");

                        for (Cuenta cuenta : persona1.getCuentas()) {
                            System.out.println("Cuenta:" + cuenta.getNumero_cuenta());
                            System.out.println("Saldo: " + cuenta.getSaldo() +"$");
                        }

                    }
                    break;
                case 3:
                    System.out.println("Introduce la cantiadad de la nomina que quieres ingresar:");
                    int cantidadnomina = sc.nextInt();
                    if (cantidadnomina < 0) {
                        System.out.println("Introduce un numero valido.");
                    }
                    sc.nextLine(); // saltador //
                    System.out.println("Introduce el DNI de la persona a la que le quieres ingresar la nomina");
                    String dnipersona = sc.nextLine();

                    System.out.println("Introduce el numero de la cuenta a la que se lo quieres ingresar:");
                    int numerocuenta = sc.nextInt();

                    if (dnipersona.equals(persona1.getDNI())) {
                        for (Cuenta cuenta : persona1.getCuentas()) {
                            if (cuenta.getNumero_cuenta() == numerocuenta) {
                                cuenta.recibir_abono(cantidadnomina);
                                System.out.println("Saldo actual " + cuenta.getSaldo() +"$");
                            }
                        }
                    }
                    break;
                case 4:

                    System.out.println("Introduce la cantiadad de del ingreso que quieres ingresar:");
                    int cantidadpago = sc.nextInt();
                    if (cantidadpago < 0) {
                        System.out.println("Introduce un numero valido.");
                    }
                    sc.nextLine(); // saltador //

                    System.out.println("Introduce el DNI de la persona a la que le quieres ingresar la nomina");
                    String dnipersona1 = sc.nextLine();

                    System.out.println("Introduce el numero de la cuenta a la que se lo quieres ingresar:");
                    int numerocuenta1 = sc.nextInt();

                    assert persona1 != null;
                    if (dnipersona1.equals(persona1.getDNI())) {
                        for (Cuenta cuenta : persona1.getCuentas()) {
                            if (cuenta.getNumero_cuenta() == numerocuenta1) {
                                cuenta.recibir_abono(cantidadpago);
                                System.out.println("Saldo actual" + cuenta.getSaldo());
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Introduce el DNI de la persona a la que le quieres ingresar la nomina");
                    String dni_persona_transferencia = sc.nextLine();
                    sc.nextLine(); // saltador //
                    System.out.println("Cual es tu numero de cuenta");
                    int numero1 = sc.nextInt();
                    System.out.println("Numero de la cuenta a la persona que le quieres ingresar el dinero");
                    int numero2 = sc.nextInt();
                    System.out.println("Cuanto quieres transferir?");
                    double tranferencia = sc.nextDouble();
                    if (persona1 != null) {
                        persona1.transferencia(tranferencia, dni_persona_transferencia, numero1, numero2);
                    }
                    break;
                case 6:
                    if (persona1 != null) {
                        persona1.moroso();
                    }
                    break;
                case 7:
                    System.out.println("Pos nada adios :(");
                    salir = true;
                    break;
                case 8:
                    System.out.println("es mu secreto pero te lo digo");
                    System.out.println("NO");
                    System.out.println("TE");
                    System.out.println("ESTAFAMOS");
                    System.out.println("TE");
                    System.out.println("LO");
                    System.out.println("JURO");
                    break;
            }
        }
    }
}
