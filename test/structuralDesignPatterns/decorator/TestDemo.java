import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import structuralDesignPatterns.decorator.chocolates.DarkChocolate;
import structuralDesignPatterns.decorator.companys.DairyMilk;
import structuralDesignPatterns.decorator.companys.Nesle;


public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Structural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","decorator/wrapper design pattern");
        List<Integer> c = new ArrayList<Integer>();
        Collections.addAll(c,2,4,6); 
        DarkChocolate d = new DarkChocolate(c);
        DairyMilk dm = new DairyMilk(d);
        dm.getComposition();
        Nesle n = new Nesle(d);
        n.getComposition();
        
        System.out.println("================................ end of testing\n");
    }
}
