import java.text.CompactNumberFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
public class CustomCompactDemo {	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		final String[] cmpctPttrns = {"", "", "", "0k", "00k", "000k", "0m", "00m", "000m", 
		"0b", "00b", "000b", "0t", "00t", "000t"}; 
		final DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getNumberInstance(Locale.US);
		final CompactNumberFormat customCompactNoFormat  = new CompactNumberFormat( decimalFormat.toPattern(),                 
		decimalFormat.getDecimalFormatSymbols(),  cmpctPttrns);
		System.out.println(decimalFormat.toPattern());
	}
}

