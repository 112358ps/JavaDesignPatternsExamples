import structuralDesignPatterns.composite.*;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Structural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","composite/object design pattern");
  
        Team andaram = new Team("Anadaram");
        andaram.addMember(new Employee("sundaram"));
        andaram.addMember(new Employee("bandaram"));
        andaram.addMember(new Employee("mandaram"));

        Team andaram2 = new Team("Anadaram2");
        andaram2.addMember(new Employee("sundaram2"));
        andaram2.addMember(new Employee("bandaram2"));
        andaram2.addMember(new Employee("mandaram2"));

        Team okade = new Team("Okkade");
        okade.addTeam(andaram);
        okade.addTeam(andaram2);
        okade.addMember(new Employee("okkoney"));

        okade.goToBerserkMode();



        System.out.println("================................ end of testing\n");
    }
}
