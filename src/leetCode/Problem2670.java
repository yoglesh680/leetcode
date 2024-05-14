package leetCode;

public class Problem2670 {
	public static int[] distinctDifferenceArray(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length-1; j >= 0; j--) {
				result[i] = nums[i] - nums[j];
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] result = distinctDifferenceArray(nums);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
