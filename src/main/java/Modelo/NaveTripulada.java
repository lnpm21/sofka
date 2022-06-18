package Modelo;

import java.util.Scanner;

public class NaveTripulada extends NavesEspaciales {

    public NaveTripulada() {
    }

    public void addEsTripulante(boolean b) {
        pesoNave();
    }

    public void pesoNave() {
        Scanner capacidadPersonas = new Scanner(System.in);
        System.out.println("De cuantas personas tiene capacidad la nave?: \n" +
                "1. 3 personas \n" +
                "2. 7 personas");
        int capacidadPersonasDigitada = capacidadPersonas.nextInt();
        switch (capacidadPersonasDigitada) {
            case 1:
                Scanner peso = new Scanner(System.in);
                System.out.println("Cuanto pesa la nave?: \n" +
                        "1. 77 toneladas \n" +
                        "2. 19,8 toneladas");
                int pesoDigitado = peso.nextInt();
                switch (pesoDigitado) {
                    case 1:
                        System.out.println("Su nave es Skylab, actualmente destruido, pesaba 77 toneladas, \n" +
                                "orbitaba a 435 km y tiene una capacidad de 3 personas.");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    case 2:
                        System.out.println("Su nave es Salyut, actualmente destruido, pesaba 19,8 toneladas \n" +
                                "y orbitaba a una media de 248,9 km de distancia sobre la superficie terrestre \n" +
                                "y tiene una capacidad para 3 personas. ");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    default:
                        System.out.println("Valor erroneo vuelva a intentar");
                        Menu.primeraPreguntaCapacidad();
                }
            case 2:
                System.out.println("Su nave es la Estación Espacial Internacional con una cacidad para siete \n" +
                        " personas, con 420 toneladas de peso y orbitando a 386 km de distancia.");
                Menu.primeraPreguntaCapacidad();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }
}
