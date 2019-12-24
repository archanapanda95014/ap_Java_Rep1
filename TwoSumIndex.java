package aparrays;

public class TwoSumIndex {

	public static void main(String[] args) {

		int[] result = twoSum(new int[]{4,3,7,11,9,0}, 20);
		
		for (int k=0;k<result.length;k++) {
			System.out.println(result[k]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					
				}

			}
		}
		return result;
	}

}
