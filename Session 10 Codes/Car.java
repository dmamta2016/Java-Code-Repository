class Car extends Vehicle{
// Declare a field specific to child class
private boolean powerSteer; // Variable to store steering information
/**
 * Parameterized constructor to initialize values based on user input
 *
 * @param vID a String variable storing vehicle ID
 * @param vName a String variable storing vehicle name
 * @param numWheels an integer variable storing number of wheels
 * @param pSteer a String variable storing steering information
 */
public Car(String vId, String vName, int numWheels, boolean pSteer){

// attributes inherited from parent class
vehicleNo=vId;
vehicleName=vName;
wheels=numWheels;

// child class’ own attribute
powerSteer=pSteer;
}
/**
 * Displays vehicle details
 *
 * @return void
 */
public void showDetails() {

System.out.println("Vehicle no:"+ vehicleNo);
System.out.println("Vehicle Name:"+ vehicleName);
System.out.println("Number of Wheels:"+ wheels);

if(powerSteer==true){
System.out.println("Power Steering:Yes");
}
else{
System.out.println("Power Steering:No");
}
}

/**
* Overridden method
* Accelerates the vehicle
*
* @return void
*/
@Override
public void accelerate(int speed) {
System.out.println("Maximum acceleration:"+ speed + " kmph");
}
}