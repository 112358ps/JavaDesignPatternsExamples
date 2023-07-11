package creationalDesignPatterns.abstractFactory.productIterfaces;


public interface Chair {

    String getModel();
    boolean hasLegs();
    boolean canSitOn();
}