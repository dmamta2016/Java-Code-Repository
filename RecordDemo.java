//Driver class to demo records in java
public class RecordDemo {
	 
    public static void main(String[] args) {
         
    	Employee emp1record = new Employee(15, "Nancy", 1000, null);
    	Employee emp2record = new Employee(15, "Nancy", 3000, null);
 
        // toString()
        System.out.println(emp1record);
         
        // accessing fields
        System.out.println("Name: "+emp1record.ename()); 
        System.out.println("ID: "+emp1record.id());
         
        // equals()
        System.out.println(emp1record.equals(emp2record));
         
        // hashCode()
        System.out.println(emp1record == emp2record);       
    }
}
