import java.util.Base64;
public class main {
    public static void main(String... args) throws Exception {
        final String s = "Hello";
        final byte[] authBytes = s.Bytes("UTF8");
        final String encoded = 
Base64.getEncoder().encodeToString(authBytes);
        System.out.println(s + " is encoded as " + encoded);
    }
}
