package creationalDesignPatterns.prototype;

public class Elephant implements Animal {
    final private static long lifespan = 8000;
    final private String name;
    final private long birthdate;

    public Elephant(String name) {
        this.name = name;
        this.birthdate = System.currentTimeMillis();
    }

    public void lifespan() {
        System.out.printf("Elephant Name::%s age::%d\n", name, System.currentTimeMillis() - this.birthdate);
    }

    public void remainingLifespan() {
        System.out.printf("Elephant Name::%s lifeleft::%d\n", name,
                this.birthdate + Elephant.lifespan - System.currentTimeMillis());
    }

    public Animal clone() {
        Animal ani = new Elephant(this.name + "_clone");
        return ani;
    }
}
