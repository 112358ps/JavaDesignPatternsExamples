package builderPattern;
import builderPattern.contents.Builder;


class Director {

    void constructSUV(Builder builder){
        builder.setSeats(5);
        builder.setEngine("HP500");
        builder.setType("SUV");
        builder.setColor("Black");
    }

    void constructSedan(Builder builder){
        // builder.reset();

        builder.setType("Matruthi");
        builder.setColor("Blue");
        builder.setSeats(4);
        builder.setEngine("HP400");
    }

    void constructSportsCar(Builder builder){
        // builder.reset();

        builder.setType("sports");
        builder.setColor("white");
        builder.setSeats(2);
        builder.setEngine("HP700");
    }
}
