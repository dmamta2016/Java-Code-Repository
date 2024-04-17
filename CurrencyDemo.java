import java.text.*;
import java.util.*;
public class CurrencyDemo {	 
    public static void main(String[] args) {
		long nf1 =15000000;  
	   NumberFormat numFormatObj2 = NumberFormat.getNumberInstance(Locale.GERMANY);
	    NumberFormat numFormatObj3 = NumberFormat.getNumberInstance(Locale.ITALY);
System.out.println("Currencies without compact numbering:");
System.out.printf("%s %s %s %s", numFormatObj2.format(nf1), "Germany", numFormatObj3.format(nf1), "Italy");		 
          final NumberFormat numberFormatGrShort  = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);  
      final NumberFormat numberFormatGrLong  = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG);  
      final NumberFormat numberFormatItShort  = NumberFormat.getCompactNumberInstance(Locale.ITALY, NumberFormat.Style.SHORT);  
      final NumberFormat numberFormatItLong   = NumberFormat.getCompactNumberInstance(Locale.ITALY, NumberFormat.Style.LONG);  
        System.out.println("\nDemonstrating Compact Number Formatting on " + nf1);     
      System.out.println("\tDE/Short: " + numberFormatGrShort.format(nf1));  
      System.out.println("\tDE/Long:  " + numberFormatGrLong.format(nf1));  
      System.out.println("\tIT/Short: " + numberFormatItShort.format(nf1));  
      System.out.println("\tIT/Long:  " + numberFormatItLong.format(nf1));  
   }     
}