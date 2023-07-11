package structuralDesignPatterns.adaptor.content;

public class FullTimeEmployee implements Employee{

    int hoursworked = 0;
    
    public int hoursWorked() {
        return hoursworked;
    }

    public int payForHour() {
        return 500; 
    }

    public void doWork() {
        hoursworked+=1;    
    }
}
