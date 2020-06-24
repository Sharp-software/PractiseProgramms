import java.util.Scanner;

public class Prime123 {
	
	static int input;

	public static void main(String[] args) {
		primeRange(100);
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = scan.nextInt();
		isPrime(input);*/
	}
	
	public static boolean isPrime(int num) {
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void primeRange(int temp) {
		for(int i=2; i<=temp; i++) {
			if(!isPrime(i)) {
				System.out.println(i+" ");
			}
		}
	}
	
}
