class Furniture {
    String ID;
    float price;
     public Furniture(String ID, float price){
        this.ID = ID;
        this.price = price;
     }
     public void displayDetails() {
         System.out.println("ID: "+ID);
         System.out.println("Price: "+price);
     }
}
public class Table extends Furniture
{
String type;  
public Table(String ID, float price, String type) {   
     super(ID,price);
     this.type = type;
}
public void displayDetails(){   
        super.displayDetails();
        System.out.println("Type: "+type);
   }
public static void main(String[] args){   
       Furniture obj = new Table("F001 ", 2000F, "Wooden ");
       obj.displayDetails();
   }
}