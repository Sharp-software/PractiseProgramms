
public class PattrenPyramidReverse {

	public static void main(String[] args) {
		int row= 10;
		
		for(int i=row; i>=0; i--) {
			for(int j =1; j<=row-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
