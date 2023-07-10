import productIterfaces.*;



public class TestDemo {
    public static void main( String args[]){
        Factory modernFactory = new ModernItemsFactory();
        Factory victorianFactory = new VictorianItemsFactory();

        Chair c = modernFactory.createChair();
        System.out.println(c.getModel());

        c = victorianFactory.createChair();
        System.out.println(c.getModel());
    }
}
