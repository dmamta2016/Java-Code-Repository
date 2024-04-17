import java.lang.annotation.Repeatable;

@Repeatable(ScoreSchedules.class)
 @interface ScoreSchedule {
  String monthDay() default "1st";
  String weekDay() default "Monday";
  int hour() default 12;
}

@interface ScoreSchedules {
ScoreSchedule[] value();
}

public class RepeatingDemo {

public static void main(String args[]){}
@ScoreSchedule(monthDay="last")
@ScoreSchedule(weekDay="Fri", hour=23)
public void scorePapers() {  }
}
