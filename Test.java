class SampleClass {
@Deprecated
public void doSpecificAction() {
        // method
}
public void doRandomAction() {
        // new, alternate method
}
}

@Deprecated
 class SampleContent {
}
public class Test   {
public static void main(String args[]){
 SampleClass c = new SampleClass();
 c.doSpecificAction();
 
}
}
