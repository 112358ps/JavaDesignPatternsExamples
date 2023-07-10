package builderPattern.contents;

import builderPattern.contents.classes.CarManual;

public class CarManualBuilder implements Builder {
    int seats;
    String engine;
    String type;
    String color;
    int size;

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

    public void setSize(int size) {
        this.size = size;    
    }

    public CarManual getCarManual(){
        return new CarManual(type,color,engine,seats,size);
    }
}
