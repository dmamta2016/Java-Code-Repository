public class PassByValue {
// method accepting the argument by value
public void setVal(int num1) {
num1 = num1 + 10;
System.out.println("Value of num1 within setVal is "+ num1);
}
public static void main(String[] args) {
// Declare and initialize a local variable
int num1 = 45;
// Instantiate the PassByValue class
PassByValue obj = new PassByValue();
// Invoke the setVal() method with num1 as parameter
obj.setVal(num1);
// Print num1 to check its value
System.out.println("Value of num1 after invoking setVal is "+ num1);
}
}
