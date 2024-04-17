import java.text.NumberFormat;
import java.util.Locale;
public class FractionFormatDemo {
	 public static void main(String[] args) 	    {
	        NumberFormat format = 
NumberFormat.getCompactNumberInstance(Locale.US, 
NumberFormat.Style.SHORT);
	        format.setMinimumFractionDigits(3);	 
	        System.out.println(format.format(20000) );
	        System.out.println(format.format(20012) );
	        System.out.println(format.format(200201) );
	        System.out.println(format.format(2222222) );
	    }
}
