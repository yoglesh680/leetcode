package leetCodeMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem2605 {
	public static int minNumber(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums1) {
			set.add(num);

		}
		for (int num : nums2) {
			if (!set.add(num)) {
				return num;
			}
		}
		if (nums1[0] > nums2[0]) {
			return Integer.parseInt(nums2[0] + "" + nums1[0]);
		} else {
			return Integer.parseInt(nums1[0] + "" + nums2[0]);
		}

	}

	public static void main(String[] args) {
		int[] nums1 = { 3, 5, 2, 6 };
		int[] nums2 = { 4, 1, 7 };
		int num = minNumber(nums1, nums2);
		System.out.println(num);
	}

}
