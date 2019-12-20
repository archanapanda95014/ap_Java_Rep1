package aparrays;

public class Array1 {

	public static void main(String[] args) {
		int[] intArray = new int[7];
		
		intArray[0] = 45;
		intArray[1] = 5;
		intArray[2] = 4;
		intArray[3] = 35;
		intArray[4] = 95;
		intArray[5] = 95;
		intArray[6] = 95;
		
		int found=-1;
		for (int i=0;i<7;i++) {
			if (intArray[i] == 35) {
				found =i;
			}
		}
		System.out.println("found: "+found);

	}

}
