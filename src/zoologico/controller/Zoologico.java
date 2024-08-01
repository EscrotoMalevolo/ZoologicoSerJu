package zoologico.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import zoologico.controller.clasesAnimales.Animales;
import zoologico.controller.clasesAnimales.Mamiferos;
import zoologico.controller.clasesAnimales.Reptiles;
import zoologico.controller.clasesAnimales.Voladores;
import zoologico.view.*;

/**
 *
 * @author Sergio Vanegas y Juan José Hernandez
 */
public class Zoologico{
    private static List<Jaulas> jaulas = new ArrayList<>();
    private static List<Animales> animales = new ArrayList<>();
    public static Mamiferos mamifero;
    private static Reptiles reptiles;
    private static Voladores voladores;

    public static void main(String[] args) {
       Pantalla pantalla = new Pantalla();
       pantalla.setVisible(true);
       pantalla.setLocationRelativeTo(null);
       pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void CrearAnimalMamifero(String nombre, String especie, String tipAlim, String habitat, String fechaParto){
        animales.add(new Mamiferos(nombre, "Mamifero", especie, tipAlim, habitat, fechaParto));
    }
    public static void CrearAnimalReptil(String nombre, String especie, String tipAlim, String habitat, String fechaParto){
        animales.add(new Reptiles(nombre, "Reptil", especie, tipAlim, habitat, fechaParto));
    }
    public static void CrearAnimalVolador(String nombre, String especie, String tipAlim, String habitat, String fechaParto){
        animales.add(new Voladores(nombre, "Volador", especie, tipAlim, habitat, fechaParto));
    }
}
