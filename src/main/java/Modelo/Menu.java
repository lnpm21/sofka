package Modelo;

import java.util.Scanner;

public class Menu {

    private static final NaveTripulada naveTripulada = new NaveTripulada();
    private final NaveNoTripulada naveNoTripulada = new NaveNoTripulada();
    private final NaveLanzadera naveLanzadera = new NaveLanzadera();


    public static void primeraPreguntaCapacidad(){
        Caracteristicas caracteristicas = new Caracteristicas();
        Scanner capacidad = new Scanner(System.in);
        System.out.println("Bienvenido a la creacion de naves, siga el flujo y obtendrá su tipo de nave \n" +
                "Su nave transporte personas? seleccione 1 o 2 \n" +
                "1. Si \n" +
                "2. No" );
        int opcionSeleccionada = capacidad.nextInt();
        switch (opcionSeleccionada){
            case 1:
                naveTripulada.addEsTripulante(true);
                break;
            case 2:
                caracteristicas.capacidad();
                break;
            default:
                System.out.println("El valor ingresado no existe, intente de nuevo");
        }
    }

    public static void main(String[] args){
        primeraPreguntaCapacidad();
    }

}
