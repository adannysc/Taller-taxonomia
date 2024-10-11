
package Objetos;

public class Canidos extends Animal{
    public Canidos(String sonidos, String alimentos, String habitat,
            String nombreCie, String nombre) {
        super(sonidos, alimentos, habitat, nombreCie, nombre);
    }

    @Override
    public String getSonidos() {
        if (nombreCie == "Canis lupus") {
            sonidos = "Aullido";
            System.out.println("El sonido es = " + sonidos);
        } else if (nombreCie == "Canis lupus familiaris"){
            sonidos = "Ladrido";
            System.out.println("El sonido es = " + sonidos);
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }

    @Override
    public String getAlimentos() {
        if (nombreCie == "Canis lupus") {
            alimentos = "Carnivoro";
            System.out.println("Alimentos = " + alimentos);
        } else if (nombreCie == "Canis lupus familiaris"){
            alimentos = "Carnivoro";
            System.out.println("Alimentos = " + alimentos);
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }

    @Override
    public String getHabitat() {
        if (nombreCie == "Canis lupus") {
            habitat = "Bosque";
            System.out.println("El habitat del animal es = " + habitat);
        } else if (nombreCie == "Canis lupus familiaris"){
            habitat = "Doméstico";
            System.out.println("El habitat del animal es = " + habitat);
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }

    @Override
    public String getNombreCie() {      
        if (nombre == "lobo") {
            nombreCie = "Canis lupus";
            System.out.println("Canis lupus");
        } else if (nombre == "perro"){
            nombreCie = "Canis lupus familiaris";
            System.out.println("Canis lupus familiaris");
        } else {
            System.out.println("Este animal no esta registrado");
        }
        return null;
    }    
}
