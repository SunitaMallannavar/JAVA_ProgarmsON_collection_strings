package java_programs_on_collections;

import java.util.HashMap;

public class DeletElemntsFromHashmap {

	public static void main(String[] args) {
		 // Creating an empty HashMap
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Mapping string values to int keys
	    hashmap.put(10, "Geeks");
	    hashmap.put(15, "4");
	    hashmap.put(20, "Geeks");
	    hashmap.put(25, "Welcomes");
	    hashmap.put(30, "You");
	 
	    // Displaying the HashMap
	    System.out.println("Initial Mappings are: " + hashmap);
	 
	    // Removing the existing key mapping
	    String returned_value = (String)hashmap.remove(20);
	 
	    // Verifying the returned value
	    System.out.println("Returned value is: "+ returned_value);
	 
	    // Displaying the new map
	    System.out.println("New map is: "+ hashmap);

	}

}
