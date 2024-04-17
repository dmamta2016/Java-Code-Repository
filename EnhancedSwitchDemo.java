import java.util.*;
public class EnhancedSwitchDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Product ID to check the Product labe1:");
		int prodID= sc.nextInt();
		switch (prodID) {
	    case 101, 102, 103 : 
	        System.out.println("You have selected a smartwatch!");
	        break;	        
	    case 104, 105:
	        System.out.println("You have selected a smartphone!");
	        break;
	}
	}
}
