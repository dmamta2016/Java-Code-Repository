import java.io.*;
public class DataInputDemo { 
public static void main (String [] args) { 
try { 
DataInputStream dis = new DataInputStream(System.in); 
System.out.print("Enter a double value: ");
double d = dis.readDouble(); 
System.out.print("Enter an integer value: ");
int num = dis.readInt();
}	
catch(IOException e) {
}
}
}
