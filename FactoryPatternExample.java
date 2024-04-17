interface Vehicle {
    void move();
}
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Inside Car::move() method.");
    }
}
class Truck implements Vehicle {
    @Override
    public void move() {
        System.out.println("Inside Truck::move() method.");
    }
}
class VehicleFactory {
   //use getVehicle method to get object of type Vehicle 
   public Vehicle getVehicle(String vehicleType){
      if(vehicleType == null){
         return null;
      }		
      if(vehicleType.equalsIgnoreCase("Car")){
         return new Car();
      } else if(vehicleType.equalsIgnoreCase("Truck")){
return new Truck();
      } 
return null;
   }
}

public class FactoryPatternExample {
/**
     * @param args the command line arguments
*/    
public static void main(String[] args) {
      VehicleFactory vehicleFactory = new VehicleFactory();
      //get an object of Car and call its move method.
      Vehicle carObj = vehicleFactory.getVehicle("Car");
      //call move method of Car
      carObj.move();
//get an object of Truck and call its move method.
Vehicle truckObj = vehicleFactory.getVehicle("Truck");
      //call move method of truck
      truckObj.move();
   }
}
