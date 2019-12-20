package aparrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] BSArray = new int[]{34, 25, -2, 0, 56, 91, 3};
		
		int temp = 0;
		for (int j = 0; j < BSArray.length - 1; j++) {
			for (int i = 0; i < BSArray.length - 1; i++) {
				if (BSArray[i] > BSArray[i + 1]) {
					temp = BSArray[i];
					BSArray[i] = BSArray[i + 1];
					BSArray[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < BSArray.length; i++) {
			System.out.println(BSArray[i]);
		}
	}

}
