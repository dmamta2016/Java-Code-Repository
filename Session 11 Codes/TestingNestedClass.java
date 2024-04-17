public class TestingNestedClass {

    public static void main(String[] args) {
            
        OuterClass outer = new OuterClass();
        
        
        outer.display();

        //static nested class instantiation
        OuterClass.Inner1 innerObj = new OuterClass.Inner1();
        innerObj.show();

       //non static nested aka inner class instantiation
        OuterClass.Inner2 inner = outer.new Inner2();
        inner.print();
    }
}