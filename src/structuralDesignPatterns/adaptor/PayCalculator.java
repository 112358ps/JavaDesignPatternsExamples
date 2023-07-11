package structuralDesignPatterns.adaptor;

import structuralDesignPatterns.adaptor.content.Employee;

public class PayCalculator {

    public static void calculatePay(Employee e){
        System.out.printf("Calculated pay :: %d\n",e.payForHour() * e.hoursWorked());
    }
}
