public class EmployeeDetails {
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
// Instantiate the Employee class within EmployeeDetails class
Employee objEmp = new Employee(1300,"Clara Smith");
// Assign value to protected variable
objEmp.empDesig="Receptionist";
// Use the mutator method to set the value of private variable
objEmp.setSSN("282-72-3873");
// Invoke the public method
objEmp.display();
}
}