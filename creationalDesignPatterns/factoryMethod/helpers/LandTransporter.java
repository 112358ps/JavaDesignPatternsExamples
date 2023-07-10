package factoryMethod.helpers;

public class LandTransporter implements Transporter{

    private final String vehicleName;
    private boolean inTransit = false;

    public LandTransporter(String vname){
        vehicleName = vname;
    }

    public void getSchedule() {
        System.out.printf("Transport vehicle:%s\n",this.vehicleName);
        System.out.printf("Transport start and end:00:00 - 12:00\n");
    }

    public void startTransport() {
        inTransit = true;
    }

    public void printStatus(){
        if(inTransit){

            System.out.printf("Transport status : RUNNING\n");
        }else{
            System.out.printf("Transport status : NOT RUNNING\n");
        }
    }
    
}
