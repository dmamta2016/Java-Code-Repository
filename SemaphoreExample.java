import java.util.concurrent.*;

//A SharedData resource/class.
class SharedData
{
	static int count = 0;
}

class AppThread extends Thread
{
	Semaphore sema;
	String thrdName;
	public AppThread(Semaphore sema, String thrdName)
	{
		super(thrdName);
		this.sema = sema;
		this.thrdName = thrdName;
	}

	@Override
	public void run() {
		
		// run by thread X
		if(this.getName().equals("X"))
		{
			System.out.println("Starting " + thrdName);
			try
			{
				// First, get a permit.
				System.out.println(thrdName + " is waiting for a permit.");
			
				// acquiring the lock
				sema.acquire();
			
				System.out.println(thrdName + " gets a permit.");
		
				// Now, accessing the SharedData resource.
				// other waiting threads will wait, until this
				// thread release the lock
				for(int i=0; i < 5; i++)
				{
					SharedData.count++;
					System.out.println(thrdName + ": " + SharedData.count);
		
					// Now, allowing a context switch -- if possible.
					// for thread Y to execute
					Thread.sleep(10);
				}
			} catch (InterruptedException exc) {
					System.out.println(exc);
				}
		
				// Release the permit.
				System.out.println(thrdName + " releases the permit.");
				sema.release();
		}
		
		// run by thread Y
		else
		{
			System.out.println("Starting " + thrdName);
			try
			{
				// First, get a permit.
				System.out.println(thrdName + " is waiting for a permit.");
			
				// acquiring the lock
				sema.acquire();
			
				System.out.println(thrdName + " gets a permit.");
		
				// Now, accessing the SharedData resource.
				// other waiting threads will wait, until this
				// thread release the lock
				for(int i=0; i < 5; i++)
				{
					SharedData.count--;
					System.out.println(thrdName + ": " + SharedData.count);
		
					// Now, allowing a context switch -- if possible.
					// for thread X to execute
					Thread.sleep(10);
				}
			} catch (InterruptedException exc) {
					System.out.println(exc);
				}
				// Release the permit.
				System.out.println(thrdName + " releases the permit.");
				sema.release();
		}
	}
}

// Driver class
public class SemaphoreExample
{
	public static void main(String args[]) throws InterruptedException
	{
		// creating a Semaphore object
		// with number of permits 1
		Semaphore sema = new Semaphore(1);
		
		// creating two threads with name X and Y
		// Note that thread X will increment the count
		// and thread Y will decrement the count
		AppThread mt1 = new AppThread(sema, "X");
		AppThread mt2 = new AppThread(sema, "Y");
		
		// stating threads X and Y
		mt1.start();
		mt2.start();
		
		// waiting for threads X and Y
		mt1.join();
		mt2.join();
		
		// count will always remain 0 after
		// both threads will complete their execution
		System.out.println("count: " + SharedData.count);
	}
}
