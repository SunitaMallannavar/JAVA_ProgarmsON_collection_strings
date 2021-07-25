package java_programs_on_collections;

import java.util.ArrayList;

/*
 How to copy orClone ArrayList
 */
public class CloneAryList {

	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<Integer>();
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		ArrayList<Integer>li1=(ArrayList<Integer>)li.clone();
		System.out.println(li1);
		
		
		

	}

}
