import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharacterInString {

	public static String str ="Find the Reapeted String";
	
	public static void main(String[] args) {
		
		char[] charArr = str.toCharArray();
		
		HashMap<Character, Integer> mapCount = new HashMap<Character, Integer>();
		for(char temp: charArr) {
	  
		if(mapCount.containsKey(temp)) {
			mapCount.put(temp, mapCount.get(temp)+1);
		}else {
			mapCount.put(temp, 1);
		}
		}
		
		//1. Extrating the count by using Set.
		
		  Set sets = mapCount.keySet();
		  for(Object set: sets) { 
			  if(mapCount.get(set)>1) {
	      System.out.println(set+":"+mapCount.get(set)); 
				  }
			  }
		 
		//2. Extrating the count by using Set.
		Set <Map.Entry<Character, Integer>> sets1 = mapCount.entrySet();
		for(Map.Entry<Character, Integer> set: sets1) {
			if(set.getValue()>1) {
				System.out.println(set.getKey()+":"+set.getValue());
			}
		
		}
	}
}
