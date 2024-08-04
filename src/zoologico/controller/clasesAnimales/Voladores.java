package zoologico.controller.clasesAnimales;
/**
 *
 * @author juan_
 */
public class Voladores extends Animales{
    
    private String tipoEclosion;

    public Voladores(String name, String clasificacion, String especie, String tipoAlimentacion, String habitat) {
        super(name, clasificacion, especie, tipoAlimentacion, habitat);
        this.tipoEclosion = "Eclosion normal saliendo de un huevo";
    }

    public void setFechaEclosion(String tipoEclosion) {
        this.tipoEclosion = tipoEclosion;
    }

    public String getFechaEclosion() {
        return tipoEclosion;
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
