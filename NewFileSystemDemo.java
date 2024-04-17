//This Java Program is to illustrate use of new methods of FileSystems class 

//Importing URI class from java.net package
import java.net.URI;
//Importing required file classes from java.nio package
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
//Importing Map and HashMap classes from java.util package
import java.util.HashMap;
import java.util.Map;
//Main class
public class NewFileSystemDemo {
  public static void main(String[] args) {
       try {
            Map<String, String> env = new HashMap<>();
         // in the below line we are trying to get path of zip file
         Path zipPath = Paths.get("ASample.zip");
         // Creating URI from zip path received
         URI Uri = new URI("jar:file", zipPath.toUri().getPath(), null);
         // Create new file system from uri
         FileSystem filesystem = FileSystems.newFileSystem(Uri, env);
         // Display message to inform user
		 System.out.println("Hurray, you have created File System successfully.");

		 System.out.println(filesystem.getPath());
         // Here, we check if file system is open or not, using isOpen() method
         if (filesystem.isOpen())            
             System.out.println("It seems File system is open");
         else
             System.out.println("It seems File system is closed");
     }     
     catch (Exception e) {
         // Print the exception with line number
        e.printStackTrace();
     }
 }
}