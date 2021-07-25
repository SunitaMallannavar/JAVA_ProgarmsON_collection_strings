package java_programs_on_collections;

import java.util.TreeMap;

public class GetEntrySetFromTreeMap {

	public static void main(String[] args) {
		 // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
  
        // Mapping string values to int keys
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
  
        // Displaying the TreeMap
        System.out.println("Initial Mappings are: " + tree_map);
  
        // Using entrySet() to get the set view
        System.out.println("The set is: " + tree_map.entrySet());
	}

}
