
package GenericApplication;

import java.util.ArrayList;
import java.util.List;

public class MyTest 
{ 
public static <T> void copy(List <? super T> destObj, List<? extends T> srcObj) 
{ 
for (int ctr=0; ctr<srcObj.size(); ctr++) 
{ 
destObj.set(ctr, srcObj.get(ctr)); 
}
}

public static void main(String[] args) {
    
    List<String> s1= new ArrayList<String>();
    s1.add("x");
    s1.add("y");
    s1.add("z");
    List<String> s2= new ArrayList<String>();
    MyTest.copy(s1,s2);
       
    for (String item : s2) {
    if (item instanceof String) {
        String s = (String) item;
    System.out.println(s);
    
    }
    }
    
    
    
}
}


