package aparrays;

public class IfPalindrome {

	public static void main(String[] args) {
		
		int input = -1234321;
		
		if (compareInts(input, revInt(input))) {
			System.out.println(input +"is a palindrome number");
		} else {
			System.out.println(input +"is not a palindrome number");
		}
	}
	public static int revInt(int x) {
		
		String reverse = new StringBuilder().append(x).reverse().toString();	
		try{
			return Integer.parseInt(reverse);
		} catch (NumberFormatException e) {
			return 0;
		}
		
	}
	
	public static boolean compareInts(int a, int b) {
		return(a==b)?true:false;
		
	}

}
