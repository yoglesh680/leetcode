package leetCodeMedium;

import java.util.HashSet;
import java.util.Set;

public class Problem349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		for (int num : nums1) {
			s1.add(num);
		}
		for (int num : nums2) {
			if (s1.contains(num)) {
				s2.add(num);
			}
		}
		int[] result = new int[s2.size()];
		int index = 0;
		for (int num : s2) {
			result[index++] = num;
		}
		return result;

	}

	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] result = intersection(nums1, nums2);
		for (int num : result) {
			System.out.print(num);
		}
	}

}
