package behavioralDesignPatterns.visitor;

public class Home implements Place{

    @Override
    public void accept(Vistor vistor) {
        vistor.visitHome(this);
    }
    
}
