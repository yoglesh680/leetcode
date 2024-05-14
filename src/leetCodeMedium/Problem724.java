package leetCodeMedium;

public class Problem724 {

	public static int pivotIndex(int[] nums) {
		int leftSum = 0;
		int rightSum = 0;
		int sum = 0;

		for (int i = 0; i < nums.length / 2; i++) {
			leftSum += nums[i];
		}
		for (int i = nums.length / 2; i > 0; i--) {
			rightSum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum == leftSum || sum == rightSum) {
				return ++i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		int num = pivotIndex(nums);
		System.out.println(num);
	}
}
