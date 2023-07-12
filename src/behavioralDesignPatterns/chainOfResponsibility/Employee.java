package behavioralDesignPatterns.chainOfResponsibility;

public class Employee implements Approver{

    String name;
    Approver supervisor;

    public Employee(String name,Approver supervisor){
        this.supervisor = supervisor;
        this.name = name;
    }

    @Override
    public void review() {
        System.out.printf("In review phase@%s\n",name);
        this.approve();
    }

    @Override
    public void approve() {
        System.out.printf("Approved by @%s\n",name);
        if(supervisor != null){
            System.out.printf("Sent to supervisor for his approval\n");
            supervisor.review();
        } else {
            System.out.printf("Final Approval done\n");
        }
    } 
}
