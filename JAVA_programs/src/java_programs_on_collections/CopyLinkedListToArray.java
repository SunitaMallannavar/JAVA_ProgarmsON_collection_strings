package java_programs_on_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CopyLinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Frist");
		list1.add("second");
		list1.add("third");
		list1.add("Fourth");
		Object[] objArry=list1.toArray();
		int length=objArry.length;
		String[] strArry=new String[length];
		for(int i=0;i<length;i++) {
			strArry[i]=(String)objArry[i];
		}
		System.out.println("content of the array  "+Arrays.toString(strArry));
		}

}
