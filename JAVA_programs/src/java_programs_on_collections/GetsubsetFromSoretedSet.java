package java_programs_on_collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class GetsubsetFromSoretedSet {

	public static void main(String[] args) {
		// Create a TreeSet and inserting elements
        SortedSet<Integer> s = new TreeSet<>();
  
        // Adding Element to SortedSet
        s.add(1);
        s.add(5);
        s.add(2);
        s.add(3);
        s.add(9);
  
        // Returning the set with elements
        // ranging between the passed value
        System.out.print("Elements range between 2 and 9 in set are : "
                         + s.subSet(2, 9));
    }
	}


