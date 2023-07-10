package productClasses;
import productIterfaces.Chair;

public class VictorianChair implements Chair{
    
    public String getModel(){
        return "VictorianChair::0x123";
    }
    
    public boolean hasLegs(){
        return true;
    }

    public boolean canSitOn(){
        return true;
    }
}
