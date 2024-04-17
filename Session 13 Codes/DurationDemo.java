
import java.time.Duration;
import java.time.Instant;

public class DurationDemo {

    public static void main(String[] args) {
        Instant first = Instant.now();
//get another instant
        Instant second = Instant.now();
        Duration present = Duration.between(first, second);
        System.out.println(present.toMinutes());
        Duration samplePlusA = present.plusMinutes(15);
        //Duration sampleMinusA = present.minusMinutes(3);
        System.out.println(samplePlusA.toMinutes());
    }
}