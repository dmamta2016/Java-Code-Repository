import java.io.File;
import java.io.FileInputStream; import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;


public class D { public static void main(String args[]) {
try {
File filein = new File("C:/Java/Hello.txt"); FileInputStream finRead = new FileInputStream(filein);
File fileout = new File("C:/Java/DeflatedMain.dfl"); FileOutputStream foutWrite = new FileOutputStream(fileout);
DeflaterOutputStream deflWrite = new DeflaterOutputStream(foutWrite); System.out.println("Original file size " + filein.length());
// Reading and writing the compressed data int bread = 0;
while ((bread = finRead.read()) != -1) { deflWrite.write(bread);
}
// Closing objects deflWrite.close(); finRead.close();
System.out.println("File size after compression " + fileout.length());
} catch (Exception e) { e.printStackTrace();
}
}
}
