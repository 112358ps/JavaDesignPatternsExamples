package behavioralDesignPatterns.visitor;

public class Factory implements Place {

    @Override
    public void accept(Vistor vistor) {
        vistor.visitFactory(this);
    }
    
}
