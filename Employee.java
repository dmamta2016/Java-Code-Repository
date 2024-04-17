 import java.lang.annotation.Documented;

@Documented
@interface TestAnnotate {

}
@TestAnnotate
public class Employee { public static void main(String args[]){
		SubClass obj = new SubClass();
		obj.show("Good day!!");
}
}