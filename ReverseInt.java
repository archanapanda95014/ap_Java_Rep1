package aparrays;

public class ReverseInt {

	public static void main(String[] args) {
		
		System.out.println(revStr(3450));

	}
	
	public static int revStr(int x) {
		String revString = new StringBuilder().append(Math.abs(x)).reverse().toString();
		try {
			return (x<0)? Integer.parseInt(revString)*-1: Integer.parseInt(revString);
		}
		catch(NumberFormatException e) {
			return 0;
		}
	}

}
