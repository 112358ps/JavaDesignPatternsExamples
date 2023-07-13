package behavioralDesignPatterns.visitor;

public interface Vistor {
    void visitHome(Home home);
    void visitShop(Shop shop);
    void visitFactory(Factory factory);
}
