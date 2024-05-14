package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem39 {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		List<Integer> addlist = new ArrayList<Integer>();
		List<Integer> targetlist = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < candidates.length; i++) {
			sum += candidates[i];
			if (sum < target) {
				addlist.add(candidates[i]);
			} else if (sum > target) {
				sum -= candidates[i];
				addlist.add(candidates[0]);
				break;
			} else if (sum == target) {
				addlist.add(candidates[0]);
				break;
			}

		}
		list.add(addlist);
		targetlist.add(target);
		list.add(targetlist);
		return list;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> result = combinationSum(nums, target);
		System.out.println(result);

	}
}
