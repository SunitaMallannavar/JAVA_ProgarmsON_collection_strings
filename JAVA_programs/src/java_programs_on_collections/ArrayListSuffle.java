package java_programs_on_collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSuffle {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		arr1.add(60);
		
		System.out.println("Original List  "+arr1);
		Collections.shuffle(arr1);
		System.out.println("shuffled list  "+arr1);

}
}
