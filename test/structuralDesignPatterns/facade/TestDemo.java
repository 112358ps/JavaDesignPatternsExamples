import structuralDesignPatterns.Facade.*;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Structural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","facade design pattern");

        Animal a = new Animal();
        Plant p = new Plant();

        Facade org = new OrganismFacade(a,p);

        org.task("Animal");
        org.task("Plant");


        System.out.println("================................ end of testing\n");
    }
}
