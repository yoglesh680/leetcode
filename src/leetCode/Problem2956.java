package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem2956 {
	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int num : nums1) {
			set1.add(num);
		}
		int count1 = 0;
		for (int num : nums2) {
			set2.add(num);
			if (set1.contains(num)) {
				count1++;
			}
		}
		int count = 0;
		for (int num : nums1) {
			if (set2.contains(num)) {
				count++;
			}
		}

		return new int[] { count, count1 };

	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 3, 1 };
		int[] nums1 = { 2, 2, 5, 2, 3, 6 };
		int[] data = findIntersectionValues(nums, nums1);
		for (int i : data) {
			System.out.print(i + " ");
		}

	}

}
