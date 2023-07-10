package factoryMethod;

import factoryMethod.helpers.SeaTransporter;
import factoryMethod.helpers.Transporter;

public class SeaLogistics extends Logistics{
    
    Transporter getTransporter() {
        return new SeaTransporter("Evergreen",true);
    }
}
