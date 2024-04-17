// Creating a class to use Math class methods 
class MathClass {
int num1; // declaring variables
int num2;
// declaring constructors 
public MathClass(){}
public MathClass(int num1, int num2){ 
this.num1 = num1;
this.num2 = num2;
}
// method to use max() 
public void doMax(){
System.out.println("Maximum is: " + Math.max(num1,num2));
}
// method to use min() 
public void doMin(){
System.out.println("Minimum is: " + Math.min(num1,num2));
}
// method to use pow() 
public void doPow(){
System.out.println("Result of power is: " + Math.pow(num1,num2));
}
// method to use random() 
public void getRandom(){
System.out.println("Random generated is: " + Math.random());
}
// method to use sqrt() 
public void doSquareRoot(){
System.out.println("Square Root of " + num1 +" is: " + Math.sqrt(num1));
}
}
public class TestMath {
public static void main(String[] args) {
MathClass objMath = new MathClass(4,5);
objMath.doMax(); 
objMath.doMin();
objMath.doPow();
objMath.getRandom();
}
}
