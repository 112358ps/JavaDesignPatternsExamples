package creationalDesignPatterns.factoryMethod;


import creationalDesignPatterns.factoryMethod.helpers.SeaTransporter;
import creationalDesignPatterns.factoryMethod.helpers.Transporter;

public class SeaLogistics extends Logistics{
    
    Transporter getTransporter() {
        return new SeaTransporter("Evergreen",true);
    }
}
