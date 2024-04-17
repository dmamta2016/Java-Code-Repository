import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
// Or simply add all generic lava  libraries
import java.util.*;
public class GFG1 {
	// Main driver method
	public static void main(String[] args) 	{
		// Creating arrayList list dynamically
		List<String> list = new ArrayList<String>();
		// List is created
		// Adding elements to the list
list.add("Let’s ");
		list.add("start ");
		list.add("Power ");
		list.add("Programming  ");
		list.add("With  ");
		list.add("Java ");
		// Converting list to an array
		String[] str = list.toArray(new String[0]);
		// Iterating over elements of array
		for (int i = 0; i < str.length; i++) {
			String data = str[i];
			// Printing elements of an array
			System.out.print(data);
		}
	}
}
