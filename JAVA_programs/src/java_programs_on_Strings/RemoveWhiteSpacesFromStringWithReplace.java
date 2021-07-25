package java_programs_on_Strings;

import java.util.Scanner;

public class RemoveWhiteSpacesFromStringWithReplace {

	public static void main(String[] args) {
		String sentence;  
		System.out.println("Enter a string: ");  
		Scanner scanner = new Scanner(System.in);  
		sentence = scanner.nextLine();  
		scanner.close();                   
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}
	

