package aparrays;

public class ValidParenthesis {
	public static int a =0;
	public static int b =0;
	public static int c =0;

	public static void main(String[] args) {

		isValid("{[}]");

	}

	public static boolean isValid(String s) {

		boolean n= false;
		for (int i = 0; i < s.length(); i++) {
			String x = Character.toString(s.charAt(i));	
			n= incDecrement(x);
		}
		System.out.println("Valid parenthesis: "+n);
		return n;
	}
	public static boolean incDecrement(String x) {
			
		if (x.equalsIgnoreCase("{") ) {
			a++;
		}
		if (x.equalsIgnoreCase("}") ) {
			a--;
		}
		if (x.equalsIgnoreCase("[") ) {
			b++;
		}
		if (x.equalsIgnoreCase("]") ) {
			b--;
		}
		if (x.equalsIgnoreCase("(") ) {
			c++;
		}
		if (x.equalsIgnoreCase(")") ) {
			c--;
		}
		if ((a==0)&&(b==0)&&(c==0)) {
			return true;
		}
		return false;
	}

}
