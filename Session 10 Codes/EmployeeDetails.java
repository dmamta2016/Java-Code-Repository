class Employee {

String empId; // Variable to store employee ID
String empName; // Variable to store employee name
int salary; // Variable to store salary
float commission; // Variable to store commission
/**
 * Parameterized constructor to initialize the variables
 *
 * @param id a String variable storing employee id
 * @param name a String variable storing employee name
 * @param sal an integer variable storing salary
 *
 */
public Employee(String id, String name, int sal) {
empId=id;
empName=name;
salary=sal;
}
/**
 * Calculates commission based on sales value
 * @param sales a float variable storing sales value
 *
 * @return void
 */
public void calcCommission(float sales){
if(sales > 10000)
commission = salary * 20 / 100;
else
commission=0;
}

/**
 * Overloaded method. Calculates commission based on overtime
 * @param overtime an integer variable storing overtime hours
 *
 * @return void
 */
public void calcCommission(int overtime){
if(overtime > 8)
commission = salary/30;
else
commission = 0;
}

/**
 * Displays employee details
 *
 * @return void
 */
public void displayDetails(){
System.out.println("====================");
System.out.println("Employee ID:"+empId);
System.out.println("Employee Name:"+empName);
System.out.println("Salary:"+salary);
System.out.println("Commission:"+commission);
}
}

//class Manager extends Employee
//{
//int bonus;
//
//}
//
//class AssistantManager extends Manager
//{
//    int assistantID;
//}
/**
 * Define the EmployeeDetails.java class
 */
public class EmployeeDetails {
/**
 * @param args the command line arguments
 */
public static void main(String[] args)
{
 // Instantiate the Employee class object
Employee objEmp = new Employee();
objEmp.empId="E001";
objEmp.empName="Maria Nemeth";
objEmp.salary = 4000;
// Invoke the calcCommission() with float argument
objEmp.calcCommission(20000F);
objEmp.displayDetails(); // Print the employee details
//
//Manager m = new Manager();
//m.empId="E789";
//m.empName="Peter Smith";
//m.salary=5000;
//
//m.displayDetails();
//
//m.bonus=1000;
//System.out.println("Bonus for the manager is: "+ m.bonus);
//
//AssistantManager am =  new AssistantManager();
//am.empId="999";
//am.empName="John Gartner";
//am.bonus=6000;

} 
}
