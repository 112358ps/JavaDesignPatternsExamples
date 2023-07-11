package creationalDesignPatterns.factoryMethod;


import creationalDesignPatterns.factoryMethod.helpers.LandTransporter;
import creationalDesignPatterns.factoryMethod.helpers.Transporter;

public class LandLogistics extends Logistics{

    Transporter getTransporter() {
        return new LandTransporter("AshokLeyLand");
    }
    
}
