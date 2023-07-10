package builderPattern;
import builderPattern.contents.*;
import builderPattern.contents.classes.Car;
import builderPattern.contents.classes.CarManual;

public class TestDemo1 {

    public static void main(String args[]){
        
        // System.out.println("------------------adsfasdfsd---------");
        Director d = new Director();
        CarBuilder cb = new CarBuilder();
        CarManualBuilder mb = new CarManualBuilder();

        d.constructSUV(cb);
        Car sedan = cb.getCar();
        sedan.describe();

        d.constructSUV(mb);
        CarManual sedanManual = mb.getCarManual();
        sedanManual.describe();
    }
}
