package leetCodeMedium;

import java.util.Arrays;

public class Problem1051 {
	public static int heightChecker(int[] heights) {
		int[] expected = heights.clone();
		int count = 0;
		Arrays.sort(expected);
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != expected[i]) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 4, 2, 1, 3 };
		int result = heightChecker(nums);
		System.out.println(result);
	}

}
