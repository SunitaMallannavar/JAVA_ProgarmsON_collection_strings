package java_programs_on_collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingOfArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		arr1.add(60);
		
		System.out.println("Original List  "+arr1);
		Collections.swap(arr1, 4, 1);
		System.out.println(" swaped list  "+arr1);

 
	}

}
