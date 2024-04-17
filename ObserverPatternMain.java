import java.util.*;
	
	class Item extends Observable{
private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String itemName;
    private String itemType;
    String availability;
public Item(String itemName, String itemType,String availability) {
	super();
this.itemName = itemName;
	this.itemType = itemType;
	this.availability=availability;
}
public ArrayList<Observer> getObservers() {
		return observers;
	}
public void setObservers(ArrayList<Observer> observers) {
this.observers = observers;
	}
	public String getItemName() {
			return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getAvailability() {
          return availability;
	}
public void setAvailability(String availability) {
		if(!(this.availability.equalsIgnoreCase(availability))) {
			this.availability = availability;
			setChanged();
			notifyObservers(this,availability);
		}
	}
	public void notifyObservers(Observable observable,String 
                                  availability)   {
		System.out.println("Notifying to all the subscribers when item became available");
for (Observer ob : observers) {
             ob.update(observable,this.availability);
      }
}	
public void registerObserver(Observer observer) {
observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		 observers.remove(observer);
	}
}
class Customer implements Observer{
	String customerName;
	public Customer(String customerName) {
		this.customerName = customerName;
}
public String getCustomerName() {
return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
public void update(Observable arg0, Object arg1) {
		System.out.println("Hello "+customerName+", Item is now "+arg1+" our online shopping store");
}
}

public class ObserverPatternMain {
   public static void main(String[] args) {
	Customer cust1=new Customer("Sarah Heyward");
	Customer cust2=new Customer("Jim Gordon");
Item newitem=new Item("EBook Reader", "Device", "Not available");
 newitem.registerObserver(cust1);
	newitem.registerObserver(cust2);
	//Now the item becomes available
	newitem.setAvailability("Available");
   }
}
