//Defining a record class
record Employee(int id, String ename, float salary, String address)
{
    // Instance fields need to be present in the record's
    // parameters but record can define static fields.
    static int count;
    // Constructor 1 of this class
    // Compact Constructor
    public Employee
    {
         if (ename.length() < 2) {
            throw new IllegalArgumentException(
                "First name must be 2 characters or more.");
        }
    }    
    // Static methods
    public static int generateCount()    {
        return ++count;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
result = prime * result + ((address == null) ? 0 : address.
hashCode());
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
if (ename == null) {
if (other.ename != null)
			return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.
salary))
			return false;
		return true;
	}
}
// Driver class to demonstrate use of records in Java
public class EmployeeDemo {	 
    public static void main(String[] args) {         
    	Employee emp1record = new Employee(15, "Nancy", 1000, null);
    	Employee emp2record = new Employee(15, "Nancy", 1000, null);
     System.out.println(emp1record);         
     // accessing fields
     System.out.println("Name: "+emp1record.ename()); 
     System.out.println("ID: "+emp1record.id());   
	 System.out.println("Count: "+emp1record.generateCount());
     // Using equals()
        System.out.println(emp1record.equals(emp2record));
     // Using hashCode()
        System.out.println(emp1record == emp2record);       
    }
}
