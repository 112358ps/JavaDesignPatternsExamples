package creationalDesignPatterns.abstractFactory.productIterfaces;


public interface Sofa {

    String getModel();
    boolean hasLegs();
    boolean canSitOn();
    boolean canSleepOn();
}