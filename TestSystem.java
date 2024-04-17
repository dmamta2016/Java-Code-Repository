class SystemClass {
int arr1[] = {1,3,2,4};
int arr2[] = {6,7,8,0}; 
public void getTime() {
System.out.println("Current time in milliseconds is: " + System. currentTimeMillis());
}
public void copyArray() { 
System.arraycopy(arr1, 0, arr2, 0, 3);
System.out.println("Copied array is: " ); 
for(int i=0; i<4; i++)
System.out.println(arr2[i]);
}
public void getPath(String variable) {
System.out.println("Value of Path variable is: " + System.getenv(variable));
}
}
public class TestSystem {
public static void main(String[] args) { 
	SystemClass objSys = new SystemClass(); 
	objSys.getTime();
objSys.copyArray(); 
objSys.getPath("Path");
}
}
