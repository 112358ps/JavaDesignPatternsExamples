package creationalDesignPatterns.abstractFactory.productClasses;
import creationalDesignPatterns.abstractFactory.productIterfaces.CoffeeTable;

public class ModernCTable implements CoffeeTable {
    public String getModel(){
        return "ModernCTable::0x123";
    }
    
    public boolean hasLegs(){
        return false;
    }

    public int maxWeight(){
        return 100;
    }
}
