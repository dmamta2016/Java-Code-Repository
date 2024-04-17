public class StringDemo {

String str = "Beautiful"; // Initialize a String variable
Integer strLength = 5; // Use the Integer wrapper class

/**
* Displays strings using various String class methods
*
* @return void
*/
public void displayStrings(){
// using various String class methods
System.out.println("String length is:"+ str.length());
System.out.println("Character at index 2 is:"+ str.charAt(2));
System.out.println("Concatenated string is:"+ str.concat("Nature"));
System.out.println("String comparison is:"+ str.compareTo("Nature"));
System.out.println("Index of o is:"+ str.indexOf("o"));
System.out.println("Last index of l is:"+ str.lastIndexOf("l"));
System.out.println("Replaced string is:"+ str.replace('e','a'));
System.out.println("Substring is:"+ str.substring(2, 5));
System.out.println("Integer to String is:"+ strLength.toString()) ;
String str1=" Beautiful ";
System.out.println("Untrimmed string is:"+ str1);
System.out.println("Trimmed string is:"+ str1.trim());
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

//Instantiate class, Strings
StringDemo objString = new StringDemo(); // line 1

//Invoke the displayStrings() method
objString.displayStrings();
}
}
