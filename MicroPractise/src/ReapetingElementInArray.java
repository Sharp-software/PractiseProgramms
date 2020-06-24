import java.util.HashMap;
import java.util.Map;

public class ReapetingElementInArray {

	static int [] input = {1,5,100,7,8,1,100,2,3};
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<input.length; i++) {
			if(map.containsKey(input[i])) {
				map.put(input[i], map.get(input[i])+1);
			}else {
				map.put(input[i], 1);
			}
		}
		
		//Extracting the map to find the reapeting element
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>=2) {
				System.out.println(entry.getKey()+ ":" +entry.getValue());
			}
		}
		
	}
	
	
}
