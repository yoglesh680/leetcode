package leetCodeMedium;

import java.util.Arrays;

public class Problem2996 {
	public static int missingInteger(int[] nums) {

		Arrays.sort(nums);
		int sum1 = nums[0];
		int sum = sum1 + 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1] + 1) {
				sum = +nums[i];
			}

			else {
				sum += sum + 1;
				break;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 12, 14, 13 };
		int num = missingInteger(nums);
		System.out.println(num);
	}

}
