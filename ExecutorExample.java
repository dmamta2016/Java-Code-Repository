import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class ExecutorExample {
	public static void main(String[] args)
	{
		ImplementExecutor obj = new ImplementExecutor();
		try {
			obj.execute(new NewThrd());
		}
		catch (RejectedExecutionException
			| NullPointerException exception) {
			System.out.println(exception);
		}
	}
}

class ImplementExecutor implements Executor {
	@Override
	public void execute(Runnable command)
	{
		new Thread(command).start();
	}
}

class NewThrd implements Runnable {
	@Override
	public void run()
	{
		System.out.println("This thread executed under executor");
	}
}
