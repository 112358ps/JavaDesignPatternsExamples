import creationalDesignPatterns.builderPattern.Director;
import creationalDesignPatterns.builderPattern.contents.*;
import creationalDesignPatterns.builderPattern.contents.classes.*;

public class TestDemo1 {

    public static void main(String args[]){
        System.out.println("creational design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","BuilderPattern");

        Director d = new Director();
        CarBuilder cb = new CarBuilder();
        CarManualBuilder mb = new CarManualBuilder();

        d.constructSUV(cb);
        Car sedan = cb.getCar();
        sedan.describe();

        d.constructSUV(mb);
        CarManual sedanManual = mb.getCarManual();
        sedanManual.describe();

        System.out.println("================................ end of testing");
    }
}
