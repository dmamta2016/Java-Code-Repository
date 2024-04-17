package session9;
class MathematicsNew {

  /**
     * Divides two integers, throws ArithmeticException
     * @param num1 an integer variable storing value of first number   
     * @param num2 an integer variable storing value of second number
     * @return void
     */
    public void divide(int num1, int num2) throws ArithmeticException
    {
          // Check the value of num2
          if(num2==0) {
        
            // Throw the exception 
            throw new ArithmeticException("/ by zero");
         }
         else {
               System.out.println("Division is: " + (num1/num2));
        }

        // Rest of the method
        System.out.println("Method execution completed");
    }
}
/**
   * Define the TestMathNew class
   */
public class TestMathNew{
    
 /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    
        // Check the number of command line arguments
        if(args.length==2) {
        
           // Instantiate the Mathematics class
           MathematicsNew objMath = new MathematicsNew();
           
           try {
           
              // Invoke the divide(int,int) method
                objMath.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
           }
           catch(ArithmeticException e) {
           
             // Display an error message to the user
             System.out.println("Error: "+ e.getMessage());
           }
        }
        else{
                System.out.println("Usage: java TestMathNew <number1> <number2>");
        }
           System.out.println("Back to Main");
    }
}     