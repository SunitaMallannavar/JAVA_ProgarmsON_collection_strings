package java_programs_on_collections;

import java.util.TreeMap;

public class FirstKeyInTreeMap {

	public static void main(String[] args) {
		 // Declaring the tree map of Integer and String
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
  
        // assigning the values in the tree map
        // using put()
        treemap.put(2, "two");
        treemap.put(7, "seven");
        treemap.put(3, "three");
        treemap.put(1, "one");
        treemap.put(6, "six");
        treemap.put(9, "nine");
  
        // use of firstEntry()
        System.out.println("Lowest entry is: " + treemap.firstEntry());

	}

}
