package aparrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] SelectionArray = { -11, 100, 7, 6, 2, 9, 1, 0, 11, 5 };

		for (int i = SelectionArray.length - 1; i > 0; i--) {
			
			int largest=0;

			for (int j = 1; j <= i; j++) {
				if (SelectionArray[largest] < SelectionArray[j]) {
					largest = j;
				}
			}
			swap(SelectionArray, i, largest);
			for (int k = 0; k < SelectionArray.length; k++) {
				System.out.println(k+"-"+SelectionArray[k]);
			}
		}
	}

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;

	}

}
