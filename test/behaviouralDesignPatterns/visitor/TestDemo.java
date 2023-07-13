import behavioralDesignPatterns.visitor.*;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Behavioural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","visitor design pattern");

        Place home = new Home();
        Place factory = new Factory();
        Place shop = new Shop();

        Vistor salesman = new SalesManVisitor();

        home.accept(salesman);
        factory.accept(salesman);
        shop.accept(salesman);

        System.out.println("================................ end of testing\n");
    }
}