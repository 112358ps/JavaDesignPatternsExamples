package behavioralDesignPatterns.visitor;

public interface Place {
    void accept(Vistor vistor);

    default void response(){
        System.out.println("okay...");
    }
}
