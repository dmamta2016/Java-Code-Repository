//Driver class to demonstrate the working of Flow API 
import java.util.concurrent.Flow;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
public class FlowAPIDemo {
		public static void main(String args[]) {
	      List<String> items = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
	      SubmissionPublisher<String> samplePublisher = new SubmissionPublisher<>();
	      samplePublisher.subscribe(new SubscriberDemo<>());
	      items.forEach(s -> {
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	         samplePublisher.submit(s);
	      });
	      samplePublisher.close();
	   }


}

