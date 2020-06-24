import java.util.Scanner;

public class ReverseString {
	static String reverse = " ";

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the String to reverse");
		String input = scan.nextLine();
		String output1 = doReverse(input);
		System.out.println(output1);
	}
	
	public static String doReverse(String data) {
		for(int i=data.length()-1; i>=0; i--) {
			reverse = reverse + data.charAt(i);
		}
		
		return reverse;
	}
	
}
