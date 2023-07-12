package structuralDesignPatterns.composite;

public class Employee implements TeamMember{

    String name;
    public Employee(String t){
        this.name = t;
    }


    public String getName() {
        return name;
    }

    public void doWork() {
        System.out.printf("Doing work..in %s\n",name);
    }

    public void berserkMode() {
        System.out.printf("Went to berserk mode..in %s\n",name);
    }
}
