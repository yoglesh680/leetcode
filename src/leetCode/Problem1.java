package leetCode;

import java.util.HashMap;

public class Problem1 {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int num = target - nums[i];
			if (hashMap.containsKey(num)) {
				int[] arr = { hashMap.get(num), i };
				return arr;
			}
			hashMap.put(nums[i], i);
		}
		return null;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int[] result = twoSum(nums, 9);
		for (int i : result) {
			System.out.print(i + " ");
		}
		
	}
}
