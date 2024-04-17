package javaapplication2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Test{
public static void main(String[] args){
String flag;
 while (true) {
Pattern pattern1  =  Pattern.compile ("b[^at]\\S");
  Matcher matcher1 =   pattern1.matcher ("bat");
boolean found = false;     
while (matcher1.find()) {
     System.out.println(matcher1.group()+" "+ matcher1.start()+ " "+ matcher1.end());
     found = true;
   }
     if(!found){
       System.out.println("No match found.%n");  
   }
   // code to exit the application
   System.out.println("Press x to exit or y to continue");
   System.out.println("%nEnter your choice: ");
   Scanner scanner = new Scanner(System.in);
   flag=scanner.next();
   if(flag.equals("x"))
      System.exit(0);
   else
   continue;   
  }
 }
}