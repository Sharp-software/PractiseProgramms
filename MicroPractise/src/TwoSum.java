import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int [] array = {80, 100, 40, 50, 20, 50, 60};
		
		int sum = 100;// sum is given by the interviewer. we have to find the pair that sum should be equal to 50, which is given in above array.
		
		  Arrays.sort(array); // Sorting to arrange the elements in sequence.

		for (int i = 0; i < array.length; i++) {
			
			for(int j =i+1; j<array.length; j++) {
				
				if(array[j] == sum - array[i]) {
					System.out.println("("+array[i]+ "," +array[j]+")");
				}
			}
			
		}
	}
}
