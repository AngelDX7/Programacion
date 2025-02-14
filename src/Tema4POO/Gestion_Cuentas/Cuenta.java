package Tema4POO.Gestion_Cuentas;

public class Cuenta {
        private int numero_cuenta;
        private double saldo;

        public Cuenta (){
            this.numero_cuenta = 0;
            this.saldo = 0;
        }
        public Cuenta(int numero_cuenta){
            this.numero_cuenta = numero_cuenta;
            this.saldo = 0;
        }
        public Cuenta (int numero_cuenta , double saldo){
            this.numero_cuenta = numero_cuenta;
            this.saldo = saldo;
        }
        public Cuenta ( double saldo){
            this.numero_cuenta = 0;
            this.saldo = saldo;
        }

        // Setters y getters//
        public double getSaldo() {
            return saldo;
        }
        public int getNumero_cuenta() {
            return numero_cuenta;
        }
        public void setSaldo (double saldo){
            this.saldo = saldo;
        }
        public void setNumero_cuenta (int numero_cuenta){
            this.numero_cuenta = numero_cuenta;
        }
        // Abono y factura//
        public void recibir_abono (double cantidad){
            this.saldo = this.saldo + (cantidad);
        }
        public void recibir_factura (double cantidad){
            this.saldo = this.saldo - (cantidad);
        }
    }


