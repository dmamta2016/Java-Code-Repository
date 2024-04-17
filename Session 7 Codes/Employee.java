public class Employee {
// Variables with default access
int empID; // Variable to store employee ID
String empName; // Variable to store employee name
// Variables with private and protected access
private String SSN; // Variable to store social security number
protected String empDesig; // Variable to store designation
/**
 * Parameterized constructor
 *
 * @param ID an integer variable storing the employee ID
 * @param name a String variable storing the employee name
 * @return void
 */
public Employee(int ID, String name){
empID = ID;
empName = name;
}
// Define public methods
/**
 * Returns the value of SSN
 *
 * @return String
 */
public String getSSN(){ // Accessor for SSN
return SSN;
}
/**
 * Sets the value of SSN
 *
 * @param ssn a String variable storing the social security number
 * @return void
 */
public void setSSN(String ssn) { // Mutator for SSN
SSN = ssn;
}
/**
 * Sets the value of Designation
 *
 * @param desig a String variable storing the employee designation
 * @return void
 */
public void setDesignation(String desig) { // public method
empDesig = desig;
}

/**
 * Displays employee details
 *
 * @return void
 */
public void display(){ // public method
System.out.println("Employee ID is "+ empID);
System.out.println("Employee name is "+ empName);
System.out.println("Designation is "+ empDesig);
System.out.println("SSN is "+ SSN);
}
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
// Instantiate the Employee class
Employee objEmp1 = new Employee(1100,"Sarah Smith");
// Assign values to public variables
objEmp1.empDesig = "Accountant";
objEmp1.SSN = "281-72-3873";
// Invoke the public method
objEmp1.display();
}
}

/*class EmplDemo{
    
    public void setValue(){
    
    Employee objEmp = new Employee(55, "John Smith");
    objEmp.SSN = "1000";
    
    }
}*/
