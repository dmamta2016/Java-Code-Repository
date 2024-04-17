/* Creating  multiple threads using a class derived from Thread class 
*/
package test;
/** 
* MultipleThreads is created as a subclass of the class Thread 
*/
public class MultipleThreads extends Thread { 
 // Variable to store the name of the thread 
    String name;
/** 
* This method of Thread class is overridden to specify the action
* that will be done when the thread begins execution. 
*/ 
public void run() { 
 while(true) { 
 name = Thread.currentThread().getName();

System.out.println(name); 
   try {              
Thread.sleep(500); 
    } catch(InterruptedException e) { 
     break; 
    } 
 }// End of while loop  
}
/** 
* This is the entry point for the MultipleThreads class. 
*/ 
 public static void main(String args[]) { 
   MultipleThreads t1 = new MultipleThreads(); 
   MultipleThreads t2 = new MultipleThreads(); 
   t1.setName("Thread2"); 
   t2.setName("Thread3"); 
   t1.start(); 
   t2.start(); 
   System.out.println("Number of threads running: " +     Thread.activeCount()); 
 }
}
