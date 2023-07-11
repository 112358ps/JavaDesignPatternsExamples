package creationalDesignPatterns.factoryMethod;


import creationalDesignPatterns.factoryMethod.helpers.Transporter;

abstract public class Logistics {

    abstract Transporter getTransporter();

    public void transport(){
        final Transporter transporter = this.getTransporter();
        transporter.startTransport();
        transporter.getSchedule();
        transporter.printStatus();
    }
}
