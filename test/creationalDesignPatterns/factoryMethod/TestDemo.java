import creationalDesignPatterns.factoryMethod.*;
public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("creational design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","FactoryMethod");

        Logistics llogistics = new LandLogistics();
        Logistics slogistics = new SeaLogistics();

        llogistics.transport();
        slogistics.transport();

        System.out.println("================................ end of testing");
    }
}
