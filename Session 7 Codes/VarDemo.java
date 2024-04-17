public class VarDemo {
// Variable argument method taking variable number of integer arguments
public void addNumber(int...num) {
int sum=0;
// Use for loop to iterate through num
for(int i:num) {
// Add up the values
sum = sum + i;
}
// Print the sum
System.out.println("Sum of numbers is "+ sum);
}
public static void main(String[] args) {
// Instantiate the Varargs class
VarDemo obj = new VarDemo();
// Invoke the addNumber() method with multiple arguments
obj.addNumber(10,30,20,40);
}
}
