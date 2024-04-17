public class LocalInnerClassDemo{  
 
void display(){ 
String msg="Hello";
class Local{ 
void getMessage(){ 
System.out.println("Message from local inner class: "+msg);
} 
} 
Local l = new Local(); 
l.getMessage(); 
} 
public static void main(String args[]){ 
LocalInnerClassDemo obj = new LocalInnerClassDemo(); 
obj.display(); 
} 
}