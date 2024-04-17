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

import java.util.concurrent.BlockingDeque;
public class ProducerDeque implements Runnable { 
private String name; 
private BlockingDeque blockDeque;
public ProducerDeque(String name, BlockingDeque blockDeque) { 
this.name = name; 
this.blockDeque = blockDeque; 
} 
public void run() { 
for (int i = 1; i < 10; i++) { 
try { 
blockDeque.addFirst(i); 
System.out.println(name + " puts " + i); 
Thread.sleep(100);
} catch (InterruptedException e) { 
e.printStackTrace(); 
} catch (IllegalStateException ex) { 
System.out.println("Deque filled upto the maximum capacity");
System.exit(0); 
} 
} 
}
}
