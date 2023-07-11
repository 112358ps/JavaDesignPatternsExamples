package creationalDesignPatterns.abstractFactory;

import creationalDesignPatterns.abstractFactory.productClasses.ModernChair;
import creationalDesignPatterns.abstractFactory.productIterfaces.Chair;
import creationalDesignPatterns.abstractFactory.productClasses.ModernCTable;
import creationalDesignPatterns.abstractFactory.productIterfaces.CoffeeTable;


public class ModernItemsFactory implements Factory {
    
    public Chair createChair(){
        return new ModernChair();
    }
    
    public CoffeeTable createCoffeeTable(){
        return new ModernCTable();
    }
}
