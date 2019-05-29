public class Vaca extends Animal {
    //ATRIBUTOS
    private String name;

    //CONSTRUCTOR
    public Vaca(String name) {
        super(name);
    }

    //GETTER/SETTER


    //METHODS
    @Override
    public void comer() {
        Integer hunger = getHambre();
        if(hunger < 22) {
            hunger -= 23;
            setHambre(hunger);
        }
    }

    @Override
    public void jugar() {
        Integer hunger = getHambre();
        Integer energy = getEnergia();
        if(energy >= 30 && hunger <= 25) {
            hunger += 20;
            energy -= 15;
            setEnergia(energy);
            setHambre(hunger);
        }
    }
}
