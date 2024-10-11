
package Objetos;

public class Felinos extends Animal{
    public Felinos(String sonidos, String alimentos, String habitat,
            String nombreCie, String nombre) {
        super(sonidos, alimentos, habitat, nombreCie, nombre);
    }

    @Override
    public String getSonidos() {
        if (nombreCie == "Panthera leo") {
            sonidos = "Rugido";
            System.out.println("El sonido es = " + sonidos);
        } else if (nombreCie == "Felis silvestris catus"){
            sonidos = "Maullido";
            System.out.println("El sonido es = " + sonidos);
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }

    @Override
    public String getAlimentos() {
        if (nombreCie == "Panthera leo") {
            alimentos = "Carnivoro";
            System.out.println("Alimentos = " + alimentos);
        } else if (nombreCie == "Felis silvestris catus"){
            alimentos = "Ratones";
            System.out.println("Alimentos = " + alimentos);
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }

    @Override
    public String getHabitat() {
        if (nombreCie == "Panthera leo") {
            habitat = "Pradera";
            System.out.println("El habitat del animal es = " + habitat);
        } else if (nombreCie == "Felis silvestris catus"){
            habitat = "Doméstico";
            System.out.println("El habitat del animal es = " + habitat);
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }

    @Override
    public String getNombreCie() {      
        if (nombre == "leon") {
            nombreCie = "Panthera leo";
            System.out.println("Panthera leo");
        } else if (nombre == "gato"){
            nombreCie = "Felis silvestris catus";
            System.out.println("Felis silvestris catus");
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }    
    
}
