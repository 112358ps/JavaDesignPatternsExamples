package structuralDesignPatterns.adaptor.content;

public class Intern implements Student {

    String name;
    public final static int PAY = 300;
    int hours;

    public Intern(String name){
        this.name = name;
        hours = 0;
    }

    public int getHours(){
        return hours;
    }

    public void doStudy() {
        hours+=1;
        System.out.println("...preparing to study.\n\tstudying\n ....taking a break.\n");
    }
}
