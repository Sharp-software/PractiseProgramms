
public class Malabar {

	
	public static void main(String[] args) {
		String str = "MALABAR";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='A') {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
			}else {
				System.out.print(str.charAt(i));
			}
		}
	}
}
