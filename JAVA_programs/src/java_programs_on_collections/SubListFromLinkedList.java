package java_programs_on_collections;

import java.util.LinkedList;
import java.util.List;

public class SubListFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Frist");
		list1.add("second");
		list1.add("third");
		list1.add("Fourth");
		System.out.println("Elements of linked list "+list1);
		int strat=1,end=3;
		List sublist=list1.subList(strat, end);
		System.out.println("The requiered sublist   "+sublist);
		
	}

}
