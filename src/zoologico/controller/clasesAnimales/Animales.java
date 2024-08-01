package zoologico.controller.clasesAnimales;


public abstract class Animales{
    String name;
    String clasificacion;
    String especie;
    String tipoAlimentacion;
    String habitat;

    public Animales(String name, String clasificacion, String especie, String tipoAlimentacion, String habitat) {
        this.name = name;
        this.clasificacion = clasificacion;
        this.especie = especie;
        this.tipoAlimentacion = tipoAlimentacion;
        this.habitat = habitat;
    }
    
    public abstract void alimentar();
}
