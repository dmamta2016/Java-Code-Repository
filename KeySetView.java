import java.util.Iterator;
import java.util.Map; import java.util.Set;
import java.util.concurrent.ConcurrentHashMap; public class KeySetView {
public static void main(String[] args) { Map<String,String> map =
new ConcurrentHashMap<>(); map.put("Java", "Java");
map.put("Java EE", "Java EE");
map.put("Spring", "Spring"); Set keySet = map.keySet(); System.out.println(keySet);
}
}
