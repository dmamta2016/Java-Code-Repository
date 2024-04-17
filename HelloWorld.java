import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

/**Aptech Java 
*Base64 example in detail
*/

public class HelloWorld {
public static void main(String args[]){
try {
 // Encoding a string using Base64
 String sampleBase64EncoStr = Base64.getEncoder().encodeToString("AptechJava8".getBytes("utf-8"));
System.out.println("Encoded String (Basic) looks like this: " + sampleBase64EncoStr);
		
 // Decoding a string using Base64
byte[] base64decodedBytes = Base64.getDecoder().decode(sampleBase64EncoStr);
		
System.out.println("Decoded String is : " + new String(base64decodedBytes, "utf-8"));
sampleBase64EncoStr = Base64.getUrlEncoder().encodeToString("AptechJava8".getBytes("utf-8"));
System.out.println("Encoded String (URL)looks like this: " + sampleBase64EncoStr);
StringBuilder strBuild = new StringBuilder();
		
for (int j = 0; j < 10; ++j) {
strBuild.append(UUID.randomUUID().toString());
         }			
byte[] sampleMimeBytes = strBuild.toString().getBytes("utf-8");
String sampleMimeEncoStr = Base64.getMimeEncoder().encodeToString(sampleMimeBytes);
System.out.println("Encoded String (MIME) looks like this: " + sampleMimeEncoStr);

}catch(UnsupportedEncodingException u){// to display error
System.out.println("Unsupported Encoding Error: " + u.getMessage());
 }
   }
}
