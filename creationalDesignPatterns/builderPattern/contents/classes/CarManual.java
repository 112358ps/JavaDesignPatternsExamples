package builderPattern.contents.classes;

public class CarManual {
    int seats;
    String engine;
    String type;
    String color;
    int size;

    public CarManual(String type , String color , String engine , int seats, int size){
        this.type = type;
        this.color = color;
        this.seats = seats;
        this.engine = engine;
        this.size = size;
    }

    public void describe(){
        System.out.printf("CarManual:: %s %s %s %d %d", type, color,engine,seats,size);
    }
}
