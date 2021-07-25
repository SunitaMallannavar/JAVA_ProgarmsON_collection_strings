package java_programs_on_collections;

import java.util.TreeMap;

public class SearchKeyInTreeMap {

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
  
        // Checking for the key_element '20'
        System.out.println("Is the key '20' present? " + 
        tree_map.containsKey(20));
  
        // Checking for the key_element '5'
        System.out.println("Is the key '5' present? " + 
        tree_map.containsKey(5));

	}

}
