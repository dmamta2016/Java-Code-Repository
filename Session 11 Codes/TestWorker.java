class Worker {
public void evaluateStatus(String workerID, int exp){
// local final variable
final int experience=10;
/**
 * Local inner class Grade
 *
 */
class Grade{

public String getGrade(String workerID){
System.out.println("Getting Grade for the worker: "+ workerID);String grade="M1";
return grade;
}
}

// Check the specified experience
if(exp > experience){
// Instantiate the Grade class
Grade obj = new Grade();
String grade = obj.getGrade(workerID);
// Verify the value
if(grade == "M1") {
System.out.println("Worker grade is: "+ grade);
}
}
}
}
public class TestWorker {
public static void main(String[] args)
{
if(args.length==2) {
// Object of outer class
Worker objWorker = new Worker();

objWorker.evaluateStatus(args[0], Integer.parseInt(args[1]));
}
else{
System.out.println("Usage: Worker <Emp-Id> <Experience>");
}
}
}
