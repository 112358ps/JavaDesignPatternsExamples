package creationalDesignPatterns.abstractFactory;

import creationalDesignPatterns.abstractFactory.productClasses.VictorianCTable;
import creationalDesignPatterns.abstractFactory.productClasses.VictorianChair;
import creationalDesignPatterns.abstractFactory.productIterfaces.Chair;
import creationalDesignPatterns.abstractFactory.productIterfaces.CoffeeTable;

public class VictorianItemsFactory implements Factory{
    
    
    public Chair createChair(){
        return new VictorianChair();
    }
    
    public CoffeeTable createCoffeeTable(){
        return new VictorianCTable();
    }
}
