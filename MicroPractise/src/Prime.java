import java.util.Scanner;

public class Prime {
	static int input;
	
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to verify the prime or not");
	int input = scan.nextInt();
	boolean output = isPrime(input);
	if(!output) {
		System.out.println("The given number is not a prime");
	}else {
		System.out.println("The given number is a prime");
	}
	checkPrime(100);
}
 
 public static boolean isPrime(int num) {
	for(int i=2; i<num/2 ; i++) {
		if(num%i==0) {
			return true;
	}
	}
	 return false;
 }
 
 public static void checkPrime(int num2) {
for(int i=0; i<=num2; i++) {
	if(!isPrime(i)) {
		System.out.println(i+" ");
	}
}
 
 
 }
 }
