//Java program to demonstrate use of anonymous inner class

interface Age
{
    int x = 25;
    void getAge();
}
class MyClassTest
{
    public static void main(String[] args) {
        // Here, the implementation class is hidden inner class 
       // whose name is not declared but an object of it is 
// created.
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                 // printing age
                System.out.print("Age is "+x);
            }
        };
        oj1.getAge();
    }
}