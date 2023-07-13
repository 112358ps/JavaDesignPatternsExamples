package behavioralDesignPatterns.visitor;

public class Shop implements Place{

    @Override
    public void accept(Vistor vistor) {
        vistor.visitShop(this);
    }
    
}
