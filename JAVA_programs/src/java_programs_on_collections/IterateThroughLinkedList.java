package java_programs_on_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateThroughLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Frist");
		list1.add("second");
		list1.add("third");
		list1.add("Fourth");
		list1.add("2021");
		list1.add("2022");
		
		System.out.println("Original Elemnts "+list1);
		Iterator<String> iterator = list1.descendingIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
	}

}
