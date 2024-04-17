// Call with CS-2723 Bike 80 Ford 5500
public class TestVehicle {
public static void main(String[] args){
// Verify number of command line arguments
if(args.length==5) {
// Instantiate the class
TwoWheeler objBike = new TwoWheeler(args[0], args[1]);
objBike.displayDetails();
objBike.start();
objBike.accelerate(Integer.parseInt(args[2]));
objBike.brake();
objBike.stop();
objBike.addContact(args[3]);
objBike.makePayment(Float.parseFloat(args[4]));
}
else{
// Display an error message
System.out.println("Usage: java TwoWheeler <ID> <Type> <Speed> <Manufacturer> <Amount>");
}
}
}
