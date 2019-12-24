package aparrays;

public class RemoveElement {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[] { 1, 1, 1, 2, 3, 3, 4 }, 4));
	}

	public static int removeElement(int[] nums, int element) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != element) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i ;
	}
}
