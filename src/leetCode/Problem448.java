package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		boolean[] present = new boolean[nums.length + 1];
		for (int num : nums) {
			present[num] = true;
		}
		for (int i = 1; i < nums.length; i++) {
			if (!present[i]) {
				list.add(i);

			}
		}

		return list;

	}

	public static void main(String[] args) {
		int[] num = { 1, 1 };
		List<Integer> data = findDisappearedNumbers(num);
		System.out.println(data);
	}

}
