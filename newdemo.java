import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class newdemo { 
public static void main(String argv[]) throws FileNotFoundException, IOException {       
 String temp = "One way to get the most out of life is to look upon it as an adventure.";
byte [] bufObj = temp.getBytes();
FileOutputStream fileObj = new FileOutputStream("Thought.txt");
fileObj.write(bufObj);
fileObj.close();    
}
}
