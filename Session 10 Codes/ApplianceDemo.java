class CoolingAppliances {
    public void startAppliance() {
       System.out.println("Started.");
    }

    public void stopAppliance() {
        System.out.println("Stopped.");
    }
}

class Refrigerator extends CoolingAppliances {
 @Override
    public void startAppliance() {
        System.out.println("Refrigerator Starts");
    }
@Override
    public void stopAppliance() {
        System.out.println("Refrigerator Stop");
    }

    public void run() {
        System.out.println("Refrigerator running");
    }
}

class AirConditioner extends CoolingAppliances {

    @Override
    public void startAppliance() {
        System.out.println("AC Starts");
    }

    @Override
    public void stopAppliance() {
        System.out.println("AC Stop");
    }
}

public class ApplianceDemo {

    public static void main(String[] args){
        
        CoolingAppliances ca =  new CoolingAppliances();
        ca.startAppliance();
        ca.stopAppliance();
        Refrigerator r = new Refrigerator();
        r.startAppliance();
        r.stopAppliance();
        r.run();
        
        AirConditioner a = new AirConditioner();
        a.startAppliance();
        a.stopAppliance();
        
        /* CoolingAppliances cm;
        cm = new Refrigerator();
        cm.startAppliance(); */
    }
}