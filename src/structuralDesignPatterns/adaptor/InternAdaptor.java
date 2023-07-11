package structuralDesignPatterns.adaptor;


import structuralDesignPatterns.adaptor.content.Employee;
import structuralDesignPatterns.adaptor.content.Intern;

public class InternAdaptor implements Employee{

    Intern s;

    public InternAdaptor(Intern s){
        this.s = s;
    }

    public int payForHour() {
        return Intern.PAY;        
    }

    public int hoursWorked() {
        return s.getHours();
    }

    public void doWork() {
        s.doStudy();    
    }
}
