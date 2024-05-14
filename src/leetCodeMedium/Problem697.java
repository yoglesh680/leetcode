package leetCodeMedium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem697 {
	public static int findShortestSubArray(int[] nums) {

		Map<Integer, Integer> index = new HashMap<Integer, Integer>();
		Map<Integer, Integer> startIndex = new HashMap<Integer, Integer>();
		Map<Integer, Integer> endIndex = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (startIndex.isEmpty() || !startIndex.containsKey(nums[i])) {
				startIndex.put(nums[i], i);

			}
			endIndex.put(nums[i], i);
			index.put(nums[i], index.getOrDefault(nums[i], 0) + 1);
		}
		int max = Collections.max(index.values());
		int min_length = nums.length;
		for (Map.Entry<Integer, Integer> entry : index.entrySet()) {
			if (entry.getValue() == max) {

				min_length = Math.min(min_length, endIndex.get(entry.getKey()) - startIndex.get(entry.getKey()) + 1);
			}
		}
		return min_length;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 1 };
		int num = findShortestSubArray(nums);
		System.out.println(num);
	}
}
