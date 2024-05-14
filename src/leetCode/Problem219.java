package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!hm.containsKey(nums[i])) {
				hm.put(nums[i], i);
			} else {
				int index = hm.get(nums[i]);
				if (Math.abs(index - i) <= k) {
					return true;
				} else {
					hm.put(nums[i], i);
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		boolean data = containsNearbyDuplicate(nums, k);
		System.out.println(data);
	}
}
