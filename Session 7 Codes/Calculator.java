public class Calculator { 
// Method to add two integers 
public void add(int num1, int num2) { 
int num3; 
num3 = num1 + num2; 
System.out.println("Result after addition is " + num3); 
} 
// Method to subtract two integers 
public void sub(int num1, int num2) { 
int num3; 
num3 = num1 - num2; 
System.out.println("Result after subtraction is " + num3); 
} 
// Method to multiply two integers 
public void mul(int num1, int num2) { 
int num3; 
num3 = num1 * num2; 
System.out.println("Result after multiplication is " + num3); 
}	
// Method to divide two integers
public void div(int num1, int num2) {
int num3;
num3 = num1 / num2;
System.out.println("Result after division is " + num3);
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
// Instantiate the Calculator class
Calculator objCalc = new Calculator();
// Invoke the methods with appropriate arguments
objCalc.add(45, 45);
objCalc.mul(3, 4);
 }
} 	
