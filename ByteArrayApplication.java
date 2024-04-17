import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
public class ByteArrayApplication {
 public static void main(String[] args) throws Exception {    
     String temp = "This is an example";
byte [] bufObj = temp.getBytes();
ByteArrayInputStream fileObj = new ByteArrayInputStream(bufObj); 
BufferedInputStream inObj = new BufferedInputStream(fileObj);
 }
}