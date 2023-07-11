import creationalDesignPatterns.singleton.Star;

public class TestDemo {
        public static void main(String args[]){
        
        System.out.println("\n========================creational design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","Singleton design pattern");

        Star sun = Star.getInstance();
        sun.printDetails();

        //.....................

        Star b = Star.getInstance();
        b.printDetails();

        System.out.println("================................ end of testing\n");
    }
}
