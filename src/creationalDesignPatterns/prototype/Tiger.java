package creationalDesignPatterns.prototype;

public class Tiger implements Animal {

    final private static long lifespan = 2000;
    final private String name;
    final private long birthdate;

    public Tiger(String name) {
        this.name = name;
        this.birthdate = System.currentTimeMillis();
    }

    public void lifespan() {
        System.out.printf("TigerName::%s age::%d\n", name, System.currentTimeMillis() - this.birthdate);
    }

    public void remainingLifespan() {
        System.out.printf("TigerName::%s lifeleft::%d\n", name,
                this.birthdate + Tiger.lifespan - System.currentTimeMillis());
    }

    public Animal clone() {
        Animal ani = new Tiger(this.name + "_clone");
        return ani;
    }
}
