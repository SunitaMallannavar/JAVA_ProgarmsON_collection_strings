package java_programs_on_collections;

import java.util.TreeMap;

public class CopyFromMapToTreeMap {

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
  
        // Displaying the cloned TreeMapusing clone()
        System.out.println("The cloned map look like this: " + 
        tree_map.clone());

	}

}
