package Modelo;

import java.nio.channels.Pipe;
import java.util.Date;

public class NavesEspaciales {
    private int peso;
    private boolean esTripulante;
    private int empuje;
    private String potencia;
    private String combustible;
    private int capacidad;

    public NavesEspaciales(int peso, String potencia, int empuje, String combustible) {
    }

    public NavesEspaciales(int peso, String potencia, int empuje, String combustible, boolean esTripulante) {
    }
    public NavesEspaciales( String nombre, String paisOrigen, Date fechaLanzamiento,
                            boolean enFuncionamiento) {
        nombre="";
        paisOrigen="";
        enFuncionamiento= false;
    }

    public NavesEspaciales() {

    }


}
