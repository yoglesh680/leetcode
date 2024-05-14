package leetCodeMedium;

import java.util.Arrays;

public class Problem2974 {
	public static int[] numberGame(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i+=2) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i+1] = temp;
		}
		return nums;

	}

	public static void main(String[] args) {
		int[] nums = { 5, 4, 2, 3 };// output : 3,2,5,4
		int[] result = numberGame(nums);
		System.out.println(Arrays.toString(result));
	}

}
