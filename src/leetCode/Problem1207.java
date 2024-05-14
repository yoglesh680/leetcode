package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem1207 {

	public static boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);

		}
		Set<Integer> value = new HashSet<Integer>(map.values());
		if (value.size() == map.size()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1,2,2,1,1,3};
		boolean flag = uniqueOccurrences(nums);
		System.out.println(flag);
	}

}
