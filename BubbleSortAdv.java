package aparrays;

public class BubbleSortAdv {

	public static void main(String[] args) {
		int[] BSArray = new int[]{34, 25, -2, 0, 56, 91, 3};
		
		for (int j = 0; j < BSArray.length - 1; j++) {
			for (int i = 0; i < BSArray.length - 1; i++) {
				if (BSArray[i] > BSArray[i + 1]) {
					swap(BSArray, i, i + 1);
				}
			}
		}
		for (int i = 0; i < BSArray.length; i++) {
			System.out.println(BSArray[i]);
		}
	}
		
	public static void swap(int[] BSArray, int i, int j) {
		int temp =0;

			temp = BSArray[i];
			BSArray[i] = BSArray[j];
			BSArray[j] = temp;
		
	
	}

}

