import java.util.Scanner;

public class Palidrome {
	static String input;
	static String reverse=" ";
	static String beforeReverse;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		 input = scan.nextLine();
		 beforeReverse = input;
		 VerifyPalindrome(input);
	}
	
	public static void  VerifyPalindrome(String input) {
		for(int i=input.length()-1; i>=0; i--) {
			reverse += input.charAt(i);		
		}
		System.out.println(reverse);
		if(beforeReverse.equalsIgnoreCase(reverse.trim())) {
			System.out.println(beforeReverse+" is a Palindrom");
		}else {
			System.out.println(beforeReverse+" is not Palindrom");
		}
	}
}
