
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo { 
public static class Person implements Serializable {
        public String name = null;
        public int age = 0;
    }
   public static void main(String[] args) throws IOException, 
ClassNotFoundException {
        ObjectOutputStream objectOutputStream =
            new ObjectOutputStream(new FileOutputStream("customer.dat"));
        Person person = new Person();
        person.name = "Michael Smith";
        person.age  = 44;
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
        System.out.println("Done");	
        
        FileInputStream fObj = new FileInputStream("customer.dat");
ObjectInputStream ois = new ObjectInputStream(fObj);
Person obj = (Person) ois.readObject();
System.out.println(obj.name);
ois.close();
    }
}

