package behavioralDesignPatterns.command;

public class BreakFast implements Food {

    private String name;

    public BreakFast(String name){
        this.name = name;
    }

    public void prepare(){
        System.out.println("Preparing breakfast :: " + name + " approx 20 mins");
    }
}
