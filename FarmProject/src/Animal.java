public abstract class Animal {
    //ATRIBUTOS
    private String name;
    private Integer energia;
    private Integer hambre;

    //CONSTRUCTOR

    public Animal(String name) {
        this.name = name;
        energia = 100;
        hambre = 0;
    }

    //GETTER/SETTER


    public Integer getEnergia() {
        return energia;
    }

    public Integer getHambre() {
        return hambre;
    }

    public String getName() {
        return name;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public void setHambre(Integer hambre) {
        this.hambre = hambre;
    }

    //METODOS
    public void comer(){}

    public void jugar(){}

    public void descansar(){
        energia = 100;
        hambre = hambre + 35;
    }

    @Override
    public boolean equals(Object obj) {
        Animal sameAnimal = (Animal) obj;
         return this.name.equals((sameAnimal.name));
    }

    @Override
    public String toString() {
        System.out.println("Nombre: "+ name + " Hambre: " + hambre + " Energia: " + energia);
        return ("Nombre: "+ name + " Hambre: " + hambre + " Energia: " + energia);
    }
}
