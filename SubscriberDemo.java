import java.util.concurrent.Flow;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;


public class SubscriberDemo<T>implements Flow.Subscriber<T> {
	   private Flow.Subscription subs;
	   @Override
	   public void onSubscribe(Flow.Subscription subs) {
	      this.subs = subs;
	      this.subs.request(1);
	   }
	   @Override
	   public void onNext(T item) {
	      System.out.println(item);
	      subs.request(1);
	   }
	   @Override
	   public void onError(Throwable throwable) {
	      throwable.printStackTrace();
	   }
	   @Override
	   public void onComplete() {
	      System.out.println("Control is at complete method Done");
	   }
	}
