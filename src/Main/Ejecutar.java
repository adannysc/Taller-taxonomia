
package Main;

import Objetos.Canidos;
import Objetos.Felinos;

public class Ejecutar {
    public static void main(String[] args) {
        Felinos fenilo_1 = new Felinos(null, null, null, null, "gato");
        
        fenilo_1.getNombreCie();
        fenilo_1.getSonidos();
        fenilo_1.getAlimentos();
        fenilo_1.getHabitat();
        

        
        Felinos felino_2 = new Felinos(null, null, null, null, "leon");
        
        felino_2.getNombreCie();
        felino_2.getSonidos();
        felino_2.getAlimentos();
        felino_2.getHabitat();
        

        
        Canidos canido_1 = new Canidos(null, null, null, null, "perro");
        
        canido_1.getNombreCie();
        canido_1.getSonidos();
        canido_1.getAlimentos();
        canido_1.getHabitat();
        
  
        
        Canidos canido_2 = new Canidos(null, null, null, null, "lobo");
        
        canido_2.getNombreCie();
        canido_2.getSonidos();
        canido_2.getAlimentos();
        canido_2.getHabitat();
        

    }   
    
}
