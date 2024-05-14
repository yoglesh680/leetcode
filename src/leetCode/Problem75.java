package leetCode;

import java.util.Arrays;

public class Problem75 {
	public static void sortColors(int[] nums) {
		Arrays.sort(nums);

	}

	public static void main(String[] args) {
		int[] num = { 2, 0, 2, 1, 1, 0 };
		 sortColors(num);
	}
}
