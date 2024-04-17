import java.util.*;
public class EnhancedSwitchDemo4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the Product Name to check the Product availability:");
		String prodName= sc.next();
		int res = getResultViaYield(prodName);
        String status = res==1? "Available" : "Not Available";
		System.out.println("The Product is "+ status);

	}
		private static int getResultViaYield(String name) {
        int result = switch (name) {
            case "Bolt", "Nut":
//if we enter Bolt or Nut, this yields/returns 1
                yield 1;
            case "Rivet", "Screw":
//if we enter Rivet or Screw, this yields/returns 2
                yield 2;
            case "Nail":
//if we enter Nail, this yields/returns 3
                 yield 3;
            default:
                throw new IllegalArgumentException(prodName + "is an unknown product and not found in catalog.");
        };
        return result;
    }
}
