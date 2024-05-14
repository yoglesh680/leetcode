package medium;

public class Problem164 {
	public static int maximumGap(int[] nums) {
		int max = 0;
		for (int i = 1; i < nums.length; i++) {
			max = Math.max(nums[i] - nums[i - 1], max);
		}
		return max;

	}

	public static void main(String[] args) {
		int[] nums = { 3, 6, 9, 1 };
		int value = maximumGap(nums);
		System.out.println("MAX" + value);
	}

}
