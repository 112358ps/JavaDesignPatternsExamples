package structuralDesignPatterns.decorator.chocolates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DarkChocolate implements Chocolate {

    final private static ArrayList<String> contents = 
        new ArrayList<String>(Arrays.asList("Nutmeg", "Coca", "coffeebeans"));

    final private ArrayList<Integer> composition; // [1,2,3]

    public DarkChocolate(List<Integer> c){
        composition = new ArrayList<>(c);
    }

    public ArrayList<String> getContents() {
        return DarkChocolate.contents;
    }

    public ArrayList<Integer> getComposition() {
        return composition;
    }
}
