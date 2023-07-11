package structuralDesignPatterns.bridge.Animals;

public class Animal {
    
    private String species;
    private boolean isCarnivorus = false;

    public Animal(String species, boolean isCarnivorus){
        this.species = species;
        this.isCarnivorus = isCarnivorus;
    }

    String getSpecies(){
        return species;
    }

    boolean isCarnivorus(){
        return isCarnivorus;
    }
}
