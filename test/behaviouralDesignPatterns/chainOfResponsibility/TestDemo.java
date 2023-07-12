import behavioralDesignPatterns.chainOfResponsibility.Employee;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Behavioural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","Chain of responsibility design pattern");

        Employee e1 = new Employee("Level10",null); 
        Employee e2 = new Employee("Level10",e1); 
        Employee e3 = new Employee("Level10",e2); 
        Employee e4 = new Employee("Level10",e3); 

        e4.review();


        System.out.println("================................ end of testing\n");
    }
}
