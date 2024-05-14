package leetCodeMedium;

public class Problem209 {
	public static int minSubArrayLen(int target, int[] nums) {
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int right = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= target) {
				min = Math.min(min, i + 1 - right);
				sum -= nums[right];
				right++;
			}

		}

		return (min != Integer.MAX_VALUE) ? min : 0;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };// 3
		int target = 11;
		int result = minSubArrayLen(target, nums);
		System.out.println(result);
	}

}
