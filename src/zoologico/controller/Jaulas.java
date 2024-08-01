package zoologico.controller;

import zoologico.controller.clasesAnimales.Animales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan_
 */
public class Jaulas {
    private String nombreJaula;
    private String ambienteJaula;
    private Integer numJaula;
    private List<Animales> tamJaula;

    public Jaulas(String nombreJaula, String ambienteJaula, Integer numJaula, List<Animales> tamJaula) {
        this.nombreJaula = nombreJaula;
        this.ambienteJaula = ambienteJaula;
        this.numJaula = numJaula;
        this.tamJaula = tamJaula;
    }

    public String getNombreJaula() {
        return nombreJaula;
    }

    public String getAmbienteJaula() {
        return ambienteJaula;
    }

    public Integer getNumJaula() {
        return numJaula;
    }

    public List<Animales> getTamJaula() {
        return tamJaula;
    }
    
    public void enajular(){}
}
