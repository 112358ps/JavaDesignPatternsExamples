import structuralDesignPatterns.bridge.Killers.*;

public class TestDemo {
    public static void main(String args[]){
        
        System.out.println("\n========================Structural design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","Bridge design pattern");

        Assasin assasin_old = new Assasin("CobraKotis");
        Assasin assasin_new = new Assasin("BlackPrecher");

        Butcher balaraj = new Butcher("Perotens");


        System.out.println("================................ end of testing\n");
    }
}
