package builderPattern.contents.classes;

public class Car {
    int seats = 1;
    String engine = "HP1";
    String type = "Dummy";
    String color = "purple";
    int wheels = 4;

    public Car(String type , String color , String engine , int seats, int wheels){
        this.type = type;
        this.color = color;
        this.seats = seats;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void describe(){
        System.out.printf("Car:: %s %s %s %d", type, color,engine,seats);
    }
}
