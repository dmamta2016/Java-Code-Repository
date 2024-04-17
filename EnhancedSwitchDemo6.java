import java.util.Scanner;
public class EnhancedSwitchDemo6 {
	public static void main(String[] args) {		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Product ID to check the Product labe1: ");
		int prodID = sc.nextInt();
		switch (prodID) {
	    case 101: {
	        // The num variable exists just in this {} block
	        int num = 200;
	        System.out.println("The value of num is "+num);
	        break;
	    }
	    case 102: {
	        // This is ok, {} block has a separate scope
	        int num = 300;
	        System.out.println("The value of num is "+num);
	        break;
	    }
	    default:
	    {
	    	System.out.println("Oops! No matches");
	    }
	}
	}
}