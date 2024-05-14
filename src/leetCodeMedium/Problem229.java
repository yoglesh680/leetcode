package leetCodeMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem229 {
	public static List<Integer> majorityElement(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int threshold = nums.length / 3;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int element = entry.getKey();
			int count = entry.getValue();
			if (count > threshold) {
				list.add(element);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		List<Integer> list = majorityElement(nums);
		System.out.println(list);
	}

}
