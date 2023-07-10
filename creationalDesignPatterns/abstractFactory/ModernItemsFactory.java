import productClasses.ModernChair;
import productIterfaces.Chair;
import productClasses.ModernCTable;
import productIterfaces.CoffeeTable;


public class ModernItemsFactory implements Factory {
    
    public Chair createChair(){
        return new ModernChair();
    }
    
    public CoffeeTable createCoffeeTable(){
        return new ModernCTable();
    }
}
