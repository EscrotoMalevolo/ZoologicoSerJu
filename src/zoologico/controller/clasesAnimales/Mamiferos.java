package zoologico.controller.clasesAnimales;
/**
 *
 * @author juan_
 */
public class Mamiferos extends Animales{

    private String tipoParto;
    
    public Mamiferos(String name, String clasificacion, String especie, String tipoAlimentacion, String habitat) {
        super(name, clasificacion, especie, tipoAlimentacion, habitat);
        this.tipoParto= "Parto natural saliendo de la pansa de la mamá";
    }

    public String getFechaParto() {
        return tipoParto;
    }
    
    public void setFechaParto(String fechaParto) {
        this.tipoParto = fechaParto;
    }
    
    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
