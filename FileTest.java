import java.io.*;
public class FileTest {
   public static void main(String[] args) {
File fileObj = new File("C:/Java Codes/Hello.txt");
System.out.println("Path is: " +fileObj.getPath());
System.out.println("Name is: " +fileObj.getName());
System.out.println("File exists is: " +fileObj.exists());
System.out.println("File is: " +fileObj.isFile());
   }
}