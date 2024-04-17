import java.io.*;
public class FileDescriptorDemo { 
public static void main (String [] args) { 
try{
FileOutputStream fileObj = new FileOutputStream ("c:/java codes/Hello.txt"); 
FileDescriptor fdobj = null; 
fdobj=fileObj.getFD();
if (!fdobj.valid()) 
throw new SecurityException("Invalid FileDescriptor");
else
    System.out.println("Retrieved valid file descriptor");
    }
    catch(IOException ie){}
} 
}
