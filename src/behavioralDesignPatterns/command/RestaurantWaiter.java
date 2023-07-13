package behavioralDesignPatterns.command;

import java.util.ArrayList;

public class RestaurantWaiter {
    
    ArrayList<Food>  options;

    public RestaurantWaiter(){
        this.options = new ArrayList<Food>();
    }

    public enum Type {
        Breakfast,
        Lunch
    };

    public void selectOption(Type type, String name){
        if(Type.Breakfast == type){
            this.options.add(new BreakFast(name));
        }else{
            this.options.add(new Lunch(name));
        }   
    }

    public void order(){
        for(Food option : options){
            option.prepare();
        }
        options.removeAll(options);
    }
}
