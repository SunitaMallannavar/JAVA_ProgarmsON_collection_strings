package java_programs_on_collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GetAllKeysInTreeMap {

	public static void main(String[] args) {
		// Creating a New TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
 
        // Add elements to TreeMap
        // Custom inputs
        treeMap.put(1, "Welcome");
        treeMap.put(2, "geeks");
        treeMap.put(3, "on");
        treeMap.put(4, "geeksforgeeks");
 
        // Get entry set of the TreeMap using entrySet
        // method
        Set<Map.Entry<Integer, String> > entrySet
            = treeMap.entrySet();
 
        // Convert entrySet to Array using toArray method
        Map.Entry<Integer, String>[] entryArray
            = entrySet.toArray(
                new Map.Entry[entrySet.size()]);
 
        // For loop for iteration  and printing
        for (int i = 0; i < 4; i++)
        {
            // Get Key using index and print
            System.out.println("Key at " + i + ":"
                               + entryArray[i].getKey());
 
            // Get value using index and print
            System.out.println("Value at " + i + ":"
                               + entryArray[i].getValue());

	}}}


