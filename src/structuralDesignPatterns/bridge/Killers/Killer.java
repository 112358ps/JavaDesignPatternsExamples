package structuralDesignPatterns.bridge.Killers;

import structuralDesignPatterns.bridge.Animals.*;

public class Killer {
    Animal uses;
    public Killer(Animal uses){
        this.uses = uses;
    }
}
