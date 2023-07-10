package productClasses;
import productIterfaces.Chair;

public class ModernChair implements Chair{
    public String getModel(){
        return "ModernChair::0x123";
    }
    
    public boolean hasLegs(){
        return false;
    }

    public boolean canSitOn(){
        return true;
    }
}
