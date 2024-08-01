package zoologico.controller.clasesAnimales;
/**
 *
 * @author juan_
 */
public class Voladores extends Animales{
    
    private String fechaEclosion;

    public Voladores(String name, String clasificacion, String especie, String tipoAlimentacion, String habitat, String fechaEclosion) {
        super(name, clasificacion, especie, tipoAlimentacion, habitat);
        this.fechaEclosion = fechaEclosion;
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
