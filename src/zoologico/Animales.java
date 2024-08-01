package zoologico;


public class Animales extends Zoo{
    
    String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double cantar(double num){
        
        double canto = Math.sqrt(num);
        System.out.println("Animales cantando..." + canto);
        
        return canto;
    }
    
}
