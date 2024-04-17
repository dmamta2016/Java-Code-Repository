package session9;
class Mathematics {

  /**
     * Divides two integers
     * @param num1 an integer variable storing value of first number   
     * @param num2 an integer variable storing value of second number
     * @return void
     */
    public void divide(int num1, int num2) {
            // Create the try block
           try {
  // Statement that can cause exception
           System.out.println("Division is: " + (num1/num2));
        }
       catch(ArithmeticException e){ //catch block for ArithmeticException
            // Display an error message to the user
            System.out.println("Error: "+ e.getMessage());
        }
         // Rest of the method
        System.out.println("Method execution completed");
    }
}

/**
   * Define the TestMath.java class
   */
public class TestMath {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
           // Check the number of command line arguments
           if(args.length==2) {
                  // Instantiate the Mathematics class
                 Mathematics objMath = new Mathematics();
                 // Invoke the divide(int,int) method
                objMath.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
         }
		       else {
                     System.out.println("Usage: java Mathematics <number1> <number2>");
        }
    }
}