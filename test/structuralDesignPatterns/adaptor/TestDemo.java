import structuralDesignPatterns.adaptor.InternAdaptor;
import structuralDesignPatterns.adaptor.PayCalculator;
import structuralDesignPatterns.adaptor.content.Employee;
import structuralDesignPatterns.adaptor.content.FullTimeEmployee;
import structuralDesignPatterns.adaptor.content.Intern;

public class TestDemo {
     public static void main(String args[]){
        
        System.out.println("\n========================Structural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","Adaptor design pattern");

        
        Employee employee = new FullTimeEmployee();
        Intern intern = new Intern("intern");

        employee.doWork();
        employee.doWork();
        employee.doWork();

        intern.doStudy();
        intern.doStudy();
        intern.doStudy();

        PayCalculator.calculatePay(employee);

        InternAdaptor ia = new InternAdaptor(intern);

        PayCalculator.calculatePay(ia);

        System.out.println("================................ end of testing\n");
    }
}
