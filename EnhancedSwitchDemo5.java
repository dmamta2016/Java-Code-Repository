import java.util.Scanner;
public class EnhancedSwitchDemo5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter Product ID to check the Product label:");
		int prodId= sc.nextInt();		
		System.out.println(getResultViaYield(prodId));
	}	
	private static String getResultViaYield(int id) {
         String res = switch (id) {
            case 001 -> "This code represents a smart television";
            case 002 -> "This code represents a smartphone";
            case 003,004 -> "This code represents a smart microwave";
            default -> "Sorry, No match found";
        } ;     
		return res;
    }
}