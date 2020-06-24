
public class LargestAndSmallestElementInArray {
	
	static int max, min;
	
	public static void main(String[] args) {
		
		int [] a = {89, 9, 56, 87, 1000};
		
		max = a[0]; // here we assigning first value of array to compare with rest of the element to find the Maximum.
		min = a[0]; // here we assigning first value of array to compare with rest of the element to find the Minimum.
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.println("The maximum element is:"+ max);
		System.out.println("The minimum element is:"+ min);

	}

}
