package creationalDesignPatterns.prototype;

public interface Animal {
    void lifespan();
    void remainingLifespan();
    Animal clone();
}
