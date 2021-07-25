package java_programs_on_collections;

import java.util.HashSet;
import java.util.Set;

public class ComparingTwoSets {

	public static void main(String[] args) {
	Set<String> set1=new HashSet<String>();
	set1.add("A");
	set1.add("B");
	set1.add("C");	
	set1.add("D");
	set1.add("E");
	
	
	System.out.println("fIRST SET  "+set1);
	
	Set<String> set2=new HashSet<String>();
	set2.add("A");
	set2.add("B");
	set2.add("C");
	set2.add("D");
	set2.add("F");
	System.out.println("SecondList  "+set2);
	
	boolean value=set1.equals(set2);
	
	System.out.println("both are equal  "+value);
	
	}

}
