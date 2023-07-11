// package tests;

import creationalDesignPatterns.abstractFactory.productIterfaces.Chair;
import creationalDesignPatterns.abstractFactory.*;

public class TestDemo {
    public static void main( String args[]){
        
        System.out.println("\n========================creational design pattern========================");
        System.out.printf("Pattern:: %s Starting tests...\n","AbstractFactory");

        Factory modernFactory = new ModernItemsFactory();
        Factory victorianFactory = new VictorianItemsFactory();

        Chair c = modernFactory.createChair();
        System.out.println(c.getModel());

        c = victorianFactory.createChair();
        System.out.println(c.getModel());
        System.out.println("================................ end of testing\n");
    }
}
