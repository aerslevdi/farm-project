public class Gallina extends Animal {

    //ATRIBUTOS
    private String name;

    //CONSTRUCTOR
    public Gallina(String name) {
        super(name);
    }

    //METHODS
    @Override
    public void comer() {

        Integer hunger = getHambre();
        if (hunger > 29) {
            hunger -= 30;
            setHambre(hunger);
        }
    }

    @Override
    public void jugar() {
        Integer hunger = getHambre();
        Integer energy = getEnergia();
        if (energy >= 20 && hunger<= 40) {
            hunger += 33;
            energy -= 12;
            setEnergia(energy);
            setHambre(hunger);
        }
    }
}
