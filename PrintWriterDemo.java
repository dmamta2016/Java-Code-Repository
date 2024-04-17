import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
public class PrintWriterDemo {
 public static void main(String[] args) throws Exception {    
     
     
/*String temp = "Hello World";
int size = temp.length();
char [] ch = new char[size];
temp.getChars(0, size, ch, 0);
CharArrayReader readObj = new CharArrayReader(ch, 0, 5);*/


CharArrayWriter fObj = new CharArrayWriter();

String temp = "Hello World";
int size = temp.length();
char [] ch = new char[size];
temp.getChars(0, temp.length(), ch, 0);
fObj.write(ch);
char[] buffer = fObj.toCharArray();
System.out.println(buffer);
System.out.println(fObj.toString());


/*InputStreamReader reader = new InputStreamReader (System.in);
OutputStreamWriter writer = new OutputStreamWriter (System.out);
PrintWriter pwObj = new PrintWriter (writer,true);
int tmp = 0;
char ch;
try { 
while (tmp != -1) 
{ 
tmp = reader.read (); 
ch = (char) tmp; 
pwObj.println ("echo " + ch);
} 
}
catch (IOException e){ 
System.out.println ("IO error:" + e );
}*/
 }
}
