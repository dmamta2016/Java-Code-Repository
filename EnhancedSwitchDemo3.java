import java.util.*;
public class EnhancedSwitchDemo3 {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a Code to check State stats:");
		int ivar = sc.nextInt();
	// Retrieve  the result of a switch expression 
// and assign it to a variable.		
		String numberYieldColon = switch (ivar) {
							case 0: yield "Texas ";
							case 1: yield "California";
							case 2: { 
								String colResult = "Exclusively ";
							colResult = colResult + "Seattle";
								yield colResult;
							}							
							case 3: yield "finally, Chicago";
							default: yield "NA";
						}; //switch ends with semicolon
		System.out.println("Leading State is " + numberYieldColon);
	}

}
