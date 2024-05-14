package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem169 {
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int max = Collections.max(map.values());
		int num = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				num = entry.getKey();
			}
		}
		return num;
//		int candidate=nums[0];
//        int count=1;
//		for (int i = 1; i < nums.length; i++) {
//            if (count == 0) {
//                candidate = nums[i];
//                count = 1;
//            } else if (nums[i] == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        return candidate;
		
	}

	public static void main(String[] args) {
		int[] nums = { 3,3,4 };
		int value = majorityElement(nums);
		System.out.println(value);
//output 2
	}
}
