package java_programs_on_Strings;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurencesOfCHar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Programming";
		Map<Character,Integer> charMapCount=new HashMap<>();
		
		for(Character c:str.toCharArray())
		{
			if(charMapCount.containsKey(c))
			{
				charMapCount.put(c, charMapCount.get(c)+1);
			}
			else
			{
				charMapCount.put(c, 1);
			}
		}
		System.out.println(charMapCount);

	}

}











