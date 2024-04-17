package javademo;
import java.io.*;
import java.util.*;
class Chopstick{
    boolean available;
     Chopstick(){
        this.available = true;
    }
    //Pick up the chopsticks
    public synchronized void takeUp(){
        // As long as someone is already using and chopstick is not available
        while (!available){
               try{
                System.out.println("Waiting to eat...");
                //Enter the waiting queue
                wait();
            }catch (InterruptedException e){        }
        }
        // Received the chopstick so mark it as unavailable for others 
        available = false;
    }
    // Put down the chopsticks
    public synchronized void putDown(){
        //  Finished eating then mark it as available so that other people can use
        available = true;       
    }
}
// Philosophers
class Philosopher extends Thread{
    Chopstick left;
    Chopstick right;
    int ID;
    // Parameterized Constructor
    public Philosopher(Chopstick left,Chopstick right,int ID){
        this.left = left;
        this.right = right;
        this.ID = ID+1;
    }
//Dining
    public void eat(){
        left.takeUp();
        right.takeUp();    
System.out.println(ID+"  : The Philosopher is Dining");
}
        //Thinking
    public void think(){
 left.putDown();
 right.putDown();
 System.out.println(ID+" : The Philosopher is Thinking");
    }
     public void run(){
 while (true){
 eat();
   try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 think();
            try {
             Thread.sleep(1000);
            }catch (InterruptedException ee){
            }
        }
    }
}
// Class to test the functionality
public class DiningDemo {
    public static void main(String[] args) throws IOException {
        int i;
        //5 chopsticks, 5 philosophers 
       Philosopher[] philosopher = new Philosopher[5];
  Chopstick[] chopstick = new Chopstick[5];
        //Instantiate
        for(i=0;i<5;i++){
             chopstick[i] = new Chopstick();
        }
         //Instantiate
        for(i=0;i<5;i++){
           philosopher[i] = new Philosopher(chopstick[i],chopstick[(i+1)%5],i);
        }
        //Start the process
        for(i=0;i<5;i++){
philosopher[i].start();
        }
    }
}