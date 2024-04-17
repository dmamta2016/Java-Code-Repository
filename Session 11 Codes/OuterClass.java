public class OuterClass {
    
    public static int x;
    public void display()
    {
        System.out.println("Inside Outer class");
    }
    public static class Inner1 {
       public void show()
        {
            System.out.println("Inside Inner1 class");
        }
    }
    public class Inner2 {
        public void print(){
            
            class B{}
        System.out.println("Inside Inner2 class");
    }
    }
}