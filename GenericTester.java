package GenericApplication;
import java.util.*; 
interface NumStack  { 
public boolean empty(); 
public void push(Object elt); 
public Object retrieve(); 
}
class NumArrayStack implements NumStack { 
private List listObj; 
public NumArrayStack() { 
listObj = new ArrayList(); 
} 
public boolean empty()  { 
return listObj.size() == 0; 
} 
public void push(Object obj) { 
listObj.add(obj); 
} 
public Object retrieve() { 
Object value = listObj.remove(listObj.size()-1); 
return value; 
} 
 public String toString() { 
return "stack" + listObj.toString();
}
}
class GenericTester { 
public static void main(String[] args) { 
NumStack stackObj = new NumArrayStack(); 
for (int ctr = 0; ctr<4; ctr++) { 
stackObj.push(new Integer(ctr)); 
} 
assert stackObj.toString().equals("stack[0, 1, 2, 3]"); 
int top = ((Integer)stackObj. retrieve()).intValue(); 
System.out.println("Value is : " + top); 
}
}
