package zoologico.controller.clasesAnimales;

/**
 *
 * @author juan_
 */
public class Reptiles extends Animales{
    
    private String tipoEclosion; 

    public Reptiles(String name, String clasificacion, String especie, String tipoAlimentacion, String habitat) {
        super(name, clasificacion, especie, tipoAlimentacion, habitat);
        this.tipoEclosion = "Eclosión normal por nacimiento de un huevo";
    }

    public String getFechaEclosion() {
        return tipoEclosion;
    }

    public void setFechaEclosion(String fechaEclosion) {
        this.tipoEclosion = fechaEclosion;
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
