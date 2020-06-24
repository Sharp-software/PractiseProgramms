import java.util.Scanner;

public class MaximumDiffInAnArray {
	
	static int n, max, min;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number of elements");
		
		int n = scan.nextInt(); //Here we asking user to tell number of elements in an array.
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements of array");
		
		for(int i =0; i<n; i++) {
			a[i] = scan.nextInt(); //Here we asking user to tell elements in an array to find the maximum difference.
		}
		
		//To find the maximum element.
		
		max =a[0]; min=a[0];
		
		for(int i=0; i<n; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
			//To find the minimum element.
			
			for(int j=0; j<n; j++) {
				if(a[j]<min) {
					min = a[j];
				}
			}
				System.out.println("The maximum element is:"+ max);
				System.out.println("The minimum element is:"+ min);
				System.out.println("The maximum difference is:"+ (max-min));	
		
	}
	}

