package Modelo;

import java.util.Scanner;


public class Caracteristicas {

    private NaveNoTripulada naveNoTripulada = new NaveNoTripulada();
    private NaveLanzadera naveLanzadera = new NaveLanzadera();
    private Menu menu = new Menu();

    public Caracteristicas() {
    }

    public void capacidad() {
        Scanner capacidad = new Scanner(System.in);
        System.out.println("De cuanto es la capacidad de la nave? digite el valor en kg: \n");
        int capacidadDigitada = capacidad.nextInt();
        try {
            if (capacidadDigitada < 100000) {
                naveNoTripulada.addCapacidad();
            } else if (capacidadDigitada > 100000) {
                naveLanzadera.addCapacidad();
            }else {
                System.out.println("El valor digitado es incorrecto intente de nuevo");
                menu.primeraPreguntaCapacidad();
            }
        } catch (
                Exception e) {
            System.out.println("Ha ocurrido un error");
        }

    }



}
