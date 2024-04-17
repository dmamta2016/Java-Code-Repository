public class ClassOne
{
	public void show(String testmsg){
		System.out.println(testmsg);
	}
  public static void main(String args[]){
		SubClass obj = new SubClass();
		obj.show("Good day!!");
}
}
class SubClass extends ClassOne
{
	@Override
	public void show(String testmsg){
		System.out.println(" I want to say: "+ testmsg);
	}	
}
