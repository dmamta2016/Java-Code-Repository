/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
package GenericApplication;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
class ConsumerDeque implements Runnable { 
private String name; 
private BlockingDeque blockDeque; 
public ConsumerDeque(String name, BlockingDeque blockDeque) { 
this.name = name; 
this.blockDeque = blockDeque;
}
public void run() { 
for (int i = 1; i < 10; i++) { 
try { 
int j = (Integer) blockDeque.peekFirst(); 
System.out.println(name + " takes " + j); 
Thread.sleep(100); 
} catch (InterruptedException e) { 
e.printStackTrace();
} 
} 
}
}

