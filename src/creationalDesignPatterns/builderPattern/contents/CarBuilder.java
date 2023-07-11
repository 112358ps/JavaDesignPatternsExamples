package creationalDesignPatterns.builderPattern.contents;

import creationalDesignPatterns.builderPattern.contents.classes.Car;

public class CarBuilder implements Builder {
    
    int seats;
    String engine;
    String type;
    String color;
    int wheels;

    public void setSeats(int x){
        seats = x;
    }

    public void setEngine(String e){
        engine = e;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;    
    }

    public void setWheels(int w) {
        this.wheels = w;    
    }

    public Car getCar(){
        return new Car(type,color,engine,seats,wheels);
    }
}
