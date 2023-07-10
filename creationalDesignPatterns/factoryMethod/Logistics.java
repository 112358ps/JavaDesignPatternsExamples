package factoryMethod;

import factoryMethod.helpers.Transporter;

abstract public class Logistics {

    abstract Transporter getTransporter();

    void transport(){
        final Transporter transporter = this.getTransporter();
        transporter.startTransport();
        transporter.getSchedule();
        transporter.printStatus();
    }
}
