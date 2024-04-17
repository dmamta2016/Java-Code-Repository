package javaapplication2;

/*import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegEx{
public static void main(String[] args){
String flag;
 while (true) {
     System.out.print("Enter expression: ");
      Scanner scanner = new Scanner(System.in);
Pattern pattern1  =  Pattern.compile (scanner.next());
System.out.print("Enter string to search: ");
Matcher matcher1 =  pattern1.matcher (scanner.next());
boolean found = false;     
while (matcher1.find()) {
     System.out.printf("Found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n", matcher1.group(),     matcher1.start(), matcher1.end());
     found = true;
   }
     if(!found){
       System.out.printf("No match found.\n");  
   }
   // code to exit the application
   System.out.println("Press x to exit or y to continue");
   System.out.println("Enter your choice: ");
   flag=scanner.next();
   if(flag.equals("x"))
      System.exit(0);
   else
      continue;   
  }
 }
}*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegEx{
  private static final String REGEX = "\\d";
    private static final String DAYS = "Sun1Mon2Tue3Wed4Thu5Fri6Sat";    
    public static void main(String[] args) {
       Pattern objP1 = Pattern.compile(REGEX);
        String[] days = objP1.split(DAYS);
 for(String s : days) {
            System.out.println(s);
}    
       }
}

