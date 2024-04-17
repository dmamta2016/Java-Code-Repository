import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamApp {
public static void main(String[] args) throws IOException {
        FileInputStream inObj = null;
              FileOutputStream outObj = null;
        try {
            inObj = new FileInputStream("c:/java/hello.txt");
outObj = new FileOutputStream("outagain.txt");
  int ch;
            while ((ch = inObj.read()) != -1) {
                outObj.write(ch);
            }
        } finally {
            if (inObj != null) {
                inObj.close();
            }
 if (outObj != null) {
                outObj.close();
            }
        }
    }
}
