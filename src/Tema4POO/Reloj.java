package Tema4POO;

public class Reloj {
    public class reloj {
        //Atributos//
        public int hora;
        public int minutos;
        public int segundos;

        public reloj() {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;

        }

        public reloj(int hora, int minutos, int segundos) {
            setHora(hora);
            setMinutos(minutos);
            setSegundos(segundos);
        }

        public int getHora() {
            return hora;
        }

        public int getMinutos() {
            return minutos;
        }

        public int getSegundos() {
            return segundos;
        }

        public void setHora(int hora) {
            if (hora < 0 || hora >= 24) {
                System.out.println("Hora invalida, introduce un numero entre 0 y 23. Numero introducido" + hora);
            } else {
                this.hora = hora;
            }
        }

        public void setMinutos(int minutos) {
            if (minutos < 0 || minutos >= 60) {
                System.out.println("Minutos invalidos, introduce un numero entre 0 y 59. Numero introducido" + minutos);
            } else {
                this.minutos = minutos;
            }
        }

        public void setSegundos(int segundos) {
            if (segundos < 0 || segundos >= 60) {
                System.out.println("Segundos invalidos, introduce un numero entre 0 y 59. Numero introducido" + segundos);
            } else {
                this.segundos = segundos;
            }
        }

        public void mostrarHora() {
            System.out.println("La hora es" + hora + ":" + minutos + ":" + segundos);
        }

    }
}