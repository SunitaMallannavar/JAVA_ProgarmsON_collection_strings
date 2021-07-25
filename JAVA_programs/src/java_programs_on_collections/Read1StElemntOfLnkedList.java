package java_programs_on_collections;

import java.util.LinkedList;

public class Read1StElemntOfLnkedList {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Frist");
		list1.add("second");
		list1.add("third");
		list1.add("Fourth");
		
		System.out.println("Original Elemnts "+list1);
		
		System.out.println("Frist ELement  "+list1.getFirst());
	}

}
