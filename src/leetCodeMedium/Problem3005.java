package leetCodeMedium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem3005 {
	public static int maxFrequencyElements(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int count = 0;
		int max = Collections.max(map.values());
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				count += max;
			}
		}
		if (count == 0) {
			return nums.length;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 17, 17, 2, 12, 20, 17, 12 }; // output: 3
		int num = maxFrequencyElements(nums);
		System.out.println(num);
	}

}
