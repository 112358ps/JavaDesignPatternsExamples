package behavioralDesignPatterns.command;

public class Lunch implements Food{
    private String name;

    public Lunch(String name){
        this.name = name;
    }

    public void prepare(){
        System.out.println("Preparing lunch :: " + name + " approx 40 mins");
    }
}
