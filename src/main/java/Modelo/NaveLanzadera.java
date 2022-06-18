package Modelo;

import java.util.Scanner;

public class NaveLanzadera extends NavesEspaciales {


    public NaveLanzadera() {
    }


    public void addCapacidad() {
        potenciaNave();
    }

    private void potenciaNave() {
        Scanner potenciaNave = new Scanner(System.in);
        System.out.println("Digite el numero segun la potencia de la nave: \n" +
                "1. Muy alta \n" +
                "2. Alta \n" +
                "3. Media \n" +
                "4. Baja ");
        int potenciaNaveDigitada = potenciaNave.nextInt();
        switch (potenciaNaveDigitada) {
            case 1:
                System.out.println("Su nave es Saturno V. Una nave de 3500 toneladas de empuje y 2900 toneladas  \n" +
                        "de peso, capaz de transportar 118 toneladas en órbita baja terrestre, se encuentra inactiva, \n" +
                        "Tiene más de 100 metros de altura y una potencia de 32000×5 caballos, permitió transportar \n" +
                        "la nave tripulada Apolo hasta la Luna.");
                Menu.primeraPreguntaCapacidad();
                break;
            case 2:
                System.out.println("Su nave es El lanzador Energía, lo retiraron un año despues de su inauguracion, \n" +
                        "medía 60 metros, pesaba 2400 toneladas, podía transportar 100 toneladas, y tenía un empuje de \n" +
                        "3060 toneladas.");
                Menu.primeraPreguntaCapacidad();
                break;
            case 3:
                Scanner combustible = new Scanner(System.in);
                System.out.println("Seleccione que tipo de combustible usa la nave?: \n" +
                        "1. Solido y liquido \n" +
                        "2. Liquido");
                int combustibleDigitado = combustible.nextInt();
                switch (combustibleDigitado) {
                    case 1:
                        System.out.println("Su nave es El Delta IV norteamericano es de los principales vehículos \n" +
                                "autopropulsados que se utilizan en la actualidad para poner satélites y componentes \n" +
                                "de la EEI en órbita.");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    case 2:
                        System.out.println("Su nave es el Protón ruso representan un de los dos principales vehículos\n" +
                                " autopropulsados que se utilizan en la actualidad para poner satélites y componentes \n" +
                                "de la EEI en órbita.");
                        Menu.primeraPreguntaCapacidad();
                        break;
                    default:
                        System.out.println("Valor erroneo vuelva a intentar");
                        Menu.primeraPreguntaCapacidad();
                }
            case 4:
                System.out.println("Su nave es la lanzadera espacial Falcon IX, al parecer construida en EE.UU, con \n" +
                        "un mecanismo de propulsión electromagnética adicional para cuando envíen al espacio la más \n" +
                        "novedosa de sus naves tripuladas, Dragón V2.");
                Menu.primeraPreguntaCapacidad();
                break;
            default:
                System.out.println("Valor erroneo vuelva a intentar");
                Menu.primeraPreguntaCapacidad();
        }
    }

}
