import java.time.*; 
class ClockDemo{
// Creates a new Clock instance based on UTC.
public static void main(String[] args) {
    
Clock defaultClock = Clock.systemUTC();
System.out.println("Clock : " + defaultClock);
System.out.println(defaultClock.getZone());

// Creates a clock instance based on system clock zone
Clock defaultClock2 = Clock.systemDefaultZone();
System.out.println("Clock : " + defaultClock2);
}
}