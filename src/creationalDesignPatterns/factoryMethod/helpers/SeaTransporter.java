package creationalDesignPatterns.factoryMethod.helpers;

public class SeaTransporter implements Transporter {
    private final String vehicleName;
    private boolean inTransit = false;
    private boolean isPassenger = false;

    public SeaTransporter(String vname, boolean passengerStatus){
        vehicleName = vname;
        isPassenger = passengerStatus;
    }

    public void getSchedule() {
        System.out.printf("Transport vehicle:%s\n",this.vehicleName);
        System.out.printf("Transport start and end:00:00 - 12:00\n");
    }

    public void startTransport() {
        inTransit = true;
    }

    public boolean getPassengerStatus(){
        return isPassenger;
    }

    public void printStatus(){
        if(inTransit){

            System.out.printf("Transport status : RUNNING\n");
        }else{
            System.out.printf("Transport status : NOT RUNNING\n");
        }
    }
}
