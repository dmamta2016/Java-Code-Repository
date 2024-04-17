import java.io.CharArrayWriter;
import java.io.IOException;
public class CharArrayWriterDemo { 
public static void main(String[] args) throws IOException { 
// Create a CharArrayWriter object which can hold 11 characters. 
CharArrayWriter writer = new CharArrayWriter(11); 
String str ="Hello Aptech"; 
writer.write("Hello Aptech", 6, str.length() - 6); 
System.out.println("The CharArrayWriter buffer contains: " + 
writer.toString()); 
writer.flush(); 
// Print out the contents of the CharArrayWriter buffer. 
System.out.println("After flushing the CharArrayWriter, buffer " + "contains: " + writer.toCharArray()); 
// Now reset the buffer we just populated. 
writer.reset(); 
// Print out the contents of the CharArrayWriter buffer.
System.out.println("After reset, CharArrayWriter buffer " + "contains: " + writer.toCharArray()); 
// Close the CharArrayWriter and StringWriter buffers. 
writer.close(); 
}
}
