package java_programs_on_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordsAndNumOfOccurance {

	public static void main(String[] args) {
		String str;  
		System.out.println("Enter a string: ");  
		Scanner scanner = new Scanner(System.in);  
		str = scanner.nextLine();  
		scanner.close();                   
        String[] words = str.toLowerCase().trim().split(" ");
        Map<String, Integer> duplicateString = new HashMap<>();
        int count = 1;
        for (String x : words) 
        {
            if (duplicateString.containsKey(x)) 
            {
                duplicateString.put(x, duplicateString.get(x) + 1);
            } 
            else 
            {
                duplicateString.put(x, count);
            }
        }
        System.out.println("Duplicate Words in a String : ");
        for (Map.Entry a : duplicateString.entrySet()) {
            int val = (Integer) a.getValue();
            if (val > 1) {
                System.out.println(a);
            }
        }
    }
}

	


