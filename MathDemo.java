/**
*	The {@code MathDemo} class implements a calculation algorithm to
*	add two integers.
*	@author Carl Boynton
*	@author Andy Payne
*	@see Math
*	@since JDK8.0
*/
public class MathDemo {
/**
* Constructs a MathDemo instance.
*/
public MathDemo() { }
public long addLong(long num1, long num2) { return num1 + num2;
}
/**
*	This method is used to add two integers.
*	@param num1 This is the first parameter to addInt method
*	@param num2 This is the second parameter to addInt method
*	@return int This returns sum of numA and numB.
*/
public int addInt(int num1, int num2) { return num1 + num2;}
/**
*	This is the main method to use addInt method.
*	@param args Unused.
*	@exception java.io.IOException on input error.
*	@see java.io.IOException
*/
public static void main(String[] args) throws java.io.IOException{ MathDemo mathDemo = new MathDemo(); System.out.println(mathDemo.addInt(5, 8)); }
}
