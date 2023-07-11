package structuralDesignPatterns.bridge.Killers;

import structuralDesignPatterns.bridge.Animals.Reptile;

public class Assasin extends Killer{
    public Assasin(String s){
        super(new Reptile(s));
    }

    void canHelpInAssasination(){
        //Fill it
        /**
         *  if uses.isVenomous == True .....
         */
    }
}