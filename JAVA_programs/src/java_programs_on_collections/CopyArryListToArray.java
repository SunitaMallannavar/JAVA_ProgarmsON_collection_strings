package java_programs_on_collections;

import java.util.ArrayList;

public class CopyArryListToArray {

	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Frist");
		arr1.add("second");
		arr1.add("third");
		arr1.add("Fourth");
		System.out.println("Actual ArrayList  "+arr1);
		String[] strarr=new String[arr1.size()];
		arr1.toArray(strarr);
		System.out.println("created Array content  ");
		for(String str:strarr)
		{
			System.out.println(str);
		}

}
}
