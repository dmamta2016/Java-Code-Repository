public class CommandLineDemo {
/**
 * @param args the command line arguments
 */
public static void main(String[] abc) {

// Check the number of command line arguments
if(abc.length==3) {

// Display the values of individual arguments
System.out.println("First Name is "+abc[0]);
System.out.println("Last Name is "+abc[1]);
System.out.println("Designation is "+abc[2]);

System.out.println(abc[3]);
}
else {
System.out.println("Specify the First Name, Last Name, and Designation");
}
}
}
