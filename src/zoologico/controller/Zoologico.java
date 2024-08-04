package zoologico.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import zoologico.controller.clasesAnimales.Animales;
import zoologico.controller.clasesAnimales.Mamiferos;
import zoologico.controller.clasesAnimales.Reptiles;
import zoologico.controller.clasesAnimales.Voladores;
import zoologico.model.Db;
import zoologico.view.*;

/**
 *
 * @author Sergio Vanegas y Juan José Hernandez
 */
public class Zoologico{
    private static List<Jaulas> jaulas = new ArrayList<>();
    private static List<Animales> animales = new ArrayList<>();

    
    public static void main(String[] args) {
       Pantalla pantalla = new Pantalla();
       pantalla.setVisible(true);
       pantalla.setLocationRelativeTo(null);
       pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void CrearAnimalMamifero(String nombre, String especie, String tipAlim, String habitat){
        animales.add(new Mamiferos(nombre, "Mamifero", especie, tipAlim, habitat));
    }
    public static void CrearAnimalReptil(String nombre, String especie, String tipAlim, String habitat){
        animales.add(new Reptiles(nombre, "Reptil", especie, tipAlim, habitat));
    }
    public static void CrearAnimalVolador(String nombre, String especie, String tipAlim, String habitat){
        animales.add(new Voladores(nombre, "Volador", especie, tipAlim, habitat));
    }
    public static void CrearJaula(String nombre, String habitat, Integer code, List animales){
        jaulas.add(new Jaulas(nombre, habitat, code, animales));
    }
    
    public void JaulaDb() throws SQLException{
        
    }

    public static void setJaulas(Jaulas jaulas) {
        Zoologico.jaulas.add(jaulas);
    }

    public static List<Jaulas> getJaulas() {
        return jaulas;
    }

    public static List<Animales> getAnimales() {
        return animales;
    }
    
}
