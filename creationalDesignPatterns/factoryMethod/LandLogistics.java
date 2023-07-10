package factoryMethod;

import factoryMethod.helpers.LandTransporter;
import factoryMethod.helpers.Transporter;

public class LandLogistics extends Logistics{

    Transporter getTransporter() {
        return new LandTransporter("AshokLeyLand");
    }
    
}
