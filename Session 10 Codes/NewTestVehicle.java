/**
 * Define the NewTestVehicle.java class
 */
public class NewTestVehicle {
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
// Create an object of child class and specify the values
Car objCar = new Car("LA-09 CS-1406", "Toyota Reign",4, true);
objCar.showDetails(); // Invoke child class method
objCar.accelerate(800); // Invoke inherited method
}
}