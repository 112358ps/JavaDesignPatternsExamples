package productClasses;
import productIterfaces.CoffeeTable;

public class VictorianCTable implements CoffeeTable {
    public String getModel(){
        return "VictorianCTable::0x123";
    }
    
    public boolean hasLegs(){
        return false;
    }

    public int maxWeight(){
        return 100;
    }
}
