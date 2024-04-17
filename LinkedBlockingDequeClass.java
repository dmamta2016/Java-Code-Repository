/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericApplication;

/**
 *
 * @author mamta
 */
/* Save this as  LinkedBlockingDequeClass.java */
import java.util.AbstractMap;
public class LinkedBlockingDequeClass { 
public static void main(String[] args) { 
    AbstractMap.SimpleEntry<String,String> se = new AbstractMap.
SimpleEntry<String,String>("1","Apple");
System.out.println(se.getKey());
System.out.println(se.getValue());
se.setValue("Orange");
System.out.println(se.getValue());
    
    
    
/*BlockingDeque blockDeque = new LinkedBlockingDeque(5); 
Runnable produce = new ProducerDeque("Producer", blockDeque); 
Runnable consume = new ConsumerDeque("Consumer", blockDeque); 
new Thread(produce).start(); 
new Thread(consume).start(); */
} 
}
