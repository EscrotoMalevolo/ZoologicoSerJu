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

    public String getName() {
        return name;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
    
    public abstract void alimentar();
}
