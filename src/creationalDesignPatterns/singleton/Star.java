package creationalDesignPatterns.singleton;

public class Star {

    final String name;
    final long degrees;
    final int planets;

    private static Star ourStar = null;

    private Star(String name, long degrees, int planets) {
        this.name = name;
        this.degrees = degrees;
        this.planets = planets;
    }

    public static Star getInstance() {
        if (Star.ourStar == null) {
            Star.ourStar = new Star("Sun", 7800, 9);
        }
        return Star.ourStar;
    }

    public void printDetails() {
        System.out.printf("We belong to solor sytem...\n");
        System.out.printf("%s is our star, has %d degrees and %d planets\n", this.name, this.degrees, this.planets);
    }
}
