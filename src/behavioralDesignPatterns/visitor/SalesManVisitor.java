package behavioralDesignPatterns.visitor;

public class SalesManVisitor implements Vistor {

    private void pitchForHome(){
        System.out.println("Hello there, I visted your home to sell..");
    }

    private void pitchForShop(){
        System.out.println("Hello there, I visted your home to sell..");
    }

    private void pitchForFactory(){
        System.out.println("Hello there, I visted your home to sell..");
    }

    public void visitHome(Home home) {
        pitchForHome();
        home.response(); // dummy func
    }

    public void visitShop(Shop shop) {
        pitchForShop();
        shop.response(); // dummy func
    }

    public void visitFactory(Factory factory) {
        pitchForFactory();
        factory.response(); // dummy func
    }
    
}
