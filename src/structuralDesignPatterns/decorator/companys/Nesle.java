package structuralDesignPatterns.decorator.companys;

import java.util.ArrayList;

import structuralDesignPatterns.decorator.chocolates.Chocolate;

public class Nesle implements Chocolate {
    
    private Chocolate chocolate;

    public Nesle(Chocolate c){
        this.chocolate = c;
    }

    public ArrayList<Integer>  getComposition(){
        ArrayList<String> contents = chocolate.getContents();
        ArrayList<Integer> composition = chocolate.getComposition();
        int l = contents.size();
        System.out.println("Composition of Nesle cocolate");
        for (int i = 0; i < l; i++) {
            System.out.printf("%s :: %d\n",contents.get(i),composition.get(i)); 
        }
        return composition;
    }

    public ArrayList<String> getContents() {
        return chocolate.getContents();
    }
}
