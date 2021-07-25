package java_programs_on_collections;

import java.util.HashSet;

public class CopySetTOHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(60);
		HashSet<Integer> copyofhset=new HashSet<>();
		copyofhset.addAll(hset);
		System.out.println("Originalset  "+hset);
		
		System.out.println("copy of hashset  "+copyofhset);
		
		
	}

}
