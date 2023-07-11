package structuralDesignPatterns.bridge.Killers;

import structuralDesignPatterns.bridge.Animals.Avian;

public class Butcher extends Killer {
    
    public Butcher(String s){
        super(new Avian(s));
    }

    void canEat(){
        /**
         *  if uses.is not poisonous .......
         */
    }
}
