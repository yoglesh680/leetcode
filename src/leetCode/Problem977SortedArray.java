package leetCode;

import java.util.Arrays;

public class Problem977SortedArray {
	public static int[] sortedSquares(int[] nums) {
		int[] resul = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			resul[i] = nums[i] * nums[i];
		}
		Arrays.sort(resul);
		return resul;
	}

	public static void main(String[] args) {
      
	}

}
