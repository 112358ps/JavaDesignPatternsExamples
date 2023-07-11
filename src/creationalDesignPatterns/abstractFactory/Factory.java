package creationalDesignPatterns.abstractFactory;
import creationalDesignPatterns.abstractFactory.productIterfaces.*;

public interface Factory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    // Sofa createSofa();
}
