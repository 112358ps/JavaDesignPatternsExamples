import productClasses.VictorianCTable;
import productClasses.VictorianChair;
import productIterfaces.Chair;
import productIterfaces.CoffeeTable;

public class VictorianItemsFactory implements Factory{
    
    
    public Chair createChair(){
        return new VictorianChair();
    }
    
    public CoffeeTable createCoffeeTable(){
        return new VictorianCTable();
    }
}
