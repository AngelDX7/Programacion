package Tema4POO.Gestion_Cuentas;

import java.lang.module.FindException;

public class Persona {
        private String DNI;
        private Cuenta [] cuentas;

        Persona (){
            this.DNI = "0" ;
            this.cuentas = new Cuenta[3];
        }
        Persona (String DNI, int cantidadcuentas){
            this.DNI = DNI;
            this.cuentas = new Cuenta[cantidadcuentas];
        }
        Persona (String DNI){this.DNI = DNI; this.cuentas = new Cuenta[1];}
        public Cuenta[] getCuentas() {
            return cuentas;
        }
        public String getDNI() {
            return DNI;
        }

        public void setCuentas(int Indice, int numeroCuenta) {
            if (cuentas != null && Indice >= 0 && Indice < cuentas.length){
                cuentas [Indice] = new Cuenta(numeroCuenta);
            }
        }

        public void setDNI(String DNI) {
            this.DNI = DNI;
        }

        public void mascuentas (int cantidadcuentas){
            if (cantidadcuentas > 3 || cantidadcuentas< 0){
                System.out.println("Numero invalido de cuentas");
            } else {
                switch (cantidadcuentas){
                    case 1:
                        this.cuentas = new Cuenta[1];
                        break;
                    case 2:
                        this.cuentas = new Cuenta [2];
                        break;
                    case 3:
                        this.cuentas = new Cuenta [3];
                        break;
                }
            }
        }
        public void moroso (){
            for (Cuenta cuenta : cuentas){
                if (cuenta.getSaldo()<0){
                    System.out.println("Tienes saldo negativo en la cuenta numero " + cuenta.getNumero_cuenta());
                }
            }
        }
        public void transferencia (double cantidad, String DNI, int cuenta1, int cuenta2){
            Cuenta origen = null;
            Cuenta destino = null;
            if (cantidad<0){
                System.out.println("Intoduce una cantidad valida");
                return;
            }
            for (Cuenta cuenta : cuentas) {
                if (cuenta != null){
                    if (cuenta.getNumero_cuenta() == cuenta1){
                         origen = cuenta;
                    } else if ((cuenta.getNumero_cuenta() == cuenta2)){
                         destino = cuenta;
                    }
                    }
            } if (origen.getSaldo()<cantidad){
                System.out.println("Cuenta con saldo insuficiente");
                return;
            }
            origen.recibir_factura(cantidad);
            destino.recibir_abono(cantidad);

            System.out.println("Transferencia realizada con éxito.");
            System.out.println("Saldo actual en cuenta origen (" + cuenta1 + "): " + origen.getSaldo());
            System.out.println("Saldo actual en cuenta destino (" + cuenta2 + "): " + destino.getSaldo());

        }

    public void setCuentas(Cuenta[] cuentas) {
            this.cuentas =cuentas;
    }
}


