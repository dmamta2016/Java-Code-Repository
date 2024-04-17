import java.io.*;
public class DataOutputDemo {
    public static void main(String[] args) {        
        try {
            FileInputStream inObj = null;
            DataOutputStream outStream = new DataOutputStream(
                    new FileOutputStream(
                            "Scores.data"));
            outStream.writeBoolean(true);
            outStream.writeDouble(9.95);            
            outStream.close();
        } catch (IOException e) {        }
    }    
}