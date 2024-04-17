public class TestClass {
  private double num, exp;
  public TestClass(double num, double exp) {
       this.num = num;
       this.exp = exp;
    }
     /* Returns the string representation of this number.
       The format of string is "Number + e Value" where Number is the 
        number value and e Value is the exponent part.*/
    @Override
    public String toString() {
        return String.format(num + "E+" + exp);
    }
/**
     * @param args the command line arguments
*/
public static void main(String[] args) {
TestClass c1 = new TestClass(10, 15);
        System.out.println(c1);
    }
}
