package chopsticksdemo;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
public class ChopsticksDemo  extends RecursiveTask<Integer> {
private static final int SEQUENTIAL_THRESHOLD = 5;
private final int[] data;
private final int startData;
private final int endData;
public ChopsticksDemo(int[] data, int startValue, int endValue) {
this.data = data;
this.startData = startValue;
this.endData = endValue;
}
public ChopsticksDemo(int[] data) {
this(data, 0, data.length);
}
//recursive method which forks all small work units and then joins them
@Override
protected Integer compute() {
final int length = endData - startData;
if (length < SEQUENTIAL_THRESHOLD) {
return computeDirectly();
}
final int midValue = length / 2;
final ChopsticksDemo leftValues = new ChopsticksDemo(data, 
startData,startData + midValue);
//forks all the small work units
leftValues.fork();
final ChopsticksDemo rightValues = new 
ChopsticksDemo(data,startData + midValue, endData);
//joins them all again using the join method
return Math.max(rightValues.compute(), leftValues.join());
}
private Integer computeDirectly() {
System.out.println(Thread.currentThread() + " computing: " +startData+ " to " + endData);
int max = Integer.MIN_VALUE;
for (int i = startData; i < endData; i++) {
if (data[i] > max) {
max = data[i];
}
}
return max;
}
public static void main(String[] args) {
// create a random object value set
final int[] value = new int[20];
final Random randObj = new Random();
for (int i = 0; i < value.length; i++) {
value[i] = randObj.nextInt(100);
}
// submit the task to the pool
final ForkJoinPool pool = new ForkJoinPool(4);
final newdemo maxFindObj = new newdemo(value);
//invokes the compute method
System.out.println("Maximum value after computing is: "+ 
pool.invoke(maxFindObj));
}
}

