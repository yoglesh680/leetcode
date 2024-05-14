package leetCodeMedium;

import java.util.Arrays;

public class Problem3066 {
	public static int minOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int operations = 0;
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int sum = nums[left] + nums[right];
			if (sum < k) {
				int diff = k - sum;
				int increment = (diff + 1) / 2; // Increment required to make sum >= k
				nums[left] += increment;
				nums[right] += diff - increment;
				operations++;
			}
			left++;
			right--;
		}

		return operations;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 4, 9 };
		int k = 20;
		int num = minOperations(nums, k);

		System.out.println(num);
	}
}
