package leetCodeMedium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem718 {
	public static int findLength(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		for (int num : nums2) {
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		Set<Integer> set = new HashSet<Integer>(map.values());
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] == nums2[i]) {
				return nums1.length;
			}
		}
		return set.size();
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 2, 1 };
		int[] nums2 = { 3, 2, 1, 4, 7 };
		int length = findLength(nums1, nums2);
		System.out.println(length);
	}

}
