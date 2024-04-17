// User-defined functional interface  
interface FuncInterface {
    // An abstract function
    void abstractFun(int x);
    // A non-abstract (or default) function
    default void normalFun() {
       System.out.println("Hello");
    }
}  
public class ListDemo{
    public static void main(String args[])   {
        // lambda expression to implement user-defined functional interface 
//created earlier. This interface, by default, implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(3*x);
      // This statement calls the lambda expression and prints 18.
        fobj.abstractFun(6);
    }
}
