
package Objetos;

public abstract class Animal {
    
    protected String sonidos;
    protected String alimentos;
    protected String habitat;
    protected String nombreCie;
    protected String nombre;

    public Animal(String sonidos, String alimentos, String habitat,
            String nombreCie, String nombre) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCie = nombreCie;
        this.nombre = nombre;
    }
    
    public abstract String getSonidos();
    
    public abstract String getAlimentos();
    
    public abstract String getHabitat();
    
    public abstract String getNombreCie();
        
}
