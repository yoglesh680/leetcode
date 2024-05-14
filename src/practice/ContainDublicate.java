package practice;

import java.util.HashSet;

public class ContainDublicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		boolean flag = containsDuplicate(nums);
		System.out.println(flag);
	}
}
