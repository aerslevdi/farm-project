public class Caballo extends Animal {
    //ATRIBUTOS
    private String name;

    //CONSTRUCTOR
    public Caballo(String name) {
        super(name);
    }

    //METHODS

    @Override
    public void comer() {
        Integer hunger = getHambre();
        if (hunger > 39) {
            hunger -= 40;
            setHambre(hunger);
        }
    }

    @Override
    public void jugar() {
        Integer hunger = getHambre();
        Integer energy = getEnergia();
        if(hunger<=25 && energy >=50){
        hunger += 33;
        energy -=  12;
        setEnergia(energy);
        setHambre(hunger);
        }
    }
}