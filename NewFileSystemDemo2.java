import java.util.*;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.*;
public class NewFileSystemDemo2 {
    public static void main(String [] args) throws Throwable {
        Map<String, String> env = new HashMap<>(); 
        env.put("create", "true");
        // locate file system by using the syntax 
        // defined in java.net.JarURLConnection
        URI uri = URI.create("jar:file:/c:/first/ASample.zip");        
       try (FileSystem zipfs = FileSystems.newFileSystem(uri, env)) {
            Path externalTxtFile = Paths.get("/first/Java1.txt");
            Path pathInZipfile = zipfs.getPath("/Java1.txt");          
            // // Here we copy a file into the zip file
            Files.copy( externalTxtFile,pathInZipfile, StandardCopyOption.REPLACE_EXISTING ); 
			System.out.println("Copy Successful");	  
        } 
		catch(Exception e){
	        System.out.print(e);
	    }
    }
}