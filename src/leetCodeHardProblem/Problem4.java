package leetCodeHardProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int num : nums1) {
			list.add(num);
		}
		for (int num : nums2) {
			list.add(num);
		}
		double value = list.size() / 2;
		return value;

	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		double value = findMedianSortedArrays(nums1, nums2);
		System.out.println(value);
	}

}
