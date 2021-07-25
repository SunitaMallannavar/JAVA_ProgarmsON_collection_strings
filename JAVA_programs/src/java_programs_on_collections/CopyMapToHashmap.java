package java_programs_on_collections;

import java.util.HashMap;
import java.util.Map;

public class CopyMapToHashmap {
	public static <K,V>Map<K,V>copyMap(Map<K,V>original)
	{
		Map<K,V>secondMap=new HashMap<>();
		for(Map.Entry<K, V>entry:original.entrySet())
		{
			secondMap.put(entry.getKey(), entry.getValue());
			
		}
		return secondMap;
	}

	public static void main(String[] args) {
		Map<String,Integer> hashmap=new HashMap<>();
		hashmap.put("A",1);
		hashmap.put("B",2);
		hashmap.put("C",3);
		hashmap.put("D",4);
		
		Map<String,Integer> secondMap=copyMap (hashmap);
		System.out.println(secondMap);

	}

}
