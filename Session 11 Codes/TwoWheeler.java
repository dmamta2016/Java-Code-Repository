class TwoWheeler implements IVehicle, IManufacturer {

String ID; 
String type; 

public TwoWheeler(String ID, String type){
this.ID = ID;
this.type = type;
}

@Override
public void start() {
System.out.println("Starting the "+ type);
}

@Override
public void accelerate(int speed) {
System.out.println("Accelerating at speed:"+speed+ " kmph");
}

@Override
public void brake() {
System.out.println("Applying brakes...");
}

@Override
public void stop() {
System.out.println("Stopping the "+ type);
}

public void displayDetails()
{
System.out.println("Vehicle No.: "+ STATEID+ " "+ ID);
System.out.println("Vehicle Type.: "+ type);
}

// Implement the IManufacturer interface methods
@Override
public void addContact(String detail) {
System.out.println("Manufacturer: "+detail);
}

@Override
public void callManufacturer(String phone) {
System.out.println("Calling Manufacturer @: "+phone);
}

@Override
public void makePayment(float amount) {
System.out.println("Payable Amount: $"+amount);
}
}