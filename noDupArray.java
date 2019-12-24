package aparrays;

public class noDupArray {

	public static void main(String[] args) {
		
		System.out.println(removeDuplicates(new int[] {1,1,2,2,3,3,4,4}));
	}
	
	public static int removeDuplicates(int[] nums) {

		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}

}
