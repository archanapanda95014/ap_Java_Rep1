package aparrays;

public class RecursionCall {

	public static void main(String[] args) {
		int result =0;
		result = recursiveFactorial(5);
		
		System.out.println(result);

	}
	
	public static int recursiveFactorial(int num) {
		if (num==0) {
			return 1;
		}
		return num*recursiveFactorial(num-1);
	}

}
