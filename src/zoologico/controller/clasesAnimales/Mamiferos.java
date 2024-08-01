package zoologico.controller.clasesAnimales;
/**
 *
 * @author juan_
 */
public class Mamiferos extends Animales{

    private String fechaParto;
    
    public Mamiferos(String name, String clasificacion, String especie, String tipoAlimentacion, String habitat, String fechaParto) {
        super(name, clasificacion, especie, tipoAlimentacion, habitat);
        this.fechaParto= fechaParto;
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
