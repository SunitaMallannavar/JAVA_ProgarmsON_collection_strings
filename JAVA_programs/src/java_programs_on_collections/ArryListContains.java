package java_programs_on_collections;

import java.util.ArrayList;
import java.util.List;

public class ArryListContains {

	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("sunita");
		li.add("Mallannavar");
		li.add("testyamtra");
		System.out.println(li);
		List<String> li1=new ArrayList<String>();
		li1.add("sunita");
		li1.add("Mallannavar");
		System.out.println("Arraylist contains all list elemnts  "+li.containsAll(li1));
		li1.add("qps");
		System.out.println("Arraylist contains all list elemnts   "+li.containsAll(li1));
		
	}
}
