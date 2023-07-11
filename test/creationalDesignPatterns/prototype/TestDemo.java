import creationalDesignPatterns.prototype.*;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================creational design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","Prototype design pattern");

        Animal tiger1 = new Tiger("singam");
        Animal ele1 = new Elephant("bahujam");
        tiger1.lifespan();
        tiger1.remainingLifespan();
        ele1.lifespan();
        ele1.remainingLifespan();

        Animal tiger2 = tiger1.clone();
        tiger2.lifespan();
        tiger2.remainingLifespan();
        Animal ele2 = ele1.clone();
        ele2.lifespan();
        ele2.remainingLifespan();
        tiger1.remainingLifespan();
        ele1.remainingLifespan();

        System.out.println("================................ end of testing\n");
    }
}
