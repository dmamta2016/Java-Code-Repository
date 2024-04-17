import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
public class Number2CurrencyDemo {	
		   @SuppressWarnings("deprecation")
		public static void main(String[] args)	   {
		      //Let’s see the number/amount which we want to format
		      Double currencyAmt = new Double(6541259.755);
		      
		     //Get current locale information
		      Locale currentlocal = Locale.getDefault();
		      //Get currency instance from locale; This will have all currency related information
		      Currency currentCurrency = Currency.getInstance(currentlocal);
		      //Currency Formatter specific to locale
		      NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentlocal);
		      //Test the output
		      System.out.println(currentlocal.getDisplayName());
		      System.out.println(currentCurrency.getDisplayName());
		      System.out.println(currencyFormatter.format(currencyAmt));
		   }
		}

