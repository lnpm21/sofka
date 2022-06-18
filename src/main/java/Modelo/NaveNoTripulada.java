package Modelo;

import java.util.Scanner;

public class NaveNoTripulada extends NavesEspaciales {

    public NaveNoTripulada() {
    }


    public void addCapacidad() {
        enFuncionamiento();
    }

    private void enFuncionamiento() {
        Scanner naveEnFuncion = new Scanner(System.in);
        System.out.println("La nave se encuentra activa? \n" +
                "1. Si \n" +
                "2. No ");
        int naveEnFuncionDigitada = naveEnFuncion.nextInt();
        switch (naveEnFuncionDigitada) {
            case 1:
                navesActivas();
                break;
            case 2:
                navesInactivas();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }

    private void navesInactivas() {
        Scanner naveEnFuncion = new Scanner(System.in);
        System.out.println("Escoga la potencia de la nave: \n" +
                "1. Alta \n" +
                "2. Media \n" +
                "3. Baja \n" +
                "4. Muy baja");
        int naveEnFuncionDigitada = naveEnFuncion.nextInt();
        switch (naveEnFuncionDigitada) {
            case 1:
                System.out.println("Su nave es la Sonda Galileo, destruida en la actualidad, poseía un empuje principal \n" +
                        "de 0,4 toneladas.");
                Menu.primeraPreguntaCapacidad();
                break;
            case 2:
                System.out.println("Su nave es Mariner X, orbita el sol. Fue la primera sonda en enviar imágenes de \n" +
                        "Mercurio después de sobrevolar Venus. ");
                Menu.primeraPreguntaCapacidad();
                break;
            case 3:
                Scanner destinoNave = new Scanner(System.in);
                System.out.println("Seleccione el destino de la nave \n" +
                        "1. Marte \n" +
                        "2. Venus ");
                int destinoNaveDigitada = destinoNave.nextInt();
                switch (destinoNaveDigitada) {
                    case 1:
                        System.out.println("Su nave es Vikingo I, la primera sonda en tocar Marte de forma controlada \n" +
                                "y enviar imágenes de la superficie. ");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    case 2:
                        System.out.println("Su nave es Mariner X, orbita el sol. Fue la primera sonda en enviar imágenes de \n" +
                                "Mercurio después de sobrevolar Venus. ");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    default:
                        System.out.println("Valor erroneo vuelva a intentar");
                        Menu.primeraPreguntaCapacidad();
                }
            case 4:
                System.out.println("Su nave es Helios, se trata de dos sondas pioneras pertenecientes a un proyecto \n" +
                        "emprendido por Alemania y EE.UU. con el objetivo de estudiar el sol. Constituyen los vehículos \n" +
                        "más veloces jamás construidos por el ser humano, 70,4 km/s. Actualmente orbitan sin energía alrededor del sol.");
                Menu.primeraPreguntaCapacidad();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }


    private void navesActivas() {
        Scanner empuje = new Scanner(System.in);
        System.out.println("De cuanto es el empuje de la nave?: \n" +
                "1. Menor a 100kg \n" +
                "2. Mayor a 100Kg" );
        int empujeDigitado = empuje.nextInt();
        switch (empujeDigitado) {
            case 1:
                empujeMenorACien();
                break;
            case 2:
                empujeMayorACien();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }

    private void empujeMayorACien() {
        Scanner empuje = new Scanner(System.in);
        System.out.println("Escoga la potencia de la nave: \n" +
                "1. Alta \n" +
                "2. Baja \n" +
                "3. Muy baja" );
        int empujeDigitado = empuje.nextInt();
        switch (empujeDigitado) {
            case 1:
                System.out.println("Su nave es el vehículo de transferencia automatizada (ATV) que sirve para abastecer, \n" +
                        "limpiar y regular periódicamente la elevación de la EEI.");
                Menu.primeraPreguntaCapacidad();
                break;
            case 2:
                System.out.println("Su nave es la sonda Viajero II, ahora flota activa en algún lugar del espacio \n" +
                        "exterior, fue la primera en alcanzar Urano y Neptuno.");
                Menu.primeraPreguntaCapacidad();
                break;
            case 3:
                System.out.println("Su nave es el robot sonda Curiosity, que se encuentra activo, con un empuje de 336,73 kg.");
                Menu.primeraPreguntaCapacidad();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }

    private void empujeMenorACien() {
        Scanner combustible = new Scanner(System.in);
        System.out.println("Escoga la potencia de la nave: \n" +
                "1. Alta \n" +
                "2. Madie \n" +
                "3. Baja" );
        int combustibleDigitado = combustible.nextInt();
        switch (combustibleDigitado) {
            case 1:
                System.out.println("Su nave es la sonda Cassini-Huygens. Emplea MMH y tetróxido de nitrógeno como \n" +
                        "combustible y tiene un empuje principal de 45,39 kg. Desplazándose a unos 18000 km/h tardó \n" +
                        "casi 7 años en llegar a Saturno.");
                Menu.primeraPreguntaCapacidad();
                break;
            case 2:
                Scanner peso = new Scanner(System.in);
                System.out.println("Seleccione que tipo de combustible usa la nave?: \n" +
                        "1. 258 Kg \n" +
                        "2. 1093 Kg \n" +
                        "3. No definido");
                int pesoDigitado = peso.nextInt();
                switch (pesoDigitado) {
                    case 1:
                        System.out.println("Su nave es Pionero X, la primera de la historia en llegar. Se desplaza \n" +
                                "inercialmente hacia la estrella Aldebarán. Se calcula que llegará dentro de 1,6 millones de años. ");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    case 2:
                        System.out.println("Su nave es la sonda Mensajero entró en la órbita mercuriana el 18 de marzo \n" +
                                "de 2011, la primera en lograrlo. Pesa 1093 kg y posee un empuje principal de 65,79 kg.");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    case 3:
                        System.out.println("Su nave es la sonda estadounidense New Horizons, destinada a explorar Plutón y sus lunas, \n" +
                                "llegó al semiplaneta el 14 de julio de 2015, gracias a 16 motores, 4 con un empuje de 0,44 kg, \n" +
                                "y 12 de 0,09 kg. Viajaba a unos 56000 km/h y tardó más de 9 años en llegar a su destino, \n" +
                                "aunque se espera que prosiga su viaje más allá del cinturón de Kuiper.");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    default:
                        System.out.println("Valor erroneo vuelva a intentar");
                        Menu.primeraPreguntaCapacidad();
                }
            case 3:
                System.out.println("Su nave es la Pionero XI, pesa 258 kg y tiene un empuje de 26 kg. Se desplaza sin \n" +
                        "energía de forma inercial. Se estima que llegará a la estrella Lambda dentro de 4 millones de años. ");
                Menu.primeraPreguntaCapacidad();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }

}