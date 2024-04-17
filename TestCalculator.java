
import java.util.ArrayList;


public class PostconditionTest{
ArrayList values = new ArrayList();
public PostconditionTest(){
        values.add("one");
        values.add("two");
        values.add("three");
        values.add("four");
    }
   public Object pop(){
   int size = values.size();  // line 1
   if(size == 0)
     throw new RuntimeException("List is empty!!");
     Object result = values.remove(0) ;
   // verify the postcondition
     assert(values.size() == size -1);  // line 2
   return result;
 }

 public static void main(String[] args){
       PostconditionTest p = new PostconditionTest();
Object o = p.pop();
  }
}