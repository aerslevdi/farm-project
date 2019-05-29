import java.util.List;
import java.util.Scanner;

public class FarmManager {
    private List<Animal> animales;

    //CONSTRUCTOR

    //METHODS

    public void listarAnimal(String animal){
        Animal findAnimal = null;
        for (Animal query : animales) {
            if (query.getName().equals(animal)) {
                query.toString();
            }
        }

    }

    public void listarAnimales(){
        Animal query = null;
        for (Animal animal : animales) {
            System.out.println(animal.toString());
        }

    }

    public void agregarAnimal(String name, String animal){

        switch(animal){
            case "Gallina":
                Gallina gallina = new Gallina(name);
                animales.add(gallina);
            case "Vaca" :
                Vaca vaca = new Vaca(name);
                animales.add(vaca);
            case "Caballo" :
                Caballo caballo = new Caballo(name);
                animales.add(caballo);
        }

    }

    public void alimentarAnimal(String name){
        Animal alimentarAnimal = null;
        for (Animal animal : animales) {
            if (animal.getName().equals(name)) {
                animal.comer();
            }
        }

    }

    public void alimentarAnimales(){}
    public void jugarAnimal(String animal){
    }
    public void jugarAnimales(){}
    public void descansarAnimal(String Animal){}
    public void descansarAnimales(){}

}
