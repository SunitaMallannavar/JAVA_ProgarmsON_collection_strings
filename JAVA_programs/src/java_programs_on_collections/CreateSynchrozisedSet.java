package java_programs_on_collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CreateSynchrozisedSet {

	public static void main(String[] args)throws Exception
	    {
	  
	        try {
	  
	            // creating object of Set<String>
	            Set<String> set = new HashSet<String>();
	  
	            // populate the set
	            set.add("1");
	            set.add("2");
	            set.add("3");
	  
	            // printing the Collection
	            System.out.println("Set : " + set);
	  
	            // create a synchronized set
	            Set<String>
	                synset = Collections.synchronizedSet(set);
	  
	            // printing the set
	            System.out.println("Synchronized set is : "
	                               + synset);
	        }
	  
	        catch (IllegalArgumentException e) {
	            System.out.println("Exception thrown : " + e);

	}

}}
