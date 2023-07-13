import behavioralDesignPatterns.command.RestaurantWaiter;
import behavioralDesignPatterns.command.RestaurantWaiter.Type;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Behavioural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","command design pattern");

        RestaurantWaiter waiter = new RestaurantWaiter();

        waiter.selectOption(Type.Breakfast, "Dosa");
        waiter.selectOption(Type.Breakfast, "Idly");
        waiter.selectOption(Type.Breakfast, "Toast");
        
        waiter.order();

        waiter.selectOption(Type.Lunch, "Rice");
        waiter.selectOption(Type.Lunch, "Biryani");
        waiter.selectOption(Type.Lunch, "Naan&Curry");
        
        waiter.order();


        System.out.println("================................ end of testing\n");
    }
}
