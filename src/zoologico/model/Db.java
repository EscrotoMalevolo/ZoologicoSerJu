package zoologico.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import zoologico.controller.Jaulas;
import zoologico.controller.clasesAnimales.Animales;
import zoologico.controller.clasesAnimales.Mamiferos;
import zoologico.controller.clasesAnimales.Reptiles;
import zoologico.controller.clasesAnimales.Voladores;
public class Db {
    
    private Connection getConnection() throws SQLException {
        String driver ="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
    
    public void guardarJaula(Jaulas jaula) throws SQLException {
        String insertJaulaSQL = "INSERT INTO Jaula (codigoJaula, nombreJaula, habitatJaula) VALUES (?, ?, ?)";
        String insertAnimalSQL = "INSERT INTO Animal (especie, nombre, clasificacion, habitat, jaulaCodigo) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection connection = getConnection()) {
            // Guardar Jaula
            try (PreparedStatement jaulaStmt = connection.prepareStatement(insertJaulaSQL)) {
                jaulaStmt.setInt(1, jaula.getNumJaula());
                jaulaStmt.setString(2, jaula.getNombreJaula());
                jaulaStmt.setString(3, jaula.getAmbienteJaula());
                jaulaStmt.executeUpdate();
            }
            
            // Guardar Animales
            try (PreparedStatement animalStmt = connection.prepareStatement(insertAnimalSQL)) {
                for (Animales animal : jaula.getTamJaula()) {
                    animalStmt.setString(1, animal.getEspecie());
                    animalStmt.setString(2, animal.getName());
                    animalStmt.setString(3, animal.getClasificacion());
                    animalStmt.setString(4, animal.getHabitat());
                    animalStmt.setInt(5, jaula.getNumJaula());
                    animalStmt.executeUpdate();
                }
            }
        }
    }
    
    public Jaulas obtenerJaula(int codigoJaula) throws SQLException {
        String selectJaulaSQL = "SELECT * FROM Jaula WHERE codigoJaula = ?";
        String selectAnimalesSQL = "SELECT * FROM Animal WHERE jaulaCodigo = ?";
        Jaulas jaula = null;
        try (Connection connection = getConnection()) {
            // Obtener Jaula
            try (PreparedStatement jaulaStmt = connection.prepareStatement(selectJaulaSQL)) {
                jaulaStmt.setInt(1, codigoJaula);
                ResultSet rs = jaulaStmt.executeQuery();
                if (rs.next()) {
                    String nombreJaula = rs.getString("nombreJaula");
                    String habitatJaula = rs.getString("habitatJaula");
                    jaula = new Jaulas(nombreJaula, habitatJaula, codigoJaula, new ArrayList<>());
                }
            }

            // Obtener Animales
            if (jaula != null) {
                try (PreparedStatement animalesStmt = connection.prepareStatement(selectAnimalesSQL)) {
                    animalesStmt.setInt(1, codigoJaula);
                    ResultSet rs = animalesStmt.executeQuery();
                    while (rs.next()) {
                        String especie = rs.getString("especie");
                        String nombre = rs.getString("nombre");
                        String clasificacion = rs.getString("clasificacion");
                        String habitat = rs.getString("habitat");
                        if(clasificacion.equals("Mamifero")){
                            Mamiferos mamifero = new Mamiferos(nombre, clasificacion, especie, "Se alimenta normal", habitat);
                            jaula.getTamJaula().add(mamifero);
                        }else if(clasificacion.equals("Reptil")){
                            Reptiles reptil = new Reptiles(nombre, clasificacion, especie, "Se alimenta normal", habitat);
                            jaula.getTamJaula().add(reptil);
                        }else{
                            Voladores volador = new Voladores(nombre, clasificacion, especie, "Se alimenta normal", habitat);
                            jaula.getTamJaula().add(volador);
                        }
                        
                    }
                }
            }
        }
        return jaula;
    }
    
}
