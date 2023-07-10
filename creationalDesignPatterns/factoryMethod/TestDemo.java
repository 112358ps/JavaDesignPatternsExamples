package factoryMethod;

public class TestDemo {
    public static void main(String args[]){
        
        Logistics llogistics = new LandLogistics();
        Logistics slogistics = new SeaLogistics();

        llogistics.transport();
        slogistics.transport();

    }
}
