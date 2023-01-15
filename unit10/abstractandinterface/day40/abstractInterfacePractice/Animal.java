package unit10.abstractandinterface.day40.abstractInterfacePractice;

public abstract class Animal {
    private String species;

    /*constructor*/
    public Animal(String species) {
        this.species = species;
    }

    /*non-abstract method*/
    public void breathe(){
        System.out.println("Breathe in, Breathe out.");
    }

    public String getSpecies() {
        return species;
    }

    /*abstract method*/
    public abstract void animalSound();

}
