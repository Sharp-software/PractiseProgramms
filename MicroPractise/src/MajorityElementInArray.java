import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {
	
	//Majority of an element is : If an element appears more than the total array size divided by two.

	public static int [] array = {20,100,100,45, 100, 67, 100};
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<array.length; i++) {
			 
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}	
		}
		
		//Extracting the map
		int size = array.length/2;
		for(Map.Entry<Integer, Integer> input: map.entrySet()) {
			if(input.getValue()>size) {
				System.out.println("The Majority of Element for the given array is:"+input.getKey());
				
			}
		}
	}
	
}
