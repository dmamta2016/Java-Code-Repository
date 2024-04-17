import java.text.NumberFormat;
import java.util.Locale;
public class CompactNumberFormatDemo {	
	    public static void main(String[] args)     {
	        NumberFormat sampleNoFormat = NumberFormat
	                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);	 
	        System.out.println(sampleNoFormat.format(200) );
	        System.out.println(sampleNoFormat.format(2000) );
	        System.out.println(sampleNoFormat.format(20000) );
	        System.out.println(sampleNoFormat.format(200000) );	 
	        NumberFormat sampleShortFormat = NumberFormat
	                .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);	 
	        System.out.println(sampleShortFormat.format(200) );
	        System.out.println(sampleShortFormat.format(2000) );
	        System.out.println(sampleShortFormat.format(20000) );
	        System.out.println(sampleShortFormat.format(200000) );
	    }
}
